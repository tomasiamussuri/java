import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produtos[] = new Produto[3];
        int codigo = 1;

        for (int i = 0 ; i < produtos.length ; i++) {

            System.out.println("\nProduto: " + codigo);
            System.out.print("Informe o nome do produto: ");
            String nome = sc.next();
            System.out.print("Informe a descrição do produto: ");
            sc.nextLine();
            String descricao = sc.nextLine();
            System.out.print("Informe o custo do produto: ");
            float custo = sc.nextFloat();

            produtos[i] = new Produto(codigo, nome, descricao, custo);

            codigo++;

        }

        for (int i = 0 ; i < produtos.length ; i++) {
            System.out.println(produtos[i]);
        }
    }

}