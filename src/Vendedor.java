import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vendedor extends Pessoa {

    List<String> carrinhoDeVendas = new ArrayList<>();
    public Vendedor(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }
}
