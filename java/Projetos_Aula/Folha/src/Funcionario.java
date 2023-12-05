public class Funcionario {
    private String nome;
    private float salario;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if(salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Não é permitido salário menor ou igual a zero.");
        }
    }public void addAumento(float aumento) {
        if (aumento > 0) {
            setSalario(getSalario() + aumento);
        } else {
            System.out.println("Não é permitido aumento de valor menor que zero.");
        }
    }
    public float ganhoAnual(){
        return getSalario() * 12;
    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "\nNome: '" + nome + '\'' +
                "\nSalário: R$ " + salario +
                "\nGanho Anual: R$ " + ganhoAnual() +
                '}';
    }
}
