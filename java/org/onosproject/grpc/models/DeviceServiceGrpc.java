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
 * Corresponds to Device Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: ServiceProto.proto")
public final class DeviceServiceGrpc {

  private DeviceServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.DeviceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.ControlMessagesProto.DeviceCountProto> getGetDeviceCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDeviceCount",
      requestType = org.onosproject.grpc.models.ControlMessagesProto.Empty.class,
      responseType = org.onosproject.grpc.models.ControlMessagesProto.DeviceCountProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.ControlMessagesProto.DeviceCountProto> getGetDeviceCountMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.ControlMessagesProto.DeviceCountProto> getGetDeviceCountMethod;
    if ((getGetDeviceCountMethod = DeviceServiceGrpc.getGetDeviceCountMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetDeviceCountMethod = DeviceServiceGrpc.getGetDeviceCountMethod) == null) {
          DeviceServiceGrpc.getGetDeviceCountMethod = getGetDeviceCountMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.ControlMessagesProto.DeviceCountProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.DeviceService", "getDeviceCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.DeviceCountProto.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("getDeviceCount"))
                  .build();
          }
        }
     }
     return getGetDeviceCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.ControlMessagesProto.Devices> getGetDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDevices",
      requestType = org.onosproject.grpc.models.ControlMessagesProto.Empty.class,
      responseType = org.onosproject.grpc.models.ControlMessagesProto.Devices.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.ControlMessagesProto.Devices> getGetDevicesMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.ControlMessagesProto.Devices> getGetDevicesMethod;
    if ((getGetDevicesMethod = DeviceServiceGrpc.getGetDevicesMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetDevicesMethod = DeviceServiceGrpc.getGetDevicesMethod) == null) {
          DeviceServiceGrpc.getGetDevicesMethod = getGetDevicesMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.ControlMessagesProto.Devices>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.DeviceService", "getDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.Devices.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("getDevices"))
                  .build();
          }
        }
     }
     return getGetDevicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto,
      org.onosproject.grpc.models.ControlMessagesProto.Ports> getGetPortsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPorts",
      requestType = org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto.class,
      responseType = org.onosproject.grpc.models.ControlMessagesProto.Ports.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto,
      org.onosproject.grpc.models.ControlMessagesProto.Ports> getGetPortsMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto, org.onosproject.grpc.models.ControlMessagesProto.Ports> getGetPortsMethod;
    if ((getGetPortsMethod = DeviceServiceGrpc.getGetPortsMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetPortsMethod = DeviceServiceGrpc.getGetPortsMethod) == null) {
          DeviceServiceGrpc.getGetPortsMethod = getGetPortsMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto, org.onosproject.grpc.models.ControlMessagesProto.Ports>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.DeviceService", "getPorts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.Ports.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("getPorts"))
                  .build();
          }
        }
     }
     return getGetPortsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto,
      org.onosproject.grpc.models.DeviceProtoOuterClass.DeviceProto> getGetDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDevice",
      requestType = org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto.class,
      responseType = org.onosproject.grpc.models.DeviceProtoOuterClass.DeviceProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto,
      org.onosproject.grpc.models.DeviceProtoOuterClass.DeviceProto> getGetDeviceMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto, org.onosproject.grpc.models.DeviceProtoOuterClass.DeviceProto> getGetDeviceMethod;
    if ((getGetDeviceMethod = DeviceServiceGrpc.getGetDeviceMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getGetDeviceMethod = DeviceServiceGrpc.getGetDeviceMethod) == null) {
          DeviceServiceGrpc.getGetDeviceMethod = getGetDeviceMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto, org.onosproject.grpc.models.DeviceProtoOuterClass.DeviceProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.DeviceService", "getDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.DeviceProtoOuterClass.DeviceProto.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("getDevice"))
                  .build();
          }
        }
     }
     return getGetDeviceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceServiceStub newStub(io.grpc.Channel channel) {
    return new DeviceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeviceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeviceServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Corresponds to Device Service
   * </pre>
   */
  public static abstract class DeviceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDeviceCount(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.DeviceCountProto> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDeviceCountMethod(), responseObserver);
    }

    /**
     */
    public void getDevices(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Devices> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDevicesMethod(), responseObserver);
    }

    /**
     */
    public void getPorts(org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Ports> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPortsMethod(), responseObserver);
    }

    /**
     */
    public void getDevice(org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.DeviceProtoOuterClass.DeviceProto> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDeviceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDeviceCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.ControlMessagesProto.Empty,
                org.onosproject.grpc.models.ControlMessagesProto.DeviceCountProto>(
                  this, METHODID_GET_DEVICE_COUNT)))
          .addMethod(
            getGetDevicesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.ControlMessagesProto.Empty,
                org.onosproject.grpc.models.ControlMessagesProto.Devices>(
                  this, METHODID_GET_DEVICES)))
          .addMethod(
            getGetPortsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto,
                org.onosproject.grpc.models.ControlMessagesProto.Ports>(
                  this, METHODID_GET_PORTS)))
          .addMethod(
            getGetDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto,
                org.onosproject.grpc.models.DeviceProtoOuterClass.DeviceProto>(
                  this, METHODID_GET_DEVICE)))
          .build();
    }
  }

  /**
   * <pre>
   * Corresponds to Device Service
   * </pre>
   */
  public static final class DeviceServiceStub extends io.grpc.stub.AbstractStub<DeviceServiceStub> {
    private DeviceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDeviceCount(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.DeviceCountProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDeviceCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDevices(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Devices> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDevicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPorts(org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Ports> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPortsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDevice(org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.DeviceProtoOuterClass.DeviceProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Corresponds to Device Service
   * </pre>
   */
  public static final class DeviceServiceBlockingStub extends io.grpc.stub.AbstractStub<DeviceServiceBlockingStub> {
    private DeviceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.onosproject.grpc.models.ControlMessagesProto.DeviceCountProto getDeviceCount(org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetDeviceCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.onosproject.grpc.models.ControlMessagesProto.Devices getDevices(org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetDevicesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.onosproject.grpc.models.ControlMessagesProto.Ports getPorts(org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto request) {
      return blockingUnaryCall(
          getChannel(), getGetPortsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.onosproject.grpc.models.DeviceProtoOuterClass.DeviceProto getDevice(org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto request) {
      return blockingUnaryCall(
          getChannel(), getGetDeviceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Corresponds to Device Service
   * </pre>
   */
  public static final class DeviceServiceFutureStub extends io.grpc.stub.AbstractStub<DeviceServiceFutureStub> {
    private DeviceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.ControlMessagesProto.DeviceCountProto> getDeviceCount(
        org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDeviceCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.ControlMessagesProto.Devices> getDevices(
        org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDevicesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.ControlMessagesProto.Ports> getPorts(
        org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPortsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.DeviceProtoOuterClass.DeviceProto> getDevice(
        org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEVICE_COUNT = 0;
  private static final int METHODID_GET_DEVICES = 1;
  private static final int METHODID_GET_PORTS = 2;
  private static final int METHODID_GET_DEVICE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeviceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeviceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DEVICE_COUNT:
          serviceImpl.getDeviceCount((org.onosproject.grpc.models.ControlMessagesProto.Empty) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.DeviceCountProto>) responseObserver);
          break;
        case METHODID_GET_DEVICES:
          serviceImpl.getDevices((org.onosproject.grpc.models.ControlMessagesProto.Empty) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Devices>) responseObserver);
          break;
        case METHODID_GET_PORTS:
          serviceImpl.getPorts((org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Ports>) responseObserver);
          break;
        case METHODID_GET_DEVICE:
          serviceImpl.getDevice((org.onosproject.grpc.models.DeviceIdProtoOuterClass.DeviceIdProto) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.DeviceProtoOuterClass.DeviceProto>) responseObserver);
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

  private static abstract class DeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeviceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.onosproject.grpc.models.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeviceService");
    }
  }

  private static final class DeviceServiceFileDescriptorSupplier
      extends DeviceServiceBaseDescriptorSupplier {
    DeviceServiceFileDescriptorSupplier() {}
  }

  private static final class DeviceServiceMethodDescriptorSupplier
      extends DeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeviceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeviceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeviceServiceFileDescriptorSupplier())
              .addMethod(getGetDeviceCountMethod())
              .addMethod(getGetDevicesMethod())
              .addMethod(getGetPortsMethod())
              .addMethod(getGetDeviceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
