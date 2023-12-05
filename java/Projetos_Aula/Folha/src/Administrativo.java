public class Administrativo extends Assistente {

    private boolean isDia;
    private float addNoturno;

    public boolean isDia() {
        return isDia;
    }
    public void setDia(boolean dia) {
        isDia = dia;
    }

    public void setAddNoturno() {
        if (!isDia) {
            this.addNoturno = getSalario() * 0.2;
            setSalario() = getSalario() * 1.2;
        } else {
            System.out.println("Não é permitido adicional noturno para quem trabalha no turno: Dia.");
        }
    }
    public float getAddNoturno() {
        return addNoturno;
    }

    @Override
    public String toString() {
        return "***** Administrativo *****{" +
                " Matrícula -> '" + getMatricula() + '\'' +
                ", Nome -> '" + getNome() + '\'' +
                ", Turno -> '" + turno + '\'' +
                ", Salário -> '" + getSalario() + '\'' +
                ", Aumento -> '" + getAumento() + '\'' +
                ", Adicional Noturno -> R$ " + addNoturno +
                ", Ganho Anual -> R$ " + ganhoAnual() +
                '}';
    }
}
