public class Triangulo implements FiguraGeometrica {
    private float ladoA;
    private float ladoB;
    private float ladoC;
    private float altura;

    private Material material;
    public float getLadoA() {
        return ladoA;
    }

    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }

    public float getLadoC() {
        return ladoC;
    }

    public void setLadoC(float ladoC) {
        this.ladoC = ladoC;
    }

    public float getAltura() {
        return (getPerimetro()) / 2;
    }

    public float getBase() {
        return getLadoA();
    }

    public float getPesoEspecifico() {
        return material.getPeso();
    }

    @Override
    public float getPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public float getArea() {
        return getAltura() * getBase();
    }

    @Override
    public float getVolume() {
        return getArea() * getAltura();
    }

    @Override
    public float getPeso() {
        return getVolume() * getPesoEspecifico();
    }

    @Override
    public String toString() {
        return "\nTRIANGULO" +
                "\nLado A = " + getLadoA() +
                "\nLado B = " + getLadoB() +
                "\nLado C = " + getLadoC() +
                "\nBase = " + getAltura() +
                "\nAltura = " + getAltura() +
                "\nArea = " + getArea() +
                "\nPerimetro = " + getPerimetro() +
                "\nVolume = " + getVolume() +
                "\nPeso = " + getPeso();
    }
}
