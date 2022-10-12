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
 *Corresponds to EventListener service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: ServiceProto.proto")
public final class EventListenerGrpc {

  private EventListenerGrpc() {}

  public static final String SERVICE_NAME = "proto.EventListener";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.EventListenerProto.RegRequest,
      org.onosproject.grpc.models.EventListenerProto.RegResponse> getRegEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "regEvent",
      requestType = org.onosproject.grpc.models.EventListenerProto.RegRequest.class,
      responseType = org.onosproject.grpc.models.EventListenerProto.RegResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.EventListenerProto.RegRequest,
      org.onosproject.grpc.models.EventListenerProto.RegResponse> getRegEventMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.EventListenerProto.RegRequest, org.onosproject.grpc.models.EventListenerProto.RegResponse> getRegEventMethod;
    if ((getRegEventMethod = EventListenerGrpc.getRegEventMethod) == null) {
      synchronized (EventListenerGrpc.class) {
        if ((getRegEventMethod = EventListenerGrpc.getRegEventMethod) == null) {
          EventListenerGrpc.getRegEventMethod = getRegEventMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.EventListenerProto.RegRequest, org.onosproject.grpc.models.EventListenerProto.RegResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.EventListener", "regEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.EventListenerProto.RegRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.EventListenerProto.RegResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventListenerMethodDescriptorSupplier("regEvent"))
                  .build();
          }
        }
     }
     return getRegEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.EventListenerProto.TopicE,
      org.onosproject.grpc.models.EventListenerProto.Listener> getOnEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "onEvents",
      requestType = org.onosproject.grpc.models.EventListenerProto.TopicE.class,
      responseType = org.onosproject.grpc.models.EventListenerProto.Listener.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.EventListenerProto.TopicE,
      org.onosproject.grpc.models.EventListenerProto.Listener> getOnEventsMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.EventListenerProto.TopicE, org.onosproject.grpc.models.EventListenerProto.Listener> getOnEventsMethod;
    if ((getOnEventsMethod = EventListenerGrpc.getOnEventsMethod) == null) {
      synchronized (EventListenerGrpc.class) {
        if ((getOnEventsMethod = EventListenerGrpc.getOnEventsMethod) == null) {
          EventListenerGrpc.getOnEventsMethod = getOnEventsMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.EventListenerProto.TopicE, org.onosproject.grpc.models.EventListenerProto.Listener>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "proto.EventListener", "onEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.EventListenerProto.TopicE.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.EventListenerProto.Listener.getDefaultInstance()))
                  .setSchemaDescriptor(new EventListenerMethodDescriptorSupplier("onEvents"))
                  .build();
          }
        }
     }
     return getOnEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto,
      org.onosproject.grpc.models.StatusProto.PacketOutStatus> getEmitEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "emitEvent",
      requestType = org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.class,
      responseType = org.onosproject.grpc.models.StatusProto.PacketOutStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto,
      org.onosproject.grpc.models.StatusProto.PacketOutStatus> getEmitEventMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto, org.onosproject.grpc.models.StatusProto.PacketOutStatus> getEmitEventMethod;
    if ((getEmitEventMethod = EventListenerGrpc.getEmitEventMethod) == null) {
      synchronized (EventListenerGrpc.class) {
        if ((getEmitEventMethod = EventListenerGrpc.getEmitEventMethod) == null) {
          EventListenerGrpc.getEmitEventMethod = getEmitEventMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto, org.onosproject.grpc.models.StatusProto.PacketOutStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.EventListener", "emitEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.StatusProto.PacketOutStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new EventListenerMethodDescriptorSupplier("emitEvent"))
                  .build();
          }
        }
     }
     return getEmitEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventListenerStub newStub(io.grpc.Channel channel) {
    return new EventListenerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventListenerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventListenerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventListenerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventListenerFutureStub(channel);
  }

  /**
   * <pre>
   *Corresponds to EventListener service
   * </pre>
   */
  public static abstract class EventListenerImplBase implements io.grpc.BindableService {

    /**
     */
    public void regEvent(org.onosproject.grpc.models.EventListenerProto.RegRequest request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.EventListenerProto.RegResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegEventMethod(), responseObserver);
    }

    /**
     */
    public void onEvents(org.onosproject.grpc.models.EventListenerProto.TopicE request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.EventListenerProto.Listener> responseObserver) {
      asyncUnimplementedUnaryCall(getOnEventsMethod(), responseObserver);
    }

    /**
     */
    public void emitEvent(org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.StatusProto.PacketOutStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getEmitEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.EventListenerProto.RegRequest,
                org.onosproject.grpc.models.EventListenerProto.RegResponse>(
                  this, METHODID_REG_EVENT)))
          .addMethod(
            getOnEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.onosproject.grpc.models.EventListenerProto.TopicE,
                org.onosproject.grpc.models.EventListenerProto.Listener>(
                  this, METHODID_ON_EVENTS)))
          .addMethod(
            getEmitEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto,
                org.onosproject.grpc.models.StatusProto.PacketOutStatus>(
                  this, METHODID_EMIT_EVENT)))
          .build();
    }
  }

  /**
   * <pre>
   *Corresponds to EventListener service
   * </pre>
   */
  public static final class EventListenerStub extends io.grpc.stub.AbstractStub<EventListenerStub> {
    private EventListenerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventListenerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventListenerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventListenerStub(channel, callOptions);
    }

    /**
     */
    public void regEvent(org.onosproject.grpc.models.EventListenerProto.RegRequest request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.EventListenerProto.RegResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onEvents(org.onosproject.grpc.models.EventListenerProto.TopicE request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.EventListenerProto.Listener> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getOnEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void emitEvent(org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.StatusProto.PacketOutStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmitEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Corresponds to EventListener service
   * </pre>
   */
  public static final class EventListenerBlockingStub extends io.grpc.stub.AbstractStub<EventListenerBlockingStub> {
    private EventListenerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventListenerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventListenerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventListenerBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.onosproject.grpc.models.EventListenerProto.RegResponse regEvent(org.onosproject.grpc.models.EventListenerProto.RegRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.onosproject.grpc.models.EventListenerProto.Listener> onEvents(
        org.onosproject.grpc.models.EventListenerProto.TopicE request) {
      return blockingServerStreamingCall(
          getChannel(), getOnEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.onosproject.grpc.models.StatusProto.PacketOutStatus emitEvent(org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto request) {
      return blockingUnaryCall(
          getChannel(), getEmitEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Corresponds to EventListener service
   * </pre>
   */
  public static final class EventListenerFutureStub extends io.grpc.stub.AbstractStub<EventListenerFutureStub> {
    private EventListenerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventListenerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventListenerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventListenerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.EventListenerProto.RegResponse> regEvent(
        org.onosproject.grpc.models.EventListenerProto.RegRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.StatusProto.PacketOutStatus> emitEvent(
        org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto request) {
      return futureUnaryCall(
          getChannel().newCall(getEmitEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REG_EVENT = 0;
  private static final int METHODID_ON_EVENTS = 1;
  private static final int METHODID_EMIT_EVENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventListenerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventListenerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REG_EVENT:
          serviceImpl.regEvent((org.onosproject.grpc.models.EventListenerProto.RegRequest) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.EventListenerProto.RegResponse>) responseObserver);
          break;
        case METHODID_ON_EVENTS:
          serviceImpl.onEvents((org.onosproject.grpc.models.EventListenerProto.TopicE) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.EventListenerProto.Listener>) responseObserver);
          break;
        case METHODID_EMIT_EVENT:
          serviceImpl.emitEvent((org.onosproject.grpc.models.OutboundPacketProtoOuterClass.OutboundPacketProto) request,
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

  private static abstract class EventListenerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventListenerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.onosproject.grpc.models.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventListener");
    }
  }

  private static final class EventListenerFileDescriptorSupplier
      extends EventListenerBaseDescriptorSupplier {
    EventListenerFileDescriptorSupplier() {}
  }

  private static final class EventListenerMethodDescriptorSupplier
      extends EventListenerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventListenerMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventListenerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventListenerFileDescriptorSupplier())
              .addMethod(getRegEventMethod())
              .addMethod(getOnEventsMethod())
              .addMethod(getEmitEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
