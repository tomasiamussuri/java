import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n***** BILHETERIA ONLINE *****" +
                                "\nSelecione uma opção: " +
                                "\n[1] Ingresso Normal" +
                                "\n[2] Ingresso VIP" +
                                "\n[9] Ver Ingresso" +
                                "\n[0] Sair");
            System.out.println("\nOpção desejada: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Voce escolheru");
            } else if (opcao == 2) {

            } else if (opcao == 9) {

            } else if (opcao != 1 || opcao != 2 || opcao != 9) {
                System.out.println("Opção inválida, tente novamente!");
            }
        } while (opcao != 0);
    }

    public static void ingressoNormal() {
        Scanner sc = new Scanner(System.in);





    }
    //Ingresso ingresso = new Ingresso();

}

