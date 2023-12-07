import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal bemtevi = new BemTeVi("Amarelão");
        Animal papagaio = new Papagaio("Zé");
        Animal cachorro = new Cachorro("Catu");
        Animal vaca = new Vaca("Mimosa");

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(bemtevi);
        animais.add(papagaio);
        animais.add(cachorro);
        animais.add(vaca);

        for (int i = 0 ; i < animais.size() ; i++) {
            System.out.println("\n***** LISTA DE ANIMAIS *****");
            System.out.println(animais.get(i));
            animais.get(i).falar();
        }
    }
}