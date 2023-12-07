public class Cachorro extends Mamifero {
    public Cachorro(String nome) {
        super(nome);
    }
    @Override
    public void falar() {
        System.out.println("Au au");
    }
}
