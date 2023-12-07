public class Ingresso {

    private float valor;

    public Ingresso(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "***** Ingresso *****" +
                "\nVALOR: R$ " + valor;
    }
}
