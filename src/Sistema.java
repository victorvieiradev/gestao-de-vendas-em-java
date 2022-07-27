import java.util.HashSet;
import java.util.Set;

public class Sistema implements Gestao{

    Set<Cliente> clientesCadastrados = new HashSet<>();
    Set<Vendedor> vendedoresCadastrados = new HashSet<>();

    Set<Venda> vendasRealizadas = new HashSet<>();

    Set<Produto> listaDeProdutos = new HashSet<>();

    @Override
    public void adicionarCliente(Cliente cliente) {
        this.clientesCadastrados.add(cliente);
    }

    @Override
    public void adicionarVendedor(Vendedor vendedor) {
        this.vendedoresCadastrados.add(vendedor);

    }

    public void addProduto(Produto produto){
        this.listaDeProdutos.add(produto);
    }

    void exibirClientes(){
        clientesCadastrados.forEach(cliente -> System.out.println("Nome: " + cliente.getNome() + "\nCPF:" + cliente.getCpf() + "\nEmail: " + cliente.getEmail()));
    }
    void exibirVendedor(){
        vendedoresCadastrados.forEach(vendedor -> System.out.println("Nome: " + vendedor.getNome() + "\nCPF:" + vendedor.getCpf() + "\nEmail: " + vendedor.getEmail()));
    }

    public void adicionarVenda(String cliente, String produto, String vendedor, String data){
        int autorisar = 0;
        for (Cliente cliente1 : clientesCadastrados){
            if (cliente.equalsIgnoreCase(cliente1.getNome())){
                autorisar += 1;
            }
        }
        for (Vendedor vendedor1 : vendedoresCadastrados){
            if (vendedor.equalsIgnoreCase(vendedor1.getNome())){
                autorisar += 1;
            }
        }
        for (Produto produto1 : listaDeProdutos){
            if (produto.equalsIgnoreCase(produto1.getNome())){
                autorisar += 1;
            }
        }
        if (autorisar == 3){
            this.vendasRealizadas.add(new Venda(cliente, produto, vendedor, data));
            System.out.println("Venda realizada com sucesso!");
        }else {
            System.out.println("Verifique as informações digitadas e tente novamente.");
        }


    }

    void exibirVenda(){
        vendasRealizadas.forEach(venda -> System.out.println("Nome Cliente : " + venda.getCliente() + "\n Nome Vendedor:" + venda.getVendedor() + "\n Nome do Produto: " + venda.getProduto()+ "Data "+ venda.getData()));

    }
    void exibirProduto(){
        listaDeProdutos.forEach(produto -> System.out.println("Produto: " +produto.getNome()+ " \nPreço: " + produto.getPreco() ));
    }
}
