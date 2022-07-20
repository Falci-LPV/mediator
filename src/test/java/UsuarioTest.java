import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UsuarioTest {
    @Test
    void deveEnviarProdutoRecebido() {
        Produto produto = new Produto("Xbox", true);
        Usuario usuario = new Usuario();
        assertEquals("O suporte foi avisado que o produto Xbox  foi entregue com sucesso.\n" +
                "Mensagem do vendedor:\n" +
                "->Agradescemos a sua preferência na compra do produto Xbox, compre sempre conosco!", usuario.produtoRecebido(produto));
    }
    @Test
    void deveEnviarProdutoNaoRecebido() {
        Produto produto = new Produto("Alexa", false);
        Usuario usuario = new Usuario();
        System.out.println(usuario.produtoRecebido(produto));
        assertEquals("O suporte foi avisado do problema em relação ao produto Xbox.\n" +
                "Mensagem do vendedor sobre o problema.\n" +
                "->Nos desculpamos pelo incoveniente, estamos trabalhando para lhe enviar o produtoXbox", usuario.produtoRecebido(produto));
    }
}