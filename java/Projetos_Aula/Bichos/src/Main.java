
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.setNome("Guga");
        cachorro.setRaca("Poodle");
        cachorro.setLate("Au au");

        System.out.println("***** Cachorro *****");
        System.out.println(cachorro);

        Gato gato = new Gato();

        gato.setNome("Abel");
        gato.setRaca("Persa");
        gato.setMia("Miau");

        System.out.println("***** Gato *****");
        System.out.println(gato);

    }
}