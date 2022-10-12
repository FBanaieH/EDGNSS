package org.faanosClientStub;


import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.onlab.packet.DeserializationException;
import org.onlab.packet.Ethernet;
import org.onosproject.grpc.models.EventListenerGrpc;
import org.onosproject.grpc.models.EventListenerGrpc.EventListenerStub;
import org.onosproject.grpc.models.EventListenerProto;
import org.onosproject.grpc.models.EventListenerProto.Listener;
import org.onosproject.grpc.models.EventListenerProto.RegRequest;
import org.onosproject.grpc.models.EventListenerProto.RegResponse;
import org.onosproject.grpc.models.EventListenerProto.TopicE;
import org.onosproject.grpc.models.PacketContextProtoOuterClass.PacketContextProto;

import java.io.IOException;


public class faanosClientStubManager {

    static String serverId = null;
    static String clientId = "faanos-client";
    static int count=0;
    static int ucount=1;
    public static void main(String[] args) throws InterruptedException {

        ManagedChannel channel;
        EventListenerStub packetNotificationStub;

        final OkHttpClient client = new OkHttpClient();

        HttpUrl url1 = HttpUrl.parse("http://127.0.0.1:8080/function/starbot")
                .newBuilder()
                .build();
       
        // Create a managed gRPC channel.
        channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        packetNotificationStub = EventListenerGrpc.newStub(channel);

        //create a registration request
        RegRequest request = RegRequest
                .newBuilder()
                .setClientsId(clientId)
                .build();
        System.out.println("---+--- Request is created for "+ clientId+" ---+---");

        // Registers the client on grpc services
        packetNotificationStub.regEvent(request, new StreamObserver<RegResponse>() {
            @Override
            public void onNext(RegResponse value) {
                serverId = value.getServersId();
                System.out.println("==<< the registered server id is "+serverId+" >>==");}

            @Override
            public void onError(Throwable t) {
                    t.printStackTrace();
                }

            @Override
            public void onCompleted() {}
            });

        // Creates a packet event topic
        TopicE packetTopic = TopicE.newBuilder()
                        .setClientsId(clientId)
                        .setTypes(EventListenerProto.topicsType.PACKET_EVENT_1)
                        .build();
        System.out.println("---+--- Interested topic for "+ clientId+ " is "+ packetTopic.getTypes()+" ---+---");

        // Implements a packet processor
        class PacketEvent implements Runnable {

            @Override
            public void run() {

                packetNotificationStub.onEvents( packetTopic, new StreamObserver<Listener>() {
                    @Override
                    public void onNext(Listener value) {
                        PacketContextProto packetContextProto = value.getPacketContext();

                        byte[] packetByteArray = packetContextProto.getInboundPacket().getData().toByteArray();

                        Ethernet eth = new Ethernet();

                        try {
                            eth = Ethernet.deserializer()
                                    .deserialize(packetByteArray, 0, packetByteArray.length);
                        } catch (DeserializationException e) {
                                    e.printStackTrace();}

                        if (eth == null) {return;}

                        long type = eth.getEtherType();

                        if(type == Ethernet.TYPE_IPV4 || type==Ethernet.TYPE_IPV6 || type==Ethernet.TYPE_ARP) {
                            count++;
                            System.out.println("------------------------------");
                            System.out.print(count+"th IPv4/6 Packet has been received in :"+System.currentTimeMillis());
                            System.out.print("- - - - - - -");
                            System.out.println("Invoking function -- IP #1");
              
                             Request request1 = new Request.Builder()
                                      .url(url1)
                                      .build();
                             var call1=client.newCall(request1);
                             try{
                                var res=call1.execute();
                             } catch (IOException e) {}
                             
                            System.out.println("--- packet "+count+" executed in "+System.currentTimeMillis());
                        }
                    }

                    @Override
                    public void onError(Throwable t) {t.printStackTrace();}

                    @Override
                    public void onCompleted() {}
                        });

                while (true) {}
            }
        }
        // Creates an instance of internal packet event class.
        PacketEvent packetEvent = new PacketEvent();
        Thread t = new Thread(packetEvent);
        t.start();

        Thread.sleep(5000);
    }
}
