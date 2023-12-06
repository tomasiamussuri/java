import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static ArrayList<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
/*
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Guga");
        cachorro.setRaca("Poodle");

        Gato gato = new Gato();
        gato.setNome("Abel");
        gato.setRaca("Persa");

        System.out.println(cachorro.caminha());
        System.out.println(cachorro.late());
        System.out.println();
        System.out.println(gato.caminha());
        System.out.println(gato.mia());

        System.out.println(cachorro);
        System.out.println(gato);
    }
*/
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n*** CADASTRO DE ANIMAIS ***\n" +
                    "Escolha uma opção: \n" +
                    "[1] Cachorro \n" +
                    "[2] Gato \n" +
                    "[9] Listar Animais \n" +
                    "[0] Sair");

            System.out.print("\tOpção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                cadastrarCachorro();
            } else if (opcao == 2) {
                cadastrarGato();
            } else if (opcao == 9) {
                listarAnimais();
            } else if (opcao != 1 || opcao != 2 || opcao != 9) {
                System.out.println("Opção incorreta. Tente novamente!");
            }
        } while (opcao != 0);

    } //fim do main

    public static void cadastrarCachorro() {
        Scanner sc = new Scanner(System.in);
        String nome;
        String raca;

        System.out.print("\tInforme o nome do cachorro: ");
        nome = sc.nextLine();

        System.out.print("\tQual a raça: ");
        raca = sc.nextLine();

        Cachorro cachorro = new Cachorro(nome, raca);

        animais.add(cachorro);
        System.out.println("\tCachorro cadastrado com sucesso");
    }

    public static void cadastrarGato() {
        Scanner sc = new Scanner(System.in);
        String nome;
        String raca;

        System.out.print("\tInforme o nome do gato: ");
        nome = sc.nextLine();

        System.out.print("\tQual a raça: ");
        raca = sc.nextLine();

        Gato gato = new Gato(nome, raca);
        gato.setNome(nome);
        gato.setRaca(raca);

        animais.add(gato);
        System.out.println("\tGato cadastrado com sucesso!");
    }

    public static void listarAnimais() {
        for (int i = 0 ; i < animais.size() ; i++) {
            System.out.println("\t\t" + animais.get(i));
        }

    }

} // fim da classe