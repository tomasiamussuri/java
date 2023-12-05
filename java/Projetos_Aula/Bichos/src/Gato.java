public class Gato extends Animal {
    private String mia;

    public String getMia() {
        return mia;
    }

    public void setMia(String mia) {
        this.mia = mia;
    }

    @Override
    public String toString() {
        return "Gato{" +
                " Nome -> '" + getNome() + '\'' +
                ", Raça -> '" + getRaca() + '\'' +
                ", Mia='" + mia + '\'' +
                '}';
    }
}
