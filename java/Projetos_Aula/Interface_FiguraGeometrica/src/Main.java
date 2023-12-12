import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        do {
            System.out.println("\n[1] - Circulo" +
                                "\n[2] - Triangulo" +
                                "\n[3] - Losango" +
                                "\n[9] - Listar figuras");
            System.out.println("\nEscolha uma figura: " );
            opcao = sc.nextInt();
        } while (opcao != 0);

        if (opcao == 1) {
            System.out.print("Informe o valor do raio: ");
            float raio = sc.nextFloat();
            System.out.println("Informe o valor da altura: ");
            sc.nextLine();
            float altura = sc.nextFloat();
            sc.nextLine();
            //peso
        } else if (opcao == 2) {

        } else if (opcao == 3) {

        } else if (opcao != 1 || opcao != 2 || opcao != 3) {
            System.out.println("Opção Inválida, tente novamente.");
        }








        Material gesso = new Gesso();
        gesso.setNome("Gesso");
        gesso.setPeso(1400);

        Material seixoArenoso = new SeixoArenoso();
        seixoArenoso.setNome("Seixo Arenoso");
        seixoArenoso.setPeso(1600);

        Material areiaSeca = new AreiaSeca();
        areiaSeca.setNome("Areia Seca");
        areiaSeca.setPeso(1700);

        ArrayList<Material> materiais = new ArrayList<>();
        materiais.add(gesso);
        materiais.add(seixoArenoso);
        materiais.add(areiaSeca);

        Circulo circulo = new Circulo();
        circulo.setRaio(0.01f);
        circulo.setAltura(0.5f);
        for (int i = 0 ; i < materiais.size() ; i++){
            circulo.setPesoEspecifico();
        }


        Losango losango = new Losango();
        losango.setLadoMenor(2);
        losango.setLadoMaior(4);
        losango.setAltura(0.5f);
        losango.setPesoEspecifico(500);

        Triangulo triangulo = new Triangulo();
        triangulo.setLadoA(2);
        triangulo.setLadoB(3);
        triangulo.setLadoC(4);
        triangulo.setPesoEspecifico(100);


        figuras.add(circulo);
        figuras.add(triangulo);
        figuras.add(losango);

        System.out.println(circulo);
        System.out.println(losango);
        System.out.println(triangulo);


        //for (int i = 0 ; i < empresas.size() ; i++) {
        //    System.out.println(empresas.get(i));
        //    System.out.println(empresas.get(i).cobranca());
        //    System.out.println("*********");

    }
}