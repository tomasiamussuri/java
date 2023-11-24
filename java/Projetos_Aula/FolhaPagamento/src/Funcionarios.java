public class Funcionarios {

    String nome;
    Float valorHora;
    int horasTrabalhadas;
    Float valorDescontos;

    // Criar metodo para apresentar atributos da classe Funcionários
    public void saidaDados() {
        System.out.println("FOLHA DE PAGAMENTO");
        System.out.println("____________________________________________________________");
        System.out.println("Nome: " + nome);
        System.out.println(horasTrabalhadas + "horas x R$ " + valorHora + " = R$ " + (horasTrabalhadas * valorHora));
        System.out.println("Descontos: " + valorDescontos);
        System.out.println("Total devido: R$ " + ((horasTrabalhadas * valorHora) - valorDescontos));
        System.out.println("____________________________________________________________");
    }
}
//    Folha de pagamento: Pedro Silva
//        172 horas x R$150.20 = R$25834.40
//        Descontos: R$482.88
//        Total devido: R$25351.52