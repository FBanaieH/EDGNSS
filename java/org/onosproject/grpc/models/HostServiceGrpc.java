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
 * Corrsponds to Host Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: ServiceProto.proto")
public final class HostServiceGrpc {

  private HostServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.HostService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.ControlMessagesProto.Hosts> getGetHostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHosts",
      requestType = org.onosproject.grpc.models.ControlMessagesProto.Empty.class,
      responseType = org.onosproject.grpc.models.ControlMessagesProto.Hosts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.ControlMessagesProto.Hosts> getGetHostsMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.ControlMessagesProto.Hosts> getGetHostsMethod;
    if ((getGetHostsMethod = HostServiceGrpc.getGetHostsMethod) == null) {
      synchronized (HostServiceGrpc.class) {
        if ((getGetHostsMethod = HostServiceGrpc.getGetHostsMethod) == null) {
          HostServiceGrpc.getGetHostsMethod = getGetHostsMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.ControlMessagesProto.Hosts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.HostService", "getHosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.Hosts.getDefaultInstance()))
                  .setSchemaDescriptor(new HostServiceMethodDescriptorSupplier("getHosts"))
                  .build();
          }
        }
     }
     return getGetHostsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.ControlMessagesProto.HostCountProto> getGetHostCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHostCount",
      requestType = org.onosproject.grpc.models.ControlMessagesProto.Empty.class,
      responseType = org.onosproject.grpc.models.ControlMessagesProto.HostCountProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.ControlMessagesProto.HostCountProto> getGetHostCountMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.ControlMessagesProto.HostCountProto> getGetHostCountMethod;
    if ((getGetHostCountMethod = HostServiceGrpc.getGetHostCountMethod) == null) {
      synchronized (HostServiceGrpc.class) {
        if ((getGetHostCountMethod = HostServiceGrpc.getGetHostCountMethod) == null) {
          HostServiceGrpc.getGetHostCountMethod = getGetHostCountMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.ControlMessagesProto.HostCountProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.HostService", "getHostCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.HostCountProto.getDefaultInstance()))
                  .setSchemaDescriptor(new HostServiceMethodDescriptorSupplier("getHostCount"))
                  .build();
          }
        }
     }
     return getGetHostCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.HostIdProtoOuterClass.HostIdProto,
      org.onosproject.grpc.models.HostProtoOuterClass.HostProto> getGetHostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHost",
      requestType = org.onosproject.grpc.models.HostIdProtoOuterClass.HostIdProto.class,
      responseType = org.onosproject.grpc.models.HostProtoOuterClass.HostProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.HostIdProtoOuterClass.HostIdProto,
      org.onosproject.grpc.models.HostProtoOuterClass.HostProto> getGetHostMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.HostIdProtoOuterClass.HostIdProto, org.onosproject.grpc.models.HostProtoOuterClass.HostProto> getGetHostMethod;
    if ((getGetHostMethod = HostServiceGrpc.getGetHostMethod) == null) {
      synchronized (HostServiceGrpc.class) {
        if ((getGetHostMethod = HostServiceGrpc.getGetHostMethod) == null) {
          HostServiceGrpc.getGetHostMethod = getGetHostMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.HostIdProtoOuterClass.HostIdProto, org.onosproject.grpc.models.HostProtoOuterClass.HostProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.HostService", "getHost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.HostIdProtoOuterClass.HostIdProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.HostProtoOuterClass.HostProto.getDefaultInstance()))
                  .setSchemaDescriptor(new HostServiceMethodDescriptorSupplier("getHost"))
                  .build();
          }
        }
     }
     return getGetHostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto,
      org.onosproject.grpc.models.ControlMessagesProto.Hosts> getGetConnectedHostsByDeviceIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getConnectedHostsByDeviceId",
      requestType = org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto.class,
      responseType = org.onosproject.grpc.models.ControlMessagesProto.Hosts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto,
      org.onosproject.grpc.models.ControlMessagesProto.Hosts> getGetConnectedHostsByDeviceIdMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto, org.onosproject.grpc.models.ControlMessagesProto.Hosts> getGetConnectedHostsByDeviceIdMethod;
    if ((getGetConnectedHostsByDeviceIdMethod = HostServiceGrpc.getGetConnectedHostsByDeviceIdMethod) == null) {
      synchronized (HostServiceGrpc.class) {
        if ((getGetConnectedHostsByDeviceIdMethod = HostServiceGrpc.getGetConnectedHostsByDeviceIdMethod) == null) {
          HostServiceGrpc.getGetConnectedHostsByDeviceIdMethod = getGetConnectedHostsByDeviceIdMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto, org.onosproject.grpc.models.ControlMessagesProto.Hosts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.HostService", "getConnectedHostsByDeviceId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.Hosts.getDefaultInstance()))
                  .setSchemaDescriptor(new HostServiceMethodDescriptorSupplier("getConnectedHostsByDeviceId"))
                  .build();
          }
        }
     }
     return getGetConnectedHostsByDeviceIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.ConnectPointProtoOuterClass.ConnectPointProto,
      org.onosproject.grpc.models.ControlMessagesProto.Hosts> getGetConnectedHostsByConnectedPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getConnectedHostsByConnectedPoint",
      requestType = org.onosproject.grpc.models.ConnectPointProtoOuterClass.ConnectPointProto.class,
      responseType = org.onosproject.grpc.models.ControlMessagesProto.Hosts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.ConnectPointProtoOuterClass.ConnectPointProto,
      org.onosproject.grpc.models.ControlMessagesProto.Hosts> getGetConnectedHostsByConnectedPointMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.ConnectPointProtoOuterClass.ConnectPointProto, org.onosproject.grpc.models.ControlMessagesProto.Hosts> getGetConnectedHostsByConnectedPointMethod;
    if ((getGetConnectedHostsByConnectedPointMethod = HostServiceGrpc.getGetConnectedHostsByConnectedPointMethod) == null) {
      synchronized (HostServiceGrpc.class) {
        if ((getGetConnectedHostsByConnectedPointMethod = HostServiceGrpc.getGetConnectedHostsByConnectedPointMethod) == null) {
          HostServiceGrpc.getGetConnectedHostsByConnectedPointMethod = getGetConnectedHostsByConnectedPointMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.ConnectPointProtoOuterClass.ConnectPointProto, org.onosproject.grpc.models.ControlMessagesProto.Hosts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.HostService", "getConnectedHostsByConnectedPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ConnectPointProtoOuterClass.ConnectPointProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.Hosts.getDefaultInstance()))
                  .setSchemaDescriptor(new HostServiceMethodDescriptorSupplier("getConnectedHostsByConnectedPoint"))
                  .build();
          }
        }
     }
     return getGetConnectedHostsByConnectedPointMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HostServiceStub newStub(io.grpc.Channel channel) {
    return new HostServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HostServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HostServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HostServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HostServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Corrsponds to Host Service
   * </pre>
   */
  public static abstract class HostServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getHosts(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Hosts> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHostsMethod(), responseObserver);
    }

    /**
     */
    public void getHostCount(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.HostCountProto> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHostCountMethod(), responseObserver);
    }

    /**
     */
    public void getHost(org.onosproject.grpc.models.HostIdProtoOuterClass.HostIdProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.HostProtoOuterClass.HostProto> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHostMethod(), responseObserver);
    }

    /**
     */
    public void getConnectedHostsByDeviceId(org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Hosts> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConnectedHostsByDeviceIdMethod(), responseObserver);
    }

    /**
     */
    public void getConnectedHostsByConnectedPoint(org.onosproject.grpc.models.ConnectPointProtoOuterClass.ConnectPointProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Hosts> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConnectedHostsByConnectedPointMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHostsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.ControlMessagesProto.Empty,
                org.onosproject.grpc.models.ControlMessagesProto.Hosts>(
                  this, METHODID_GET_HOSTS)))
          .addMethod(
            getGetHostCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.ControlMessagesProto.Empty,
                org.onosproject.grpc.models.ControlMessagesProto.HostCountProto>(
                  this, METHODID_GET_HOST_COUNT)))
          .addMethod(
            getGetHostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.HostIdProtoOuterClass.HostIdProto,
                org.onosproject.grpc.models.HostProtoOuterClass.HostProto>(
                  this, METHODID_GET_HOST)))
          .addMethod(
            getGetConnectedHostsByDeviceIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto,
                org.onosproject.grpc.models.ControlMessagesProto.Hosts>(
                  this, METHODID_GET_CONNECTED_HOSTS_BY_DEVICE_ID)))
          .addMethod(
            getGetConnectedHostsByConnectedPointMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.ConnectPointProtoOuterClass.ConnectPointProto,
                org.onosproject.grpc.models.ControlMessagesProto.Hosts>(
                  this, METHODID_GET_CONNECTED_HOSTS_BY_CONNECTED_POINT)))
          .build();
    }
  }

  /**
   * <pre>
   * Corrsponds to Host Service
   * </pre>
   */
  public static final class HostServiceStub extends io.grpc.stub.AbstractStub<HostServiceStub> {
    private HostServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HostServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HostServiceStub(channel, callOptions);
    }

    /**
     */
    public void getHosts(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Hosts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHostsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHostCount(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.HostCountProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHostCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHost(org.onosproject.grpc.models.HostIdProtoOuterClass.HostIdProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.HostProtoOuterClass.HostProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConnectedHostsByDeviceId(org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Hosts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConnectedHostsByDeviceIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getConnectedHostsByConnectedPoint(org.onosproject.grpc.models.ConnectPointProtoOuterClass.ConnectPointProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Hosts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConnectedHostsByConnectedPointMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Corrsponds to Host Service
   * </pre>
   */
  public static final class HostServiceBlockingStub extends io.grpc.stub.AbstractStub<HostServiceBlockingStub> {
    private HostServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HostServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HostServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.onosproject.grpc.models.ControlMessagesProto.Hosts getHosts(org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetHostsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.onosproject.grpc.models.ControlMessagesProto.HostCountProto getHostCount(org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetHostCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.onosproject.grpc.models.HostProtoOuterClass.HostProto getHost(org.onosproject.grpc.models.HostIdProtoOuterClass.HostIdProto request) {
      return blockingUnaryCall(
          getChannel(), getGetHostMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.onosproject.grpc.models.ControlMessagesProto.Hosts getConnectedHostsByDeviceId(org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto request) {
      return blockingUnaryCall(
          getChannel(), getGetConnectedHostsByDeviceIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.onosproject.grpc.models.ControlMessagesProto.Hosts getConnectedHostsByConnectedPoint(org.onosproject.grpc.models.ConnectPointProtoOuterClass.ConnectPointProto request) {
      return blockingUnaryCall(
          getChannel(), getGetConnectedHostsByConnectedPointMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Corrsponds to Host Service
   * </pre>
   */
  public static final class HostServiceFutureStub extends io.grpc.stub.AbstractStub<HostServiceFutureStub> {
    private HostServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HostServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HostServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.ControlMessagesProto.Hosts> getHosts(
        org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHostsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.ControlMessagesProto.HostCountProto> getHostCount(
        org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHostCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.HostProtoOuterClass.HostProto> getHost(
        org.onosproject.grpc.models.HostIdProtoOuterClass.HostIdProto request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.ControlMessagesProto.Hosts> getConnectedHostsByDeviceId(
        org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConnectedHostsByDeviceIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.ControlMessagesProto.Hosts> getConnectedHostsByConnectedPoint(
        org.onosproject.grpc.models.ConnectPointProtoOuterClass.ConnectPointProto request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConnectedHostsByConnectedPointMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HOSTS = 0;
  private static final int METHODID_GET_HOST_COUNT = 1;
  private static final int METHODID_GET_HOST = 2;
  private static final int METHODID_GET_CONNECTED_HOSTS_BY_DEVICE_ID = 3;
  private static final int METHODID_GET_CONNECTED_HOSTS_BY_CONNECTED_POINT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HostServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HostServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HOSTS:
          serviceImpl.getHosts((org.onosproject.grpc.models.ControlMessagesProto.Empty) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Hosts>) responseObserver);
          break;
        case METHODID_GET_HOST_COUNT:
          serviceImpl.getHostCount((org.onosproject.grpc.models.ControlMessagesProto.Empty) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.HostCountProto>) responseObserver);
          break;
        case METHODID_GET_HOST:
          serviceImpl.getHost((org.onosproject.grpc.models.HostIdProtoOuterClass.HostIdProto) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.HostProtoOuterClass.HostProto>) responseObserver);
          break;
        case METHODID_GET_CONNECTED_HOSTS_BY_DEVICE_ID:
          serviceImpl.getConnectedHostsByDeviceId((org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Hosts>) responseObserver);
          break;
        case METHODID_GET_CONNECTED_HOSTS_BY_CONNECTED_POINT:
          serviceImpl.getConnectedHostsByConnectedPoint((org.onosproject.grpc.models.ConnectPointProtoOuterClass.ConnectPointProto) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Hosts>) responseObserver);
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

  private static abstract class HostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HostServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.onosproject.grpc.models.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HostService");
    }
  }

  private static final class HostServiceFileDescriptorSupplier
      extends HostServiceBaseDescriptorSupplier {
    HostServiceFileDescriptorSupplier() {}
  }

  private static final class HostServiceMethodDescriptorSupplier
      extends HostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HostServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HostServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HostServiceFileDescriptorSupplier())
              .addMethod(getGetHostsMethod())
              .addMethod(getGetHostCountMethod())
              .addMethod(getGetHostMethod())
              .addMethod(getGetConnectedHostsByDeviceIdMethod())
              .addMethod(getGetConnectedHostsByConnectedPointMethod())
              .build();
        }
      }
    }
    return result;
  }
}
