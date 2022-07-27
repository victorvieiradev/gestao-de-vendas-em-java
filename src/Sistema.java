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
        int autorizar = 0;
        for (Cliente cliente1 : clientesCadastrados){
            if (cliente.equalsIgnoreCase(cliente1.getNome())){
                autorizar += 1;
            }
        }
        for (Vendedor vendedor1 : vendedoresCadastrados){
            if (vendedor.equalsIgnoreCase(vendedor1.getNome())){
                autorizar += 1;
            }
        }
        for (Produto produto1 : listaDeProdutos){
            if (produto.equalsIgnoreCase(produto1.getNome())){
                autorizar += 1;
            }
        }
        if (autorizar == 3){
            this.vendasRealizadas.add(new Venda(cliente, vendedor, produto, data));
            System.out.println("Venda realizada com sucesso!");
            for (Cliente cliente1 : clientesCadastrados){
                if (cliente.equalsIgnoreCase(cliente1.getNome())){
                    cliente1.carrinhoDeCompras.add(produto);
                }
            }
            for (Vendedor vendedor1 : vendedoresCadastrados){
        if (vendedor.equalsIgnoreCase(vendedor1.getNome())){
            vendedor1.carrinhoDeVendas.add(produto);
        }
            }
        }else {
            System.out.println("Verifique as informações digitadas e tente novamente.");
        }


    }
    public void buscarProdutosCliente(String cpf){
        for (Cliente cliente : clientesCadastrados){
            if (cpf.equalsIgnoreCase(cliente.getCpf())){
                cliente.carrinhoDeCompras.forEach(nome -> System.out.println("Produto: " + nome));
            }
        }
    }

    void exibirVenda(){
        this.vendasRealizadas.forEach(venda -> System.out.println("Vendedor: " + venda.getVendedor() + "\nComprador: " + venda.getCliente() + "\nProduto comprado: " + venda.getProduto() + "\nData da venda: " + venda.getData()));
    }
    void exibirProduto(){
        listaDeProdutos.forEach(produto -> System.out.println("Produto: " +produto.getNome()+ " \nPreço: " + produto.getPreco() ));
    }
    int validarCpfCliente(String cpf){
        int valor = 0;
        for (Cliente cliente : clientesCadastrados){
            if (cpf.equalsIgnoreCase(cliente.getCpf())){
                valor = 1;
            }
        }
        if (valor == 1){
            return  1;
        }
        return  2;
    }
    int validarCpfVendedor(String cpf){
        int valor = 0;
        for (Vendedor vendedor : vendedoresCadastrados){
            if (cpf.equalsIgnoreCase(vendedor.getCpf())){
                valor = 1;
            }
        }
        if (valor == 1){
            return  1;
        }
        return  2;

    }
}
