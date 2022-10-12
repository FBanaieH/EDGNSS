package proto.org.onosproject.grpc.models;

import org.onosproject.grpc.models.PacketContextProtoOuterClass;
import org.onosproject.net.packet.PacketContext;

public class PacketContextProtoTranslator {
    public static PacketContextProtoOuterClass.PacketContextProto translate(PacketContext context) {
        PacketContextProtoOuterClass.PacketContextProto.Builder packetContextBuilder = PacketContextProtoOuterClass.PacketContextProto.newBuilder();
        org.onosproject.grpc.models.InboundPacketProtoOuterClass.InboundPacketProto inboundPacketProto =
                InboundPacketProtoTranslator.translate(context.inPacket());
        org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto outboundPacketProto =
                OutboundPacketProtoTranslator.translate(context.outPacket());
        packetContextBuilder.setInboundPacket(inboundPacketProto)
                .setOutboundPacket(outboundPacketProto)
                .setTime(context.time());

        return packetContextBuilder.build();
    }



    private PacketContextProtoTranslator() {};
}
