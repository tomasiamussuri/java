public class Cachorro extends Animal {

    private String late;

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                ", Nome -> '" + getNome() + '\'' +
                ", Raça -> '" + getRaca() + '\'' +
                ", late -> '" + late + '\'' +
                '}';
    }
}
