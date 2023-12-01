/*
Modele um funcionário. Ele deve ter o nome do funcionário, o departamento onde
trabalha, seu salário, a data de entrada no banco (String), seu RG (String),
e um valor booleano que indique se o funcionário está na empresa no momento ou se
já foi embora.
Você deve criar alguns métodos de acordo com o que você sentir necessidade. Além deles,
crie um método bonifica que aumenta o salário do funcionário de acordo com o parâmetro
passado como argumento. Crie também um método demite que não recebe parâmetro algum,
só modifica o valor booleano indicando que o funcionário não trabalha mais aqui.
A ideia aqui é apenas modelar, isto é, só identifique que informações são importantes,
e o que um funcionário faz.
2. Transforme o modelo acima em uma classe Java. Teste-a, usando uma outra classe que
tenha o main. Você deve criar a classe do funcionário chamada Funcionario, e a classe
de teste você pode nomear como quiser. A de teste deve possuir o método main.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário contratado: ");
        funcionario.setNome(sc.nextLine());

        System.out.println("Informe o departamento que o funcionário será alocado: ");
        funcionario.setDepartamento(sc.nextLine());

        System.out.println("Informe o RG do funcionário: ");
        funcionario.setRg(sc.nextLine());

        System.out.println("Informe a data de contratação (dd/mm/aaaa): ");
        funcionario.setDataEntrada(sc.nextLine());

        System.out.println("Informe o salário de contratação: ");
        funcionario.setSalario(sc.nextFloat());

        funcionario.mostrarDados();

        System.out.println("Informe qual o valor de bonificação: R$ ");
        funcionario.bonifica(sc.nextFloat());

        funcionario.mostrarDados();

        funcionario.demite();

        funcionario.mostrarDados();

        funcionario.bonifica(1000);

    }
}