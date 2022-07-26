import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sistema sistema = new Sistema();
        System.out.println("Bem-vindo ao seu sistema de gestão de vendas");
        boolean inicio = true;
        while (inicio){
            System.out.println("Qual é sua opção: \n1 - Cadastrar novo vendedor \n2 - Listar vendedores cadastrados" +
                    " \n3 - Cadastrar cliente \n4 - Listar clientes cadastrados\n5 - Adicionar Produto \n" +
                    "6 - Mostrar Produtos \n7 - Realizar venda \n8 - Listar vendas realizadas \n" +
                    "9 - Mostrar carrinho de compras do cliente \n10 - Exibir vendas do vendedor \n0 - Para sair");
            int resposta = input.nextInt();
            switch (resposta){
                case 1:
                    System.out.println("Cadastrar novo vendedor");
                    System.out.println("Nome: ");
                    String nome = input.next();
                    System.out.println("CPF: ");
                    String cpf = input.next();
                    int isValido1 = sistema.validarCpfVendedor(cpf);
                    while (isValido1 == 1){
                        System.out.println("CPF inválido ou já existente em nosso cadastro, digite novamente seu CPF:");
                        cpf = input.next();
                        isValido1 = sistema.validarCpfVendedor(cpf);
                    }
                    System.out.println("Email: ");
                    String email = input.next();
                    while (!email.contains("@")){
                        System.out.println("Email inválido, digite novamente");
                        email= input.next();
                    }
                    Vendedor vendedor = new Vendedor(nome, cpf, email);
                    sistema.adicionarVendedor(vendedor);
                break;
                case 2:
                    System.out.println("Exibindo lista de vendedores cadastrados no sistema");
                    sistema.exibirVendedor();
                break;
                case 3:
                    System.out.println("Cadastrar um novo cliente");
                    System.out.println("Nome: ");
                    String nome2 = input.next();
                    System.out.println("CPF: ");
                    String cpf2 = input.next();
                    int isValido = sistema.validarCpfCliente(cpf2);
                    while (isValido == 1){
                        System.out.println("CPF inválido ou já existente em nosso cadastro, digite novamente seu CPF:");
                        cpf2 = input.next();
                        isValido = sistema.validarCpfCliente(cpf2);
                    }
                    System.out.println("Email: ");
                    String email2 = input.next();
                    while (!email2.contains("@")){
                        System.out.println("Email inválido, digite novamente");
                        email2= input.next();
                    }
                    Cliente cliente = new Cliente(nome2, cpf2, email2);
                    sistema.adicionarCliente(cliente);
                break;
                case  4:
                    System.out.println("Exibindo clientes cadastrados no sistema.");
                    sistema.exibirClientes();
                break;

                case 5:
                    System.out.println("Nome do produto ");
                    String nomeProduto=input.next();
                    System.out.println("preço do produto");
                    double precoProduto= input.nextDouble();
                    Produto produto= new Produto(nomeProduto, precoProduto);
                    sistema.addProduto(produto);
                break;
                case 6:
                    System.out.println("Listando produtos cadastrados");
                    sistema.exibirProduto();
                break;
                case 7:
                    System.out.println("Nova venda \nInforme o nome do vendedor");
                    String nomeVendedor = input.next();
                    System.out.println("Informe o nome do cliente: ");
                    String nomeCliente = input.next();
                    System.out.println("Nome do produto");
                    nomeProduto = input.next();
                    System.out.println("Data da venda");
                    String data = input.next();
                    sistema.adicionarVenda(nomeCliente, nomeProduto, nomeVendedor, data);
                break;
                case 8:
                    sistema.exibirVenda();
                break;
                case 9:
                    System.out.println("Informe o CPF DO CLIENTE");
                    String cpfCliente = input.next();
                    sistema.buscarProdutosCliente(cpfCliente);
                break;
                case 10:
                    System.out.println("Informe o email do vendedor: ");
                    String emailVendedor = input.next();
                    sistema.buscarVendasVendendor(emailVendedor);
                    break;
                case 0:
                    System.out.println("Fechando o sistema.");
                    inicio = false;
                break;

                default:
                    System.out.println("Valor inválido");
                break;
            }
        }
        input.close();
    }
}
