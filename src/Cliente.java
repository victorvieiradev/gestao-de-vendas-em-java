import java.util.HashSet;
import java.util.Set;

public class Cliente extends Pessoa {

    Set<Produto> listaDeProdutos = new HashSet<>();

    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }
}
