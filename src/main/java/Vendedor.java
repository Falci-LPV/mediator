public class Vendedor implements Afiliados {

    private static Vendedor instancia = new Vendedor();

    public Vendedor() {}

    public static Vendedor getInstancia() {
        return instancia;
    }

    public String produtoRecebido(Produto produto){
        return "Agradescemos a sua preferência na compra do produto " + produto.getNome() + ", compre sempre conosco!";
    }
    public String produtoNaoRecebido(Produto produto){
        return "Nos desculpamos pelo incoveniente, estamos trabalhando para lhe enviar o produto" + produto.getNome();
    }
}
