/*
Crie uma classe "Círculo" que tenha como atributo o raio, a cor e o
tipo de material do círculo, e como métodos a área e o perímetro.
*/
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.setRaio(2.5f);
        circulo.setCor("Laranja");
        circulo.setTipoMaterial("Plástico");

        circulo.mostrarDados();

    }
}