package proto.org.onosproject.grpc.models;

import org.onlab.packet.IpAddress;
import org.onosproject.grpc.models.ConnectPointProtoOuterClass;
import org.onosproject.net.ConnectPoint;
import org.onosproject.net.DeviceId;
import org.onosproject.net.HostId;
import org.onosproject.net.IpElementId;
import org.onosproject.net.PortNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class ConnectPointProtoTranslator {
    private static final Logger log = LoggerFactory.getLogger(ConnectPointProtoTranslator.class);

    /**
     * Translates gRPC ConnectPoint message to Optional of {@link org.onosproject.net.ConnectPoint}.
     *
     * @param connectPoint gRPC message
     * @return Optional of equivalent {@link org.onosproject.net.ConnectPoint} or empty if ElementId is not recognized
     */
    public static Optional<ConnectPoint> translate(ConnectPointProtoOuterClass.ConnectPointProto connectPoint) {
        switch (connectPoint.getElementIdCase()) {
            case DEVICE_ID:
                return Optional.of(new ConnectPoint(DeviceId.deviceId(connectPoint.getDeviceId()),
                                                    PortNumber.portNumber(connectPoint.getPortNumber())));
            case HOST_ID:
                return Optional.of(new ConnectPoint(HostId.hostId(connectPoint.getHostId()),
                                                    PortNumber.portNumber(connectPoint.getPortNumber())));
            case IP_ELEMENT_ID:
                return Optional.of(new ConnectPoint(IpElementId.ipElement(IpAddress
                                                                                  .valueOf(connectPoint
                                                                                                   .getIpElementId()
                                                                                  )),
                                                    PortNumber.portNumber(connectPoint.getPortNumber())));
            default:
                return Optional.empty();
        }
    }

    /**
     * Translates {@link org.onosproject.net.ConnectPoint} to gRPC ConnectPoint message.
     *
     * @param connectPoint {@link org.onosproject.net.ConnectPoint}
     * @return gRPC ConnectPoint message
     */
    public static ConnectPointProtoOuterClass.ConnectPointProto translate(ConnectPoint connectPoint) {

        if (connectPoint.elementId() instanceof DeviceId) {
            return ConnectPointProtoOuterClass.ConnectPointProto.newBuilder().setDeviceId(connectPoint.deviceId().toString())
                    .setPortNumber(connectPoint.port().toString())
                    .build();
        } else if (connectPoint.elementId() instanceof HostId) {
            return ConnectPointProtoOuterClass.ConnectPointProto.newBuilder().setHostId(connectPoint.hostId().toString())
                    .setPortNumber(connectPoint.port().toString())
                    .build();
        } else if (connectPoint.ipElementId() != null) {
            return ConnectPointProtoOuterClass.ConnectPointProto.newBuilder().setIpElementId(connectPoint.ipElementId().toString())
                    .setPortNumber(connectPoint.port().toString())
                    .build();
        } else {
            log.warn("Unrecognized ElementId", connectPoint);
            throw new IllegalArgumentException("Unrecognized ElementId");
        }
    }

    // Utility class not intended for instantiation.
    private ConnectPointProtoTranslator() {}
}
