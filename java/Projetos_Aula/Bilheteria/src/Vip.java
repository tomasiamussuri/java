public class Vip extends Ingresso {

    private float adicional;

    public Vip(float valor) {
        super(valor);
    }

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }

    public float valor(){
        return getValor() + adicional;
    }

    @Override
    public String toString() {
        return "***** INGRESSO - VIP *****" +
                "PRECO: R$ " + adicional;
    }
}
