public class Produto {
    private String nome;
    private boolean recebido;

    public Produto(String nome, boolean recebido) {
        this.nome = nome;
        this.recebido = recebido;
    }

    public boolean isRecebido() {
        return recebido;
    }

    public String getNome() {
        return nome;
    }
}
