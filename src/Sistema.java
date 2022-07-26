import java.util.HashSet;
import java.util.Set;

public class Sistema implements Gestao{

    Set<Cliente> clientesCadastrados = new HashSet<>();
    Set<Vendedor> vendedoresCadastrados = new HashSet<>();

    Set<Venda> vendasRealizadas = new HashSet<>();

    @Override
    public void adicionarCliente(Cliente cliente) {
        this.clientesCadastrados.add(cliente);
    }

    @Override
    public void adicionarVendedor(Vendedor vendedor) {
        this.vendedoresCadastrados.add(vendedor);

    }

    public void addProduto(Vendedor vendedor, Produto produto){
        vendedor.listaDeProdutos.add(produto);
    }

    void exibirClientes(){
        clientesCadastrados.forEach(cliente -> System.out.println("Nome: " + cliente.getNome() + "\nCPF:" + cliente.getCpf() + "\nEmail: " + cliente.getEmail()));
    }
    void exibirVendedor(){
        vendedoresCadastrados.forEach(vendedor -> System.out.println("Nome: " + vendedor.getNome() + "\nCPF:" + vendedor.getCpf() + "\nEmail: " + vendedor.getEmail()));
    }

    public void adicionarVenda(Cliente cliente, Produto produto, Vendedor vendedor, String data){
        this.vendasRealizadas.add(new Venda(cliente.getNome(), vendedor.getNome(), produto.getNome(), data));
    }

    void exibirVenda(){
        vendasRealizadas.forEach(venda -> System.out.println("Nome Cliente : " + venda.getCliente() + "\n Nome Vendedor:" + venda.getVendedor() + "\n Nome do Produto: " + venda.getProduto()+ "Data "+ venda.getData()));


    }
}
