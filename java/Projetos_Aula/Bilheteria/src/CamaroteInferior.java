public class CamaroteInferior extends Vip {

    private int numeracao;

    public CamaroteInferior(float valor) {
        super(valor);
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    @Override
    public String toString() {
        return "***** INGRESSO - VIP *****" +
                "\nCamarote Inferior" +
                "\nPREÇO: R$ " + getValor() +
                "\nLocalização: " + numeracao;
    }
}
