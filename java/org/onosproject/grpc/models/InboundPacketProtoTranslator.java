package proto.org.onosproject.grpc.models;

import com.google.protobuf.ByteString;
import org.onosproject.grpc.models.InboundPacketProtoOuterClass;
import org.onosproject.net.packet.InboundPacket;

public class InboundPacketProtoTranslator {
    public static InboundPacketProtoOuterClass.InboundPacketProto translate(InboundPacket inboundPacket) {

        org.onosproject.grpc.models.ConnectPointProtoOuterClass.ConnectPointProto connectPointProto =
                ConnectPointProtoTranslator.translate(inboundPacket.receivedFrom());

        InboundPacketProtoOuterClass.InboundPacketProto.Builder inboundPacketBuilder =
                InboundPacketProtoOuterClass.InboundPacketProto.newBuilder();
        inboundPacketBuilder.setConnectPoint(connectPointProto)
                .setData(ByteString.copyFrom(inboundPacket.unparsed()));

        return inboundPacketBuilder.build();
    }

    private InboundPacketProtoTranslator() {};
}
