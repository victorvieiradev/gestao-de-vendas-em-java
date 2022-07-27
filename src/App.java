import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sistema sistema = new Sistema();
        System.out.println("Bem-vindo ao seu sistema de gestão de vendas");
        boolean inicio = true;
        while (inicio){
            System.out.println("Qual é sua opção: \n1 - Cadastrar novo vendedor \n2 - Listar vendedores cadastrados \n3 - Cadastrar cliente \n 4 - Listar clientes cadastrados\n 5 - Adicionar Produto \n 6 - Mostrar Produtos \n 7 - Realizar venda \n8 - Listar vendas realizadas");
            int resposta = input.nextInt();
            switch (resposta){
                case 1:
                    System.out.println("Cadastrar novo vendedor");
                    System.out.println("Nome: ");
                    String nome = input.next();
                    System.out.println("CPF: ");
                    String cpf = input.next();
                    boolean isValido = Validar.validarCpfCliente(cpf);
                    while (isValido){
                        System.out.println("CPF inválido ou já existente em nosso cadastro, digite novamente seu CPF:");
                        cpf = input.next();
                        isValido = Validar.validarCpfCliente(cpf);
                    }
                    System.out.println("Email: ");
                    String email = input.next();
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
                    Validar validar = new Validar();
                    boolean validacao= validar.validarCpf(cpf2);
                    System.out.println(validacao);
                    System.out.println("Email: ");
                    String email2 = input.next();
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
