/*
1. Implemente a classe Funcionario com nome, salario e os métodos addAumento(double valor), ganhoAnual() e exibeDados()
- imprime os valores do funcionário.
a. crie a classe Assistente, que também é um funcionário, e que possui um número de matrícula (faça os métodos GET e SET).
Sobrescreva o método exibeDados().
b. sabendo que os Assistentes Técnicos possuem um bônus salarial e que os Assistentes Administrativos possuem um turno
(dia ou noite) e um adicional noturno, crie as classes Tecnico e Administrativo e sobrescreva o método ganhoAnual() de
ambas as classes (Administrativo e Tecnico).
c. Crie um assistente administrativo e um técnico. Imprima o número de matrícula e o nome de cada um deles.
*/

public class Main {
    public static void main(String[] args) {

        Administrativo administrativo = new Administrativo();

        administrativo.setMatricula(1);
        administrativo.setNome("Tomásia Mussurí");
        administrativo.setSalario(10000);
        administrativo.addAumento(2000);
        administrativo.isDia();

        Tecnico tecnico = new Tecnico();

        tecnico.setMatricula(2);
        tecnico.setNome("Lucas Gabriel");
        tecnico.setSalario(5000);
        tecnico.addAumento(100);
        tecnico.setBonusSalarial(300);

        System.out.println(administrativo);
        System.out.println();
        System.out.println(tecnico);

    }
}