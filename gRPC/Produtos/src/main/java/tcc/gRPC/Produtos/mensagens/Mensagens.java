package tcc.gRPC.Produtos.mensagens;

public class Mensagens {

    // Mensagens de sucesso
    public static final String PRODUTO_DELETADO = "Produto com id %d deletado com sucesso";
    public static final String PRODUTOS_INSERIDOS_SUCESSO = "%d produtos inseridos com sucesso";
    public static final String ATUALIZACAO_CONCLUIDA = "Atualização concluída: %d produtos modificados (total disponível: %d).";
    public static final String DELECAO_CONCLUIDA = "Deleção concluída: %d produtos removidos.";
    public static final String NENHUM_PRODUTO_ENCONTRADO = "Nenhum produto encontrado para %s.";

    // Mensagens de erro de negócio
    public static final String PRODUTO_NAO_ENCONTRADO_COM_ID = "Produto com id %d não encontrado";
    public static final String PRODUTO_NAO_ENCONTRADO_DELETAR = "Produto com id %d não existe para ser deletado";

    // Mensagens de erro de operação
    public static final String ERRO_INSERIR_MULTIPLOS = "Erro ao inserir múltiplos produtos: %s";
    public static final String ERRO_ATUALIZAR_MULTIPLOS = "Erro ao atualizar múltiplos produtos: %s";
    public static final String ERRO_DELETAR_TODOS = "Erro ao deletar todos os produtos: %s";
    public static final String ERRO_BUSCAR_PRODUTO = "Erro ao buscar produto: %s";
    public static final String ERRO_DELETAR_PRODUTO = "Erro ao deletar produto: %s";

    // Mensagens de erro de sistema
    public static final String ERRO_BANCO_DADOS = "Erro ao acessar o banco de dados";

    // Ações para ACAO
    public static final String ACAO_ATUALIZAR = "atualizar";
    public static final String ACAO_DELETAR = "deletar";

    //ERROS
    public static final String ERRO_CRIAR_PRODUTO = "Erro ao criar produto: %s";
    public static final String ERRO_ATUALIZAR_PRODUTO = "Erro ao atualizar produto: %s";


}