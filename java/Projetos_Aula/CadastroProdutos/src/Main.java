
//falta concluir


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Produto> carrinho = new ArrayList<>();

    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("**** CARRINHO DE COMPRAS ****" +
                                "\n[1] Mouse" +
                                "\n[2] Livro" +
                                "\n[9] Ver carrinho de compras" +
                                "\n[0] Finalizar");
            System.out.println("\nSelecione o produto desejado: ");

            opcao = sc.nextInt();

            if (opcao == 1) {
                comprarMouse();
            } else if (opcao == 2) {
                comprarLivro();
            } else if (opcao == 9) {
                verCarrinho();
            } else if (opcao != 1 || opcao != 2 || opcao != 9) {
                System.out.println("Opção inválida, tente novamente!");
            }
        } while (opcao != 0);
    }

    public void comprarMouse() {
        Scanner sc = new Scanner(System.in);
        String nome;

        Mouse mouse = new Mouse();
        carrinho.add(mouse);
    }

    public void comprarLivro() {
        Scanner sc = new Scanner(System.in);
        String nome;

        Livro livro = new Livro();
        carrinho.add(livro);
    }

    public void verCarrinho() {
        for (int i = 0 ; i < carrinho.size() ; i++) {
            System.out.println(carrinho.get(i));
        }

    }

}