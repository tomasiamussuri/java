/*
ctrl+alt+l -> organiza o codigo
 */

public class Programa {
    public static void main(String[] args) {

        Pessoa pessoaUm = new Pessoa();
        //pessoaUm.nome = "Tomásia";
        //pessoaUm.cpf = "041.817.854-24";
        //pessoaUm.endereco = "Rua Alexandre Levi, 85, Torre 01 Apt 75, Cambuci, São Paulo - SP";
        //pessoaUm.idade = 40;
        //pessoaUm.sexo = 'F';

        //Pessoa pessoaDois = new Pessoa();
        //pessoaDois.nome = "João";
        //pessoaDois.cpf = "144.616.504-30";
        //pessoaDois.endereco = "Rua Caramujo, 26/27, Praia do Francês, Marechal Deodoro - AL";
        //pessoaDois.idade = 76;
        //pessoaDois.sexo = 'F';

        System.out.print("Digite seu nome: ");
        pessoaUm.nome = sc.nextLine();

        System.out.print("Digite seu CPF: ");
        pessoaUm.cpf = sc.nextLine();

        System.out.print("Digite sua idade: ");
        pessoaUm.idade = sc.nextInt();

        System.out.print("Digite seu sexo: ");
        pessoaUm.sexo = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Digite seu endereço: ");
        pessoaUm.endereco = sc.nextLine();

        // Imprimir dados das pessoas
        System.out.println("___________________________________________________________________");
        pessoaUm.apresentarPessoa();
        System.out.println("___________________________________________________________________");
        //pessoaDois.apresentarPessoa();
        //System.out.println("___________________________________________________________________");

    }
}
