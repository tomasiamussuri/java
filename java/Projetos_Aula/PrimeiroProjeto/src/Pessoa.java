public class Pessoa {
    String nome;
    String cpf;
    String endereco;
    int idade;
    char sexo;

    // Criar metodo para apresentar atributos da classe Pessoa
    public void apresentarPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Sexo: Masculino");
        } else {
            System.out.println("Sexo: Feminino");
        }
        System.out.println("Endereço: " + endereco);

    }
}
