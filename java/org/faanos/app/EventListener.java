package org.faanos.app;

import io.grpc.stub.StreamObserver;
import org.onlab.osgi.DefaultServiceDirectory;
import org.onlab.packet.Ethernet;
import org.onosproject.grpc.models.EventListenerGrpc;
import org.onosproject.grpc.models.EventListenerProto;
import org.onosproject.grpc.models.EventListenerProto.Listener;
import org.onosproject.grpc.models.EventListenerProto.RegRequest;
import org.onosproject.grpc.models.EventListenerProto.RegResponse;
import org.onosproject.grpc.models.EventListenerProto.TopicE;
import org.onosproject.grpc.models.EventListenerProto.topicsType;
import org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto;
import org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto;
import org.onosproject.grpc.models.StatusProto.PacketOutStatus;
import org.onosproject.net.DeviceId;
import org.onosproject.net.packet.InboundPacket;
import org.onosproject.net.packet.OutboundPacket;
import org.onosproject.net.packet.PacketContext;
import org.onosproject.net.packet.PacketProcessor;
import org.onosproject.net.packet.PacketService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static proto.org.onosproject.grpc.models.OutboundPacketProtoTranslator.*;
import static proto.org.onosproject.grpc.models.PacketContextProtoTranslator.*;

@Component(immediate = true)
public class EventListener extends EventListenerGrpc.EventListenerImplBase {

    private final Logger log = LoggerFactory.getLogger(getClass());
    private int cnt=0;

    protected static Map<String, StreamObserver<Listener>>
            observerMap = new HashMap<>();
    protected static Set<String> clientList = new HashSet<>();

    @Reference(cardinality = ReferenceCardinality.MANDATORY)
    protected PacketService packetService;

    private final InternalPacketProcessor packetListener = new InternalPacketProcessor();

    ExecutorService executorService = Executors.newFixedThreadPool(1);

    @Activate
    protected void activate() {
        packetService.addProcessor(packetListener, PacketProcessor.director(7));
        log.info(" *** *** *** EventListener is Started *** *** *** ");
    }

    @Deactivate
    protected void deactivate() {
        packetService.removeProcessor(packetListener);
        log.info(" --- EventListener is Stopped --- ");
    }

    @Override
    public void regEvent( RegRequest registrationRequest,
            StreamObserver<RegResponse> responseObserver) {

        log.info(" ===<<-<<-<< Registration request has been received >>->>->>=== ");
        RegResponse registrationResponse =
                RegResponse.newBuilder()
                        .setServersId("grpc-service")
                        .build();

        clientList.add(registrationRequest.getClientsId());
        log.info("===<<-<<-<< "+registrationRequest.getClientsId()+" is registered >>->>->>===");
        responseObserver.onNext(registrationResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void onEvents(TopicE topic, StreamObserver<Listener> eventObserver) {
        observerMap.put(topic.getClientsId() + topic.getTypes(), eventObserver);
        log.info(" ===<<-<<-<< The client " + topic.getClientsId()
                         + " subscribed to " + topic.getTypes().name()+ " >>->>->>===");
    }

    /**
     * Emits packet out.
     */
    @Override
    public void emitEvent(OutboundPacketProto request,
                          StreamObserver<PacketOutStatus> responseObserver) {

        OutboundPacket outboundPacket = translate(request);

        packetService = DefaultServiceDirectory.getService(PacketService.class);
        packetService.emit(outboundPacket);

        PacketOutStatus reply = PacketOutStatus
                .newBuilder()
                .setStat(true).build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    private class InternalPacketProcessor implements PacketProcessor {
        @Override
        public void process(PacketContext packetContext) {
            if (packetContext == null) {
                return;}

            InboundPacket pkt = packetContext.inPacket();
            Ethernet ethernet = pkt.parsed();
            DeviceId deviceId = packetContext.inPacket().receivedFrom().deviceId();

            if (ethernet.getEtherType() == Ethernet.TYPE_ARP) {
                log.info(" <-<-<> An ARP packet from " + deviceId + " <>->-> ");
            } else if (ethernet.getEtherType() == Ethernet.TYPE_IPV4 || ethernet.getEtherType() == Ethernet.TYPE_IPV6) {
                log.info(" ===<<-<<-<< An IPv4/6 packet received from device " + deviceId + " >>->>->>=== ");
         
            }

            PacketContextProto packetContextProto = translate(packetContext);

            for (String clientId : clientList) {
                String key = clientId + topicsType.PACKET_EVENT_1.toString();
                Listener eventListener = Listener.newBuilder()
                        .setClientsId(clientId)
                        .setPacketContext(packetContextProto)
                        .build();

                if (observerMap.containsKey(key)) {
                    Runnable runnable = () -> {
                                observerMap.get(key).onNext(eventListener);};

                    executorService.execute(runnable);}
            }
        }
    }
}
