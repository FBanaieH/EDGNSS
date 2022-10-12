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
 * Corresponds to EventNotification service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: ServiceProto.proto")
public final class EventNotificationGrpc {

  private EventNotificationGrpc() {}

  public static final String SERVICE_NAME = "proto.EventNotification";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.EventNotificationProto.RegistrationRequest,
      org.onosproject.grpc.models.EventNotificationProto.RegistrationResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = org.onosproject.grpc.models.EventNotificationProto.RegistrationRequest.class,
      responseType = org.onosproject.grpc.models.EventNotificationProto.RegistrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.EventNotificationProto.RegistrationRequest,
      org.onosproject.grpc.models.EventNotificationProto.RegistrationResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.EventNotificationProto.RegistrationRequest, org.onosproject.grpc.models.EventNotificationProto.RegistrationResponse> getRegisterMethod;
    if ((getRegisterMethod = EventNotificationGrpc.getRegisterMethod) == null) {
      synchronized (EventNotificationGrpc.class) {
        if ((getRegisterMethod = EventNotificationGrpc.getRegisterMethod) == null) {
          EventNotificationGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.EventNotificationProto.RegistrationRequest, org.onosproject.grpc.models.EventNotificationProto.RegistrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.EventNotification", "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.EventNotificationProto.RegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.EventNotificationProto.RegistrationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventNotificationMethodDescriptorSupplier("register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.EventNotificationProto.Topic,
      org.onosproject.grpc.models.EventNotificationProto.Notification> getOnEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "onEvent",
      requestType = org.onosproject.grpc.models.EventNotificationProto.Topic.class,
      responseType = org.onosproject.grpc.models.EventNotificationProto.Notification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.EventNotificationProto.Topic,
      org.onosproject.grpc.models.EventNotificationProto.Notification> getOnEventMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.EventNotificationProto.Topic, org.onosproject.grpc.models.EventNotificationProto.Notification> getOnEventMethod;
    if ((getOnEventMethod = EventNotificationGrpc.getOnEventMethod) == null) {
      synchronized (EventNotificationGrpc.class) {
        if ((getOnEventMethod = EventNotificationGrpc.getOnEventMethod) == null) {
          EventNotificationGrpc.getOnEventMethod = getOnEventMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.EventNotificationProto.Topic, org.onosproject.grpc.models.EventNotificationProto.Notification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "proto.EventNotification", "onEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.EventNotificationProto.Topic.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.EventNotificationProto.Notification.getDefaultInstance()))
                  .setSchemaDescriptor(new EventNotificationMethodDescriptorSupplier("onEvent"))
                  .build();
          }
        }
     }
     return getOnEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventNotificationStub newStub(io.grpc.Channel channel) {
    return new EventNotificationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventNotificationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventNotificationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventNotificationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventNotificationFutureStub(channel);
  }

  /**
   * <pre>
   * Corresponds to EventNotification service
   * </pre>
   */
  public static abstract class EventNotificationImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(org.onosproject.grpc.models.EventNotificationProto.RegistrationRequest request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.EventNotificationProto.RegistrationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void onEvent(org.onosproject.grpc.models.EventNotificationProto.Topic request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.EventNotificationProto.Notification> responseObserver) {
      asyncUnimplementedUnaryCall(getOnEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.EventNotificationProto.RegistrationRequest,
                org.onosproject.grpc.models.EventNotificationProto.RegistrationResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getOnEventMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.onosproject.grpc.models.EventNotificationProto.Topic,
                org.onosproject.grpc.models.EventNotificationProto.Notification>(
                  this, METHODID_ON_EVENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Corresponds to EventNotification service
   * </pre>
   */
  public static final class EventNotificationStub extends io.grpc.stub.AbstractStub<EventNotificationStub> {
    private EventNotificationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventNotificationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventNotificationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventNotificationStub(channel, callOptions);
    }

    /**
     */
    public void register(org.onosproject.grpc.models.EventNotificationProto.RegistrationRequest request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.EventNotificationProto.RegistrationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onEvent(org.onosproject.grpc.models.EventNotificationProto.Topic request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.EventNotificationProto.Notification> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getOnEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Corresponds to EventNotification service
   * </pre>
   */
  public static final class EventNotificationBlockingStub extends io.grpc.stub.AbstractStub<EventNotificationBlockingStub> {
    private EventNotificationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventNotificationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventNotificationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventNotificationBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.onosproject.grpc.models.EventNotificationProto.RegistrationResponse register(org.onosproject.grpc.models.EventNotificationProto.RegistrationRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.onosproject.grpc.models.EventNotificationProto.Notification> onEvent(
        org.onosproject.grpc.models.EventNotificationProto.Topic request) {
      return blockingServerStreamingCall(
          getChannel(), getOnEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Corresponds to EventNotification service
   * </pre>
   */
  public static final class EventNotificationFutureStub extends io.grpc.stub.AbstractStub<EventNotificationFutureStub> {
    private EventNotificationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventNotificationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventNotificationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventNotificationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.EventNotificationProto.RegistrationResponse> register(
        org.onosproject.grpc.models.EventNotificationProto.RegistrationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_ON_EVENT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventNotificationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventNotificationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((org.onosproject.grpc.models.EventNotificationProto.RegistrationRequest) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.EventNotificationProto.RegistrationResponse>) responseObserver);
          break;
        case METHODID_ON_EVENT:
          serviceImpl.onEvent((org.onosproject.grpc.models.EventNotificationProto.Topic) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.EventNotificationProto.Notification>) responseObserver);
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

  private static abstract class EventNotificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventNotificationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.onosproject.grpc.models.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventNotification");
    }
  }

  private static final class EventNotificationFileDescriptorSupplier
      extends EventNotificationBaseDescriptorSupplier {
    EventNotificationFileDescriptorSupplier() {}
  }

  private static final class EventNotificationMethodDescriptorSupplier
      extends EventNotificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventNotificationMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventNotificationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventNotificationFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getOnEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
