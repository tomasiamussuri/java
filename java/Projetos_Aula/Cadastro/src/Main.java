import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor();

        //Scanner sc = new Scanner(System.in);
        //sc
        professor.setNome("Tomásia Mussurí");
        professor.setCpf("12345678900");
        professor.setDataNascimento("04/12/2000");

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Teixeira da Silva");
        endereco.setNumero("240");
        endereco.setComplemento("Apto 31");
        endereco.setBairro("Paraíso");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setCep("01.001-000");

        professor.setEndereco(endereco);
        professor.setId(0001);
        professor.setDisciplina("Java");

        Instrutor instrutor = new Instrutor();
        instrutor.setNome("João Lima");
        instrutor.setCpf("03947290129");
        instrutor.setDataNascimento("12/04/1985");
        instrutor.setEndereco(endereco);
        instrutor.setId(0002);
        instrutor.setDisciplina("Python");

        System.out.println(professor);

    }
}