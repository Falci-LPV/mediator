public class MarketPlaceSuporte {

    private static MarketPlaceSuporte instancia = new MarketPlaceSuporte();

    public MarketPlaceSuporte() {}

    public static MarketPlaceSuporte getInstancia() {
        return instancia;
    }

    public String receberMensagemProdutoRecebido(Produto produto) {
        return "O suporte foi avisado que o produto "+ produto.getNome() +"  foi entregue com sucesso.\n"+
                "Mensagem do vendedor:\n" +
                "->" + Vendedor.getInstancia().produtoRecebido(produto);
    }

    public String receberMensagemProdutoNaoRecebido(Produto produto) {
        return "O suporte foi avisado do problema em relação ao produto "+ produto.getNome() +".\n"+
                "Mensagem do vendedor sobre o problema.\n" +
                "->" + Vendedor.getInstancia().produtoNaoRecebido(produto);
    }

}
