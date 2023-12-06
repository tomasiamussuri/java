import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\nCADASTRAR PESSOAS\n" +
                                "\nSelecione uma opção: " +
                                "\n[1] Rica" +
                                "\n[2] Pobre" +
                                "\n[3] Miserável" +
                                "\n[9] Listar Pessoas" +
                                "\n[0] Sair");

            System.out.println("\tOpção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                cadastrarRica();
            } else if (opcao ==2) {
                cadastrarPobre();
            } else if (opcao == 3) {
                cadastrarMiseravel();
            } else if (opcao == 9) {
                listarPessoas();
            }else if (opcao != 1 || opcao != 2 || opcao != 3 || opcao != 9) {
                System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);

    } // fim do main

    public static void cadastrarRica() {

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        String email;
        String telefone;

        System.out.println("\tNome: ");
        nome = sc.nextLine();

        System.out.println("\tIdade: ");
        idade = sc.nextInt();

        System.out.println("\tEmail: ");
        email = sc.nextLine();

        sc.nextLine();

        System.out.println("\tTelefone: ");
        telefone = sc.nextLine();

        Rica rica = new Rica(nome, idade, email, telefone);

        pessoas.add(rica);
        System.out.println("\n\tPessoa Rica cadastrada com sucesso!");
    }

    public static void cadastrarPobre() {

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        String email;
        String telefone;

        System.out.println("\tNome: ");
        nome = sc.nextLine();

        System.out.println("\tIdade: ");
        idade= sc.nextInt();

        System.out.println("\tEmail: ");
        email = sc.nextLine();

        sc.nextLine();

        System.out.println("\tTelefone: ");
        telefone = sc.nextLine();

        Pobre pobre = new Pobre(nome, idade, email, telefone);

        pessoas.add(pobre);
        System.out.println("\n\tPessoa Pobre cadastrada com sucesso!");
    }

    public static void cadastrarMiseravel() {

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        String email;
        String telefone;

        System.out.println("\tNome: ");
        nome = sc.nextLine();

        System.out.println("\tIdade: ");
        idade = sc.nextInt();

        System.out.println("\tEmail: ");
        email = sc.nextLine();

        sc.nextLine();

        System.out.println("\tTelefone: ");
        telefone = sc.nextLine();

        Miseravel miseravel = new Miseravel(nome, idade, email, telefone);

        pessoas.add(miseravel);
        System.out.println("\n\tPessoa Miserável incluida com sucesso!");
    }

    public static void listarPessoas() {
        for (int i = 0 ; i < pessoas.size() ; i++) {
            System.out.println(pessoas.get(i));
        }
    }

} // fim da classe