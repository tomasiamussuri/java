/*
1. Crie um construtor para a classe Data que receba por parâmetro três valores
inteiros referentes ao dia, mês e ano e atribua os valores passados por parâmetro
aos atributos dia, mês e ano, respectivamente.
2. Defina também os atributos dia, mes e ano da classe Data como private e crie
os métodos get e set para cada um dos atributos.
3. Crie uma nova classe TestarData para testar a classe criada. Nessa classe,
crie um método main que realize as seguintes operações:
• Crie um objeto do tipo Data com o nome hoje, utilizando o construtor criado no item 1.
 Passe por parâmetro o dia, o mês e o ano correspondente à data de hoje.
• Chame o método escreverAData do objeto hoje para mostrar a data na tela.
• Crie um objeto do tipo Data com o nome natal e passe por parâmetro os valores
correspondentes ao dia do Natal (exemplo: dia 25, mês 12, ano 2023)
• Chame o método escreverAData do objeto natal para mostrar a data na tela.
4. Execute a classe TestarData.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Data data = new Data();

        Scanner sc = new Scanner(System.in);

        //System.out.println("Informe o ano: ");
        //data.setAno(sc.nextInt());

        System.out.println("Informe o mês: ");
        data.setMes(sc.nextInt());

        System.out.println("Informe o dia: ");
        data.setDia(sc.nextInt());

        //data.verificarData();

    }
}
