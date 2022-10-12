package org.onosproject.grpc.models;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Corresponds to PacketOut service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: ServiceProto.proto")
public final class PacketOutServiceGrpc {

  private PacketOutServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.PacketOutService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto,
      org.onosproject.grpc.models.StatusProto.PacketOutStatus> getEmitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "emit",
      requestType = org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.class,
      responseType = org.onosproject.grpc.models.StatusProto.PacketOutStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto,
      org.onosproject.grpc.models.StatusProto.PacketOutStatus> getEmitMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto, org.onosproject.grpc.models.StatusProto.PacketOutStatus> getEmitMethod;
    if ((getEmitMethod = PacketOutServiceGrpc.getEmitMethod) == null) {
      synchronized (PacketOutServiceGrpc.class) {
        if ((getEmitMethod = PacketOutServiceGrpc.getEmitMethod) == null) {
          PacketOutServiceGrpc.getEmitMethod = getEmitMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto, org.onosproject.grpc.models.StatusProto.PacketOutStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PacketOutService", "emit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.StatusProto.PacketOutStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new PacketOutServiceMethodDescriptorSupplier("emit"))
                  .build();
          }
        }
     }
     return getEmitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PacketOutServiceStub newStub(io.grpc.Channel channel) {
    return new PacketOutServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PacketOutServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PacketOutServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PacketOutServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PacketOutServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Corresponds to PacketOut service
   * </pre>
   */
  public static abstract class PacketOutServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void emit(org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.StatusProto.PacketOutStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getEmitMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEmitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto,
                org.onosproject.grpc.models.StatusProto.PacketOutStatus>(
                  this, METHODID_EMIT)))
          .build();
    }
  }

  /**
   * <pre>
   * Corresponds to PacketOut service
   * </pre>
   */
  public static final class PacketOutServiceStub extends io.grpc.stub.AbstractStub<PacketOutServiceStub> {
    private PacketOutServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PacketOutServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PacketOutServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PacketOutServiceStub(channel, callOptions);
    }

    /**
     */
    public void emit(org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.StatusProto.PacketOutStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Corresponds to PacketOut service
   * </pre>
   */
  public static final class PacketOutServiceBlockingStub extends io.grpc.stub.AbstractStub<PacketOutServiceBlockingStub> {
    private PacketOutServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PacketOutServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PacketOutServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PacketOutServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.onosproject.grpc.models.StatusProto.PacketOutStatus emit(org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto request) {
      return blockingUnaryCall(
          getChannel(), getEmitMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Corresponds to PacketOut service
   * </pre>
   */
  public static final class PacketOutServiceFutureStub extends io.grpc.stub.AbstractStub<PacketOutServiceFutureStub> {
    private PacketOutServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PacketOutServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PacketOutServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PacketOutServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.StatusProto.PacketOutStatus> emit(
        org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto request) {
      return futureUnaryCall(
          getChannel().newCall(getEmitMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EMIT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PacketOutServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PacketOutServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EMIT:
          serviceImpl.emit((org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.StatusProto.PacketOutStatus>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PacketOutServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PacketOutServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.onosproject.grpc.models.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PacketOutService");
    }
  }

  private static final class PacketOutServiceFileDescriptorSupplier
      extends PacketOutServiceBaseDescriptorSupplier {
    PacketOutServiceFileDescriptorSupplier() {}
  }

  private static final class PacketOutServiceMethodDescriptorSupplier
      extends PacketOutServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PacketOutServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PacketOutServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PacketOutServiceFileDescriptorSupplier())
              .addMethod(getEmitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
