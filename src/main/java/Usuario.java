public class Usuario {

    public String produtoRecebido(Produto produto){
        if(produto.isRecebido()){
            return MarketPlaceSuporte.getInstancia().receberMensagemProdutoRecebido(produto);
        } else {
            return MarketPlaceSuporte.getInstancia().receberMensagemProdutoNaoRecebido(produto);
        }
    }
}
