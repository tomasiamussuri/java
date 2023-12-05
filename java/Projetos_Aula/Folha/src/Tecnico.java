public class Tecnico extends Assistente {

    private float bonusSalarial;

    public float getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(float bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public void addAumento(float valor) {
        if (valor > 0) {
            super.addAumento(valor);
        } else {
            System.out.println("Não é permitido bonus menor ou igual a zero.");
        }
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                " Matrícula -> " + getMatricula() +
                ", Nome -> " + getNome() +
                ", Salário -> R$ " + getSalario() +
                ", Aumento -> R$ " + getAumento() +
                ", Bônus Salarial -> R$ " + bonusSalarial +
                ", Ganho Anual -> R$ " + ganhoAnual() +
                '}';
    }
}
