package tcc.gRPC.Produtos.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: produto-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProdutoServiceGrpc {

  private ProdutoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "tcc.gRPC.Produtos.ProdutoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.CreateProdutoRequest,
      tcc.gRPC.Produtos.generated.Produto> getCriarProdutoIndividualMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "criarProdutoIndividual",
      requestType = tcc.gRPC.Produtos.generated.CreateProdutoRequest.class,
      responseType = tcc.gRPC.Produtos.generated.Produto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.CreateProdutoRequest,
      tcc.gRPC.Produtos.generated.Produto> getCriarProdutoIndividualMethod() {
    io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.CreateProdutoRequest, tcc.gRPC.Produtos.generated.Produto> getCriarProdutoIndividualMethod;
    if ((getCriarProdutoIndividualMethod = ProdutoServiceGrpc.getCriarProdutoIndividualMethod) == null) {
      synchronized (ProdutoServiceGrpc.class) {
        if ((getCriarProdutoIndividualMethod = ProdutoServiceGrpc.getCriarProdutoIndividualMethod) == null) {
          ProdutoServiceGrpc.getCriarProdutoIndividualMethod = getCriarProdutoIndividualMethod =
              io.grpc.MethodDescriptor.<tcc.gRPC.Produtos.generated.CreateProdutoRequest, tcc.gRPC.Produtos.generated.Produto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "criarProdutoIndividual"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.CreateProdutoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.Produto.getDefaultInstance()))
              .setSchemaDescriptor(new ProdutoServiceMethodDescriptorSupplier("criarProdutoIndividual"))
              .build();
        }
      }
    }
    return getCriarProdutoIndividualMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.UpdateProdutoRequest,
      tcc.gRPC.Produtos.generated.Produto> getUpdateProdutoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProduto",
      requestType = tcc.gRPC.Produtos.generated.UpdateProdutoRequest.class,
      responseType = tcc.gRPC.Produtos.generated.Produto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.UpdateProdutoRequest,
      tcc.gRPC.Produtos.generated.Produto> getUpdateProdutoMethod() {
    io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.UpdateProdutoRequest, tcc.gRPC.Produtos.generated.Produto> getUpdateProdutoMethod;
    if ((getUpdateProdutoMethod = ProdutoServiceGrpc.getUpdateProdutoMethod) == null) {
      synchronized (ProdutoServiceGrpc.class) {
        if ((getUpdateProdutoMethod = ProdutoServiceGrpc.getUpdateProdutoMethod) == null) {
          ProdutoServiceGrpc.getUpdateProdutoMethod = getUpdateProdutoMethod =
              io.grpc.MethodDescriptor.<tcc.gRPC.Produtos.generated.UpdateProdutoRequest, tcc.gRPC.Produtos.generated.Produto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProduto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.UpdateProdutoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.Produto.getDefaultInstance()))
              .setSchemaDescriptor(new ProdutoServiceMethodDescriptorSupplier("UpdateProduto"))
              .build();
        }
      }
    }
    return getUpdateProdutoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.GetProdutoRequest,
      tcc.gRPC.Produtos.generated.Produto> getBuscarPorIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "buscarPorId",
      requestType = tcc.gRPC.Produtos.generated.GetProdutoRequest.class,
      responseType = tcc.gRPC.Produtos.generated.Produto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.GetProdutoRequest,
      tcc.gRPC.Produtos.generated.Produto> getBuscarPorIdMethod() {
    io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.GetProdutoRequest, tcc.gRPC.Produtos.generated.Produto> getBuscarPorIdMethod;
    if ((getBuscarPorIdMethod = ProdutoServiceGrpc.getBuscarPorIdMethod) == null) {
      synchronized (ProdutoServiceGrpc.class) {
        if ((getBuscarPorIdMethod = ProdutoServiceGrpc.getBuscarPorIdMethod) == null) {
          ProdutoServiceGrpc.getBuscarPorIdMethod = getBuscarPorIdMethod =
              io.grpc.MethodDescriptor.<tcc.gRPC.Produtos.generated.GetProdutoRequest, tcc.gRPC.Produtos.generated.Produto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "buscarPorId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.GetProdutoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.Produto.getDefaultInstance()))
              .setSchemaDescriptor(new ProdutoServiceMethodDescriptorSupplier("buscarPorId"))
              .build();
        }
      }
    }
    return getBuscarPorIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.DeleteProdutoRequest,
      tcc.gRPC.Produtos.generated.RespostaMensagem> getDeletarPorIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletarPorId",
      requestType = tcc.gRPC.Produtos.generated.DeleteProdutoRequest.class,
      responseType = tcc.gRPC.Produtos.generated.RespostaMensagem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.DeleteProdutoRequest,
      tcc.gRPC.Produtos.generated.RespostaMensagem> getDeletarPorIdMethod() {
    io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.DeleteProdutoRequest, tcc.gRPC.Produtos.generated.RespostaMensagem> getDeletarPorIdMethod;
    if ((getDeletarPorIdMethod = ProdutoServiceGrpc.getDeletarPorIdMethod) == null) {
      synchronized (ProdutoServiceGrpc.class) {
        if ((getDeletarPorIdMethod = ProdutoServiceGrpc.getDeletarPorIdMethod) == null) {
          ProdutoServiceGrpc.getDeletarPorIdMethod = getDeletarPorIdMethod =
              io.grpc.MethodDescriptor.<tcc.gRPC.Produtos.generated.DeleteProdutoRequest, tcc.gRPC.Produtos.generated.RespostaMensagem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deletarPorId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.DeleteProdutoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.RespostaMensagem.getDefaultInstance()))
              .setSchemaDescriptor(new ProdutoServiceMethodDescriptorSupplier("deletarPorId"))
              .build();
        }
      }
    }
    return getDeletarPorIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.Vazio,
      tcc.gRPC.Produtos.generated.ListaProdutosResponse> getListarTodosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listarTodos",
      requestType = tcc.gRPC.Produtos.generated.Vazio.class,
      responseType = tcc.gRPC.Produtos.generated.ListaProdutosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.Vazio,
      tcc.gRPC.Produtos.generated.ListaProdutosResponse> getListarTodosMethod() {
    io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.Vazio, tcc.gRPC.Produtos.generated.ListaProdutosResponse> getListarTodosMethod;
    if ((getListarTodosMethod = ProdutoServiceGrpc.getListarTodosMethod) == null) {
      synchronized (ProdutoServiceGrpc.class) {
        if ((getListarTodosMethod = ProdutoServiceGrpc.getListarTodosMethod) == null) {
          ProdutoServiceGrpc.getListarTodosMethod = getListarTodosMethod =
              io.grpc.MethodDescriptor.<tcc.gRPC.Produtos.generated.Vazio, tcc.gRPC.Produtos.generated.ListaProdutosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listarTodos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.Vazio.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.ListaProdutosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProdutoServiceMethodDescriptorSupplier("listarTodos"))
              .build();
        }
      }
    }
    return getListarTodosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.InsercaoMultiplaRequest,
      tcc.gRPC.Produtos.generated.RespostaMensagem> getInserirMultiplosProdutosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "inserirMultiplosProdutos",
      requestType = tcc.gRPC.Produtos.generated.InsercaoMultiplaRequest.class,
      responseType = tcc.gRPC.Produtos.generated.RespostaMensagem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.InsercaoMultiplaRequest,
      tcc.gRPC.Produtos.generated.RespostaMensagem> getInserirMultiplosProdutosMethod() {
    io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.InsercaoMultiplaRequest, tcc.gRPC.Produtos.generated.RespostaMensagem> getInserirMultiplosProdutosMethod;
    if ((getInserirMultiplosProdutosMethod = ProdutoServiceGrpc.getInserirMultiplosProdutosMethod) == null) {
      synchronized (ProdutoServiceGrpc.class) {
        if ((getInserirMultiplosProdutosMethod = ProdutoServiceGrpc.getInserirMultiplosProdutosMethod) == null) {
          ProdutoServiceGrpc.getInserirMultiplosProdutosMethod = getInserirMultiplosProdutosMethod =
              io.grpc.MethodDescriptor.<tcc.gRPC.Produtos.generated.InsercaoMultiplaRequest, tcc.gRPC.Produtos.generated.RespostaMensagem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "inserirMultiplosProdutos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.InsercaoMultiplaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.RespostaMensagem.getDefaultInstance()))
              .setSchemaDescriptor(new ProdutoServiceMethodDescriptorSupplier("inserirMultiplosProdutos"))
              .build();
        }
      }
    }
    return getInserirMultiplosProdutosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.Vazio,
      tcc.gRPC.Produtos.generated.RespostaMensagem> getMultiplosUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "multiplosUpdates",
      requestType = tcc.gRPC.Produtos.generated.Vazio.class,
      responseType = tcc.gRPC.Produtos.generated.RespostaMensagem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.Vazio,
      tcc.gRPC.Produtos.generated.RespostaMensagem> getMultiplosUpdatesMethod() {
    io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.Vazio, tcc.gRPC.Produtos.generated.RespostaMensagem> getMultiplosUpdatesMethod;
    if ((getMultiplosUpdatesMethod = ProdutoServiceGrpc.getMultiplosUpdatesMethod) == null) {
      synchronized (ProdutoServiceGrpc.class) {
        if ((getMultiplosUpdatesMethod = ProdutoServiceGrpc.getMultiplosUpdatesMethod) == null) {
          ProdutoServiceGrpc.getMultiplosUpdatesMethod = getMultiplosUpdatesMethod =
              io.grpc.MethodDescriptor.<tcc.gRPC.Produtos.generated.Vazio, tcc.gRPC.Produtos.generated.RespostaMensagem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "multiplosUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.Vazio.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.RespostaMensagem.getDefaultInstance()))
              .setSchemaDescriptor(new ProdutoServiceMethodDescriptorSupplier("multiplosUpdates"))
              .build();
        }
      }
    }
    return getMultiplosUpdatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.Vazio,
      tcc.gRPC.Produtos.generated.RespostaMensagem> getDeletarTodosProdutosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletarTodosProdutos",
      requestType = tcc.gRPC.Produtos.generated.Vazio.class,
      responseType = tcc.gRPC.Produtos.generated.RespostaMensagem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.Vazio,
      tcc.gRPC.Produtos.generated.RespostaMensagem> getDeletarTodosProdutosMethod() {
    io.grpc.MethodDescriptor<tcc.gRPC.Produtos.generated.Vazio, tcc.gRPC.Produtos.generated.RespostaMensagem> getDeletarTodosProdutosMethod;
    if ((getDeletarTodosProdutosMethod = ProdutoServiceGrpc.getDeletarTodosProdutosMethod) == null) {
      synchronized (ProdutoServiceGrpc.class) {
        if ((getDeletarTodosProdutosMethod = ProdutoServiceGrpc.getDeletarTodosProdutosMethod) == null) {
          ProdutoServiceGrpc.getDeletarTodosProdutosMethod = getDeletarTodosProdutosMethod =
              io.grpc.MethodDescriptor.<tcc.gRPC.Produtos.generated.Vazio, tcc.gRPC.Produtos.generated.RespostaMensagem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deletarTodosProdutos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.Vazio.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  tcc.gRPC.Produtos.generated.RespostaMensagem.getDefaultInstance()))
              .setSchemaDescriptor(new ProdutoServiceMethodDescriptorSupplier("deletarTodosProdutos"))
              .build();
        }
      }
    }
    return getDeletarTodosProdutosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProdutoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProdutoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProdutoServiceStub>() {
        @java.lang.Override
        public ProdutoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProdutoServiceStub(channel, callOptions);
        }
      };
    return ProdutoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProdutoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProdutoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProdutoServiceBlockingStub>() {
        @java.lang.Override
        public ProdutoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProdutoServiceBlockingStub(channel, callOptions);
        }
      };
    return ProdutoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProdutoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProdutoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProdutoServiceFutureStub>() {
        @java.lang.Override
        public ProdutoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProdutoServiceFutureStub(channel, callOptions);
        }
      };
    return ProdutoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Operações individuais
     * </pre>
     */
    default void criarProdutoIndividual(tcc.gRPC.Produtos.generated.CreateProdutoRequest request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.Produto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCriarProdutoIndividualMethod(), responseObserver);
    }

    /**
     */
    default void updateProduto(tcc.gRPC.Produtos.generated.UpdateProdutoRequest request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.Produto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProdutoMethod(), responseObserver);
    }

    /**
     */
    default void buscarPorId(tcc.gRPC.Produtos.generated.GetProdutoRequest request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.Produto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuscarPorIdMethod(), responseObserver);
    }

    /**
     */
    default void deletarPorId(tcc.gRPC.Produtos.generated.DeleteProdutoRequest request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.RespostaMensagem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletarPorIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Operações em massa
     * </pre>
     */
    default void listarTodos(tcc.gRPC.Produtos.generated.Vazio request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.ListaProdutosResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListarTodosMethod(), responseObserver);
    }

    /**
     */
    default void inserirMultiplosProdutos(tcc.gRPC.Produtos.generated.InsercaoMultiplaRequest request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.RespostaMensagem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInserirMultiplosProdutosMethod(), responseObserver);
    }

    /**
     */
    default void multiplosUpdates(tcc.gRPC.Produtos.generated.Vazio request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.RespostaMensagem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiplosUpdatesMethod(), responseObserver);
    }

    /**
     */
    default void deletarTodosProdutos(tcc.gRPC.Produtos.generated.Vazio request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.RespostaMensagem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletarTodosProdutosMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProdutoService.
   */
  public static abstract class ProdutoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProdutoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProdutoService.
   */
  public static final class ProdutoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProdutoServiceStub> {
    private ProdutoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProdutoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProdutoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Operações individuais
     * </pre>
     */
    public void criarProdutoIndividual(tcc.gRPC.Produtos.generated.CreateProdutoRequest request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.Produto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCriarProdutoIndividualMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduto(tcc.gRPC.Produtos.generated.UpdateProdutoRequest request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.Produto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProdutoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buscarPorId(tcc.gRPC.Produtos.generated.GetProdutoRequest request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.Produto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuscarPorIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletarPorId(tcc.gRPC.Produtos.generated.DeleteProdutoRequest request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.RespostaMensagem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletarPorIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Operações em massa
     * </pre>
     */
    public void listarTodos(tcc.gRPC.Produtos.generated.Vazio request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.ListaProdutosResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListarTodosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inserirMultiplosProdutos(tcc.gRPC.Produtos.generated.InsercaoMultiplaRequest request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.RespostaMensagem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInserirMultiplosProdutosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiplosUpdates(tcc.gRPC.Produtos.generated.Vazio request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.RespostaMensagem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiplosUpdatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletarTodosProdutos(tcc.gRPC.Produtos.generated.Vazio request,
        io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.RespostaMensagem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletarTodosProdutosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProdutoService.
   */
  public static final class ProdutoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProdutoServiceBlockingStub> {
    private ProdutoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProdutoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProdutoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Operações individuais
     * </pre>
     */
    public tcc.gRPC.Produtos.generated.Produto criarProdutoIndividual(tcc.gRPC.Produtos.generated.CreateProdutoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCriarProdutoIndividualMethod(), getCallOptions(), request);
    }

    /**
     */
    public tcc.gRPC.Produtos.generated.Produto updateProduto(tcc.gRPC.Produtos.generated.UpdateProdutoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProdutoMethod(), getCallOptions(), request);
    }

    /**
     */
    public tcc.gRPC.Produtos.generated.Produto buscarPorId(tcc.gRPC.Produtos.generated.GetProdutoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuscarPorIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public tcc.gRPC.Produtos.generated.RespostaMensagem deletarPorId(tcc.gRPC.Produtos.generated.DeleteProdutoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletarPorIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Operações em massa
     * </pre>
     */
    public tcc.gRPC.Produtos.generated.ListaProdutosResponse listarTodos(tcc.gRPC.Produtos.generated.Vazio request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListarTodosMethod(), getCallOptions(), request);
    }

    /**
     */
    public tcc.gRPC.Produtos.generated.RespostaMensagem inserirMultiplosProdutos(tcc.gRPC.Produtos.generated.InsercaoMultiplaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInserirMultiplosProdutosMethod(), getCallOptions(), request);
    }

    /**
     */
    public tcc.gRPC.Produtos.generated.RespostaMensagem multiplosUpdates(tcc.gRPC.Produtos.generated.Vazio request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiplosUpdatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public tcc.gRPC.Produtos.generated.RespostaMensagem deletarTodosProdutos(tcc.gRPC.Produtos.generated.Vazio request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletarTodosProdutosMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProdutoService.
   */
  public static final class ProdutoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProdutoServiceFutureStub> {
    private ProdutoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProdutoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProdutoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Operações individuais
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tcc.gRPC.Produtos.generated.Produto> criarProdutoIndividual(
        tcc.gRPC.Produtos.generated.CreateProdutoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCriarProdutoIndividualMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tcc.gRPC.Produtos.generated.Produto> updateProduto(
        tcc.gRPC.Produtos.generated.UpdateProdutoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProdutoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tcc.gRPC.Produtos.generated.Produto> buscarPorId(
        tcc.gRPC.Produtos.generated.GetProdutoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuscarPorIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tcc.gRPC.Produtos.generated.RespostaMensagem> deletarPorId(
        tcc.gRPC.Produtos.generated.DeleteProdutoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletarPorIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Operações em massa
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<tcc.gRPC.Produtos.generated.ListaProdutosResponse> listarTodos(
        tcc.gRPC.Produtos.generated.Vazio request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListarTodosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tcc.gRPC.Produtos.generated.RespostaMensagem> inserirMultiplosProdutos(
        tcc.gRPC.Produtos.generated.InsercaoMultiplaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInserirMultiplosProdutosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tcc.gRPC.Produtos.generated.RespostaMensagem> multiplosUpdates(
        tcc.gRPC.Produtos.generated.Vazio request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiplosUpdatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<tcc.gRPC.Produtos.generated.RespostaMensagem> deletarTodosProdutos(
        tcc.gRPC.Produtos.generated.Vazio request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletarTodosProdutosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CRIAR_PRODUTO_INDIVIDUAL = 0;
  private static final int METHODID_UPDATE_PRODUTO = 1;
  private static final int METHODID_BUSCAR_POR_ID = 2;
  private static final int METHODID_DELETAR_POR_ID = 3;
  private static final int METHODID_LISTAR_TODOS = 4;
  private static final int METHODID_INSERIR_MULTIPLOS_PRODUTOS = 5;
  private static final int METHODID_MULTIPLOS_UPDATES = 6;
  private static final int METHODID_DELETAR_TODOS_PRODUTOS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CRIAR_PRODUTO_INDIVIDUAL:
          serviceImpl.criarProdutoIndividual((tcc.gRPC.Produtos.generated.CreateProdutoRequest) request,
              (io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.Produto>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUTO:
          serviceImpl.updateProduto((tcc.gRPC.Produtos.generated.UpdateProdutoRequest) request,
              (io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.Produto>) responseObserver);
          break;
        case METHODID_BUSCAR_POR_ID:
          serviceImpl.buscarPorId((tcc.gRPC.Produtos.generated.GetProdutoRequest) request,
              (io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.Produto>) responseObserver);
          break;
        case METHODID_DELETAR_POR_ID:
          serviceImpl.deletarPorId((tcc.gRPC.Produtos.generated.DeleteProdutoRequest) request,
              (io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.RespostaMensagem>) responseObserver);
          break;
        case METHODID_LISTAR_TODOS:
          serviceImpl.listarTodos((tcc.gRPC.Produtos.generated.Vazio) request,
              (io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.ListaProdutosResponse>) responseObserver);
          break;
        case METHODID_INSERIR_MULTIPLOS_PRODUTOS:
          serviceImpl.inserirMultiplosProdutos((tcc.gRPC.Produtos.generated.InsercaoMultiplaRequest) request,
              (io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.RespostaMensagem>) responseObserver);
          break;
        case METHODID_MULTIPLOS_UPDATES:
          serviceImpl.multiplosUpdates((tcc.gRPC.Produtos.generated.Vazio) request,
              (io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.RespostaMensagem>) responseObserver);
          break;
        case METHODID_DELETAR_TODOS_PRODUTOS:
          serviceImpl.deletarTodosProdutos((tcc.gRPC.Produtos.generated.Vazio) request,
              (io.grpc.stub.StreamObserver<tcc.gRPC.Produtos.generated.RespostaMensagem>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCriarProdutoIndividualMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tcc.gRPC.Produtos.generated.CreateProdutoRequest,
              tcc.gRPC.Produtos.generated.Produto>(
                service, METHODID_CRIAR_PRODUTO_INDIVIDUAL)))
        .addMethod(
          getUpdateProdutoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tcc.gRPC.Produtos.generated.UpdateProdutoRequest,
              tcc.gRPC.Produtos.generated.Produto>(
                service, METHODID_UPDATE_PRODUTO)))
        .addMethod(
          getBuscarPorIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tcc.gRPC.Produtos.generated.GetProdutoRequest,
              tcc.gRPC.Produtos.generated.Produto>(
                service, METHODID_BUSCAR_POR_ID)))
        .addMethod(
          getDeletarPorIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tcc.gRPC.Produtos.generated.DeleteProdutoRequest,
              tcc.gRPC.Produtos.generated.RespostaMensagem>(
                service, METHODID_DELETAR_POR_ID)))
        .addMethod(
          getListarTodosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tcc.gRPC.Produtos.generated.Vazio,
              tcc.gRPC.Produtos.generated.ListaProdutosResponse>(
                service, METHODID_LISTAR_TODOS)))
        .addMethod(
          getInserirMultiplosProdutosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tcc.gRPC.Produtos.generated.InsercaoMultiplaRequest,
              tcc.gRPC.Produtos.generated.RespostaMensagem>(
                service, METHODID_INSERIR_MULTIPLOS_PRODUTOS)))
        .addMethod(
          getMultiplosUpdatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tcc.gRPC.Produtos.generated.Vazio,
              tcc.gRPC.Produtos.generated.RespostaMensagem>(
                service, METHODID_MULTIPLOS_UPDATES)))
        .addMethod(
          getDeletarTodosProdutosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              tcc.gRPC.Produtos.generated.Vazio,
              tcc.gRPC.Produtos.generated.RespostaMensagem>(
                service, METHODID_DELETAR_TODOS_PRODUTOS)))
        .build();
  }

  private static abstract class ProdutoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProdutoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return tcc.gRPC.Produtos.generated.ProdutoServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProdutoService");
    }
  }

  private static final class ProdutoServiceFileDescriptorSupplier
      extends ProdutoServiceBaseDescriptorSupplier {
    ProdutoServiceFileDescriptorSupplier() {}
  }

  private static final class ProdutoServiceMethodDescriptorSupplier
      extends ProdutoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProdutoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProdutoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProdutoServiceFileDescriptorSupplier())
              .addMethod(getCriarProdutoIndividualMethod())
              .addMethod(getUpdateProdutoMethod())
              .addMethod(getBuscarPorIdMethod())
              .addMethod(getDeletarPorIdMethod())
              .addMethod(getListarTodosMethod())
              .addMethod(getInserirMultiplosProdutosMethod())
              .addMethod(getMultiplosUpdatesMethod())
              .addMethod(getDeletarTodosProdutosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
