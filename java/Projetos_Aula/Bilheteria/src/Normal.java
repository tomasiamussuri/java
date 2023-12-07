public class Normal extends Ingresso {
    public Normal(float valor) {
        super(valor);
    }

    @Override
    public String toString() {
        return "***** INGRESSO - NORMAL *****" +
                "\nPREÇO: R$ " + getValor();
    }
}
