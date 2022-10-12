package proto.org.onosproject.grpc.models;

import com.google.protobuf.ByteString;
import org.onosproject.grpc.models.InstructionProtoOuterClass;
import org.onosproject.grpc.models.OutboundPacketProtoOuterClass;
import org.onosproject.net.DeviceId;
import org.onosproject.net.PortNumber;
import org.onosproject.net.flow.DefaultTrafficTreatment;
import org.onosproject.net.flow.TrafficTreatment;
import org.onosproject.net.packet.DefaultOutboundPacket;
import org.onosproject.net.packet.OutboundPacket;

import java.nio.ByteBuffer;
import java.util.List;

public class OutboundPacketProtoTranslator {
    public static OutboundPacketProtoOuterClass.OutboundPacketProto translate(OutboundPacket outboundPacket) {
        OutboundPacketProtoOuterClass.OutboundPacketProto.Builder outboundPacketBuilder =
                OutboundPacketProtoOuterClass.OutboundPacketProto.newBuilder();
        outboundPacketBuilder.setDeviceId(outboundPacket.sendThrough().toString());
        outboundPacketBuilder.setData(ByteString.copyFrom(outboundPacket.data()));


        return  outboundPacketBuilder.build();


    }

    public static OutboundPacket translate(OutboundPacketProtoOuterClass.OutboundPacketProto outboundPacketProto)
    {
        DeviceId deviceId = DeviceId.deviceId(outboundPacketProto.getDeviceId());
        TrafficTreatment.Builder trafficTreatmentBuilder = DefaultTrafficTreatment.builder();

        List<InstructionProtoOuterClass.InstructionProto> instructionProtoList =
                outboundPacketProto.getTreatment().getAllInstructionsList();

        for(InstructionProtoOuterClass.InstructionProto instructionProto: instructionProtoList)
        {
            switch (instructionProto.getInstructionCase())
            {
                case OUTPUT:
                    trafficTreatmentBuilder
                            .setOutput(PortNumber.portNumber(instructionProto.getOutput().getPort().getPortNumber()));
            }
        }

        OutboundPacket outboundPacket = new
                DefaultOutboundPacket(deviceId, trafficTreatmentBuilder.build()
                , ByteBuffer.wrap(outboundPacketProto.getData().toByteArray()));

        return  outboundPacket;

    }

    private OutboundPacketProtoTranslator() {};
}
