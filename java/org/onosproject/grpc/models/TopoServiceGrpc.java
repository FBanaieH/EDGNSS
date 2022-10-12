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
 * Corresponds to Topology service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: ServiceProto.proto")
public final class TopoServiceGrpc {

  private TopoServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.TopoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.TopologyGraphProtoOuterClass.TopologyGraphProto> getGetGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getGraph",
      requestType = org.onosproject.grpc.models.ControlMessagesProto.Empty.class,
      responseType = org.onosproject.grpc.models.TopologyGraphProtoOuterClass.TopologyGraphProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.TopologyGraphProtoOuterClass.TopologyGraphProto> getGetGraphMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.TopologyGraphProtoOuterClass.TopologyGraphProto> getGetGraphMethod;
    if ((getGetGraphMethod = TopoServiceGrpc.getGetGraphMethod) == null) {
      synchronized (TopoServiceGrpc.class) {
        if ((getGetGraphMethod = TopoServiceGrpc.getGetGraphMethod) == null) {
          TopoServiceGrpc.getGetGraphMethod = getGetGraphMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.TopologyGraphProtoOuterClass.TopologyGraphProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.TopoService", "getGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.TopologyGraphProtoOuterClass.TopologyGraphProto.getDefaultInstance()))
                  .setSchemaDescriptor(new TopoServiceMethodDescriptorSupplier("getGraph"))
                  .build();
          }
        }
     }
     return getGetGraphMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto> getCurrentTopologyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "currentTopology",
      requestType = org.onosproject.grpc.models.ControlMessagesProto.Empty.class,
      responseType = org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto> getCurrentTopologyMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto> getCurrentTopologyMethod;
    if ((getCurrentTopologyMethod = TopoServiceGrpc.getCurrentTopologyMethod) == null) {
      synchronized (TopoServiceGrpc.class) {
        if ((getCurrentTopologyMethod = TopoServiceGrpc.getCurrentTopologyMethod) == null) {
          TopoServiceGrpc.getCurrentTopologyMethod = getCurrentTopologyMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.TopoService", "currentTopology"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto.getDefaultInstance()))
                  .setSchemaDescriptor(new TopoServiceMethodDescriptorSupplier("currentTopology"))
                  .build();
          }
        }
     }
     return getCurrentTopologyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.getPathRequest,
      org.onosproject.grpc.models.ControlMessagesProto.Paths> getGetPathsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPaths",
      requestType = org.onosproject.grpc.models.ControlMessagesProto.getPathRequest.class,
      responseType = org.onosproject.grpc.models.ControlMessagesProto.Paths.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.getPathRequest,
      org.onosproject.grpc.models.ControlMessagesProto.Paths> getGetPathsMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.getPathRequest, org.onosproject.grpc.models.ControlMessagesProto.Paths> getGetPathsMethod;
    if ((getGetPathsMethod = TopoServiceGrpc.getGetPathsMethod) == null) {
      synchronized (TopoServiceGrpc.class) {
        if ((getGetPathsMethod = TopoServiceGrpc.getGetPathsMethod) == null) {
          TopoServiceGrpc.getGetPathsMethod = getGetPathsMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.ControlMessagesProto.getPathRequest, org.onosproject.grpc.models.ControlMessagesProto.Paths>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.TopoService", "getPaths"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.getPathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.Paths.getDefaultInstance()))
                  .setSchemaDescriptor(new TopoServiceMethodDescriptorSupplier("getPaths"))
                  .build();
          }
        }
     }
     return getGetPathsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TopoServiceStub newStub(io.grpc.Channel channel) {
    return new TopoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TopoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TopoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TopoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TopoServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Corresponds to Topology service
   * </pre>
   */
  public static abstract class TopoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getGraph(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.TopologyGraphProtoOuterClass.TopologyGraphProto> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGraphMethod(), responseObserver);
    }

    /**
     */
    public void currentTopology(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto> responseObserver) {
      asyncUnimplementedUnaryCall(getCurrentTopologyMethod(), responseObserver);
    }

    /**
     */
    public void getPaths(org.onosproject.grpc.models.ControlMessagesProto.getPathRequest request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Paths> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPathsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.ControlMessagesProto.Empty,
                org.onosproject.grpc.models.TopologyGraphProtoOuterClass.TopologyGraphProto>(
                  this, METHODID_GET_GRAPH)))
          .addMethod(
            getCurrentTopologyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.ControlMessagesProto.Empty,
                org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto>(
                  this, METHODID_CURRENT_TOPOLOGY)))
          .addMethod(
            getGetPathsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.ControlMessagesProto.getPathRequest,
                org.onosproject.grpc.models.ControlMessagesProto.Paths>(
                  this, METHODID_GET_PATHS)))
          .build();
    }
  }

  /**
   * <pre>
   * Corresponds to Topology service
   * </pre>
   */
  public static final class TopoServiceStub extends io.grpc.stub.AbstractStub<TopoServiceStub> {
    private TopoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TopoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TopoServiceStub(channel, callOptions);
    }

    /**
     */
    public void getGraph(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.TopologyGraphProtoOuterClass.TopologyGraphProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGraphMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void currentTopology(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCurrentTopologyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPaths(org.onosproject.grpc.models.ControlMessagesProto.getPathRequest request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Paths> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPathsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Corresponds to Topology service
   * </pre>
   */
  public static final class TopoServiceBlockingStub extends io.grpc.stub.AbstractStub<TopoServiceBlockingStub> {
    private TopoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TopoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TopoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.onosproject.grpc.models.TopologyGraphProtoOuterClass.TopologyGraphProto getGraph(org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetGraphMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto currentTopology(org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCurrentTopologyMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.onosproject.grpc.models.ControlMessagesProto.Paths getPaths(org.onosproject.grpc.models.ControlMessagesProto.getPathRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPathsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Corresponds to Topology service
   * </pre>
   */
  public static final class TopoServiceFutureStub extends io.grpc.stub.AbstractStub<TopoServiceFutureStub> {
    private TopoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TopoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TopoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TopoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.TopologyGraphProtoOuterClass.TopologyGraphProto> getGraph(
        org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGraphMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto> currentTopology(
        org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getCurrentTopologyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.ControlMessagesProto.Paths> getPaths(
        org.onosproject.grpc.models.ControlMessagesProto.getPathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPathsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GRAPH = 0;
  private static final int METHODID_CURRENT_TOPOLOGY = 1;
  private static final int METHODID_GET_PATHS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TopoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TopoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GRAPH:
          serviceImpl.getGraph((org.onosproject.grpc.models.ControlMessagesProto.Empty) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.TopologyGraphProtoOuterClass.TopologyGraphProto>) responseObserver);
          break;
        case METHODID_CURRENT_TOPOLOGY:
          serviceImpl.currentTopology((org.onosproject.grpc.models.ControlMessagesProto.Empty) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.TopologyProtoOuterClass.TopologyProto>) responseObserver);
          break;
        case METHODID_GET_PATHS:
          serviceImpl.getPaths((org.onosproject.grpc.models.ControlMessagesProto.getPathRequest) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.Paths>) responseObserver);
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

  private static abstract class TopoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TopoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.onosproject.grpc.models.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TopoService");
    }
  }

  private static final class TopoServiceFileDescriptorSupplier
      extends TopoServiceBaseDescriptorSupplier {
    TopoServiceFileDescriptorSupplier() {}
  }

  private static final class TopoServiceMethodDescriptorSupplier
      extends TopoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TopoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TopoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TopoServiceFileDescriptorSupplier())
              .addMethod(getGetGraphMethod())
              .addMethod(getCurrentTopologyMethod())
              .addMethod(getGetPathsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
