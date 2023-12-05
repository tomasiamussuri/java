public class Assistente extends Funcionario {

    private int matricula;

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    @Override
    public String toString() {
        return "***** Assistente ***** " +
                "\nMatricula: " + matricula +
                "\nNome: " + getNome() +
                "\nSalário: " + getSalario() +
                "\nAumento: " +  getAumento() +
                "\nGanho Anual: " + ganhoAnual() +
                '}';
    }
}
