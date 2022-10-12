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
 * Corresponds to FlowRule service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: ServiceProto.proto")
public final class FlowServiceGrpc {

  private FlowServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.FlowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.FlowRules,
      org.onosproject.grpc.models.StatusProto.FlowServiceStatus> getApplyFlowRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "applyFlowRules",
      requestType = org.onosproject.grpc.models.ControlMessagesProto.FlowRules.class,
      responseType = org.onosproject.grpc.models.StatusProto.FlowServiceStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.FlowRules,
      org.onosproject.grpc.models.StatusProto.FlowServiceStatus> getApplyFlowRulesMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.FlowRules, org.onosproject.grpc.models.StatusProto.FlowServiceStatus> getApplyFlowRulesMethod;
    if ((getApplyFlowRulesMethod = FlowServiceGrpc.getApplyFlowRulesMethod) == null) {
      synchronized (FlowServiceGrpc.class) {
        if ((getApplyFlowRulesMethod = FlowServiceGrpc.getApplyFlowRulesMethod) == null) {
          FlowServiceGrpc.getApplyFlowRulesMethod = getApplyFlowRulesMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.ControlMessagesProto.FlowRules, org.onosproject.grpc.models.StatusProto.FlowServiceStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.FlowService", "applyFlowRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.FlowRules.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.StatusProto.FlowServiceStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new FlowServiceMethodDescriptorSupplier("applyFlowRules"))
                  .build();
          }
        }
     }
     return getApplyFlowRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.FlowRules,
      org.onosproject.grpc.models.StatusProto.FlowServiceStatus> getRemoveFlowRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeFlowRules",
      requestType = org.onosproject.grpc.models.ControlMessagesProto.FlowRules.class,
      responseType = org.onosproject.grpc.models.StatusProto.FlowServiceStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.FlowRules,
      org.onosproject.grpc.models.StatusProto.FlowServiceStatus> getRemoveFlowRulesMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.FlowRules, org.onosproject.grpc.models.StatusProto.FlowServiceStatus> getRemoveFlowRulesMethod;
    if ((getRemoveFlowRulesMethod = FlowServiceGrpc.getRemoveFlowRulesMethod) == null) {
      synchronized (FlowServiceGrpc.class) {
        if ((getRemoveFlowRulesMethod = FlowServiceGrpc.getRemoveFlowRulesMethod) == null) {
          FlowServiceGrpc.getRemoveFlowRulesMethod = getRemoveFlowRulesMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.ControlMessagesProto.FlowRules, org.onosproject.grpc.models.StatusProto.FlowServiceStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.FlowService", "removeFlowRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.FlowRules.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.StatusProto.FlowServiceStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new FlowServiceMethodDescriptorSupplier("removeFlowRules"))
                  .build();
          }
        }
     }
     return getRemoveFlowRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.ControlMessagesProto.FlowRuleCount> getGetFlowRuleCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFlowRuleCount",
      requestType = org.onosproject.grpc.models.ControlMessagesProto.Empty.class,
      responseType = org.onosproject.grpc.models.ControlMessagesProto.FlowRuleCount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty,
      org.onosproject.grpc.models.ControlMessagesProto.FlowRuleCount> getGetFlowRuleCountMethod() {
    io.grpc.MethodDescriptor<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.ControlMessagesProto.FlowRuleCount> getGetFlowRuleCountMethod;
    if ((getGetFlowRuleCountMethod = FlowServiceGrpc.getGetFlowRuleCountMethod) == null) {
      synchronized (FlowServiceGrpc.class) {
        if ((getGetFlowRuleCountMethod = FlowServiceGrpc.getGetFlowRuleCountMethod) == null) {
          FlowServiceGrpc.getGetFlowRuleCountMethod = getGetFlowRuleCountMethod = 
              io.grpc.MethodDescriptor.<org.onosproject.grpc.models.ControlMessagesProto.Empty, org.onosproject.grpc.models.ControlMessagesProto.FlowRuleCount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.FlowService", "getFlowRuleCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.onosproject.grpc.models.ControlMessagesProto.FlowRuleCount.getDefaultInstance()))
                  .setSchemaDescriptor(new FlowServiceMethodDescriptorSupplier("getFlowRuleCount"))
                  .build();
          }
        }
     }
     return getGetFlowRuleCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FlowServiceStub newStub(io.grpc.Channel channel) {
    return new FlowServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FlowServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FlowServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FlowServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FlowServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Corresponds to FlowRule service
   * </pre>
   */
  public static abstract class FlowServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void applyFlowRules(org.onosproject.grpc.models.ControlMessagesProto.FlowRules request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.StatusProto.FlowServiceStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getApplyFlowRulesMethod(), responseObserver);
    }

    /**
     */
    public void removeFlowRules(org.onosproject.grpc.models.ControlMessagesProto.FlowRules request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.StatusProto.FlowServiceStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveFlowRulesMethod(), responseObserver);
    }

    /**
     */
    public void getFlowRuleCount(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.FlowRuleCount> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFlowRuleCountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getApplyFlowRulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.ControlMessagesProto.FlowRules,
                org.onosproject.grpc.models.StatusProto.FlowServiceStatus>(
                  this, METHODID_APPLY_FLOW_RULES)))
          .addMethod(
            getRemoveFlowRulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.ControlMessagesProto.FlowRules,
                org.onosproject.grpc.models.StatusProto.FlowServiceStatus>(
                  this, METHODID_REMOVE_FLOW_RULES)))
          .addMethod(
            getGetFlowRuleCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.onosproject.grpc.models.ControlMessagesProto.Empty,
                org.onosproject.grpc.models.ControlMessagesProto.FlowRuleCount>(
                  this, METHODID_GET_FLOW_RULE_COUNT)))
          .build();
    }
  }

  /**
   * <pre>
   * Corresponds to FlowRule service
   * </pre>
   */
  public static final class FlowServiceStub extends io.grpc.stub.AbstractStub<FlowServiceStub> {
    private FlowServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FlowServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlowServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FlowServiceStub(channel, callOptions);
    }

    /**
     */
    public void applyFlowRules(org.onosproject.grpc.models.ControlMessagesProto.FlowRules request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.StatusProto.FlowServiceStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getApplyFlowRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeFlowRules(org.onosproject.grpc.models.ControlMessagesProto.FlowRules request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.StatusProto.FlowServiceStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveFlowRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFlowRuleCount(org.onosproject.grpc.models.ControlMessagesProto.Empty request,
        io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.FlowRuleCount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFlowRuleCountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Corresponds to FlowRule service
   * </pre>
   */
  public static final class FlowServiceBlockingStub extends io.grpc.stub.AbstractStub<FlowServiceBlockingStub> {
    private FlowServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FlowServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlowServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FlowServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.onosproject.grpc.models.StatusProto.FlowServiceStatus applyFlowRules(org.onosproject.grpc.models.ControlMessagesProto.FlowRules request) {
      return blockingUnaryCall(
          getChannel(), getApplyFlowRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.onosproject.grpc.models.StatusProto.FlowServiceStatus removeFlowRules(org.onosproject.grpc.models.ControlMessagesProto.FlowRules request) {
      return blockingUnaryCall(
          getChannel(), getRemoveFlowRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.onosproject.grpc.models.ControlMessagesProto.FlowRuleCount getFlowRuleCount(org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetFlowRuleCountMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Corresponds to FlowRule service
   * </pre>
   */
  public static final class FlowServiceFutureStub extends io.grpc.stub.AbstractStub<FlowServiceFutureStub> {
    private FlowServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FlowServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlowServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FlowServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.StatusProto.FlowServiceStatus> applyFlowRules(
        org.onosproject.grpc.models.ControlMessagesProto.FlowRules request) {
      return futureUnaryCall(
          getChannel().newCall(getApplyFlowRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.StatusProto.FlowServiceStatus> removeFlowRules(
        org.onosproject.grpc.models.ControlMessagesProto.FlowRules request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveFlowRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.onosproject.grpc.models.ControlMessagesProto.FlowRuleCount> getFlowRuleCount(
        org.onosproject.grpc.models.ControlMessagesProto.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFlowRuleCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APPLY_FLOW_RULES = 0;
  private static final int METHODID_REMOVE_FLOW_RULES = 1;
  private static final int METHODID_GET_FLOW_RULE_COUNT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FlowServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FlowServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_APPLY_FLOW_RULES:
          serviceImpl.applyFlowRules((org.onosproject.grpc.models.ControlMessagesProto.FlowRules) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.StatusProto.FlowServiceStatus>) responseObserver);
          break;
        case METHODID_REMOVE_FLOW_RULES:
          serviceImpl.removeFlowRules((org.onosproject.grpc.models.ControlMessagesProto.FlowRules) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.StatusProto.FlowServiceStatus>) responseObserver);
          break;
        case METHODID_GET_FLOW_RULE_COUNT:
          serviceImpl.getFlowRuleCount((org.onosproject.grpc.models.ControlMessagesProto.Empty) request,
              (io.grpc.stub.StreamObserver<org.onosproject.grpc.models.ControlMessagesProto.FlowRuleCount>) responseObserver);
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

  private static abstract class FlowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FlowServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.onosproject.grpc.models.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FlowService");
    }
  }

  private static final class FlowServiceFileDescriptorSupplier
      extends FlowServiceBaseDescriptorSupplier {
    FlowServiceFileDescriptorSupplier() {}
  }

  private static final class FlowServiceMethodDescriptorSupplier
      extends FlowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FlowServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FlowServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FlowServiceFileDescriptorSupplier())
              .addMethod(getApplyFlowRulesMethod())
              .addMethod(getRemoveFlowRulesMethod())
              .addMethod(getGetFlowRuleCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
