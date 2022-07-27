import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cliente extends Pessoa {
    //Set<Produto> carrinhoDeCompras = new HashSet<>();
    List<String> carrinhoDeCompras = new ArrayList<>();
    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }

}
