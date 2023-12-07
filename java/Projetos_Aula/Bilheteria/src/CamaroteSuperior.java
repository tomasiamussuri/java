public class CamaroteSuperior extends Vip {

    private float adicional;
    public CamaroteSuperior(float valor) {
        super(valor);
    }

    @Override
    public float getAdicional() {
        return getValor() + getAdicional() + adicional;
    }

    @Override
    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }

    @Override
    public String toString() {
        return "***** INGRESSO - VIP *****" +
                "\nCamarote Superior" +
                "\nPREÇO: R$ " + getValor();
    }
}
