import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sistema sistema = new Sistema();
        System.out.println("Bem-vindo ao seu sistema de gestão de vendas");
        boolean inicio = true;
        while (inicio){
            System.out.println("Qual é sua opção: \n1 - Cadastrar novo vendedor \n2 - Listar vendedores cadastrados \n3 - Cadastrar cliente \n 4 - Listar clientes cadastrados");
            int resposta = input.nextInt();
            switch (resposta){
                case 1:
                    System.out.println("Cadastrar novo vendedor");
                    System.out.println("Nome: ");
                    String nome = input.next();
                    System.out.println("CPF: ");
                    String cpf = input.next();
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
