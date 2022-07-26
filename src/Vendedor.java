import java.util.HashSet;
import java.util.Set;

public class Vendedor extends Pessoa {

    Set<Produto> listaDeProdutos = new HashSet<>();
    public Vendedor(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }
}
