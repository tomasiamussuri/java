public class Losango implements FiguraGeometrica {
    private float ladoMenor;
    private float ladoMaior;
    private float altura;
    private Material material;
    private String material;

    public float getLadoMenor() {
        return ladoMenor;
    }
    public void setLadoMenor(float ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public float getLadoMaior() {
        return ladoMaior;
    }
    public void setLadoMaior(float ladoMaior) {
        this.ladoMaior = ladoMaior;
    }
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPesoEspecifico() {
        return material.getPeso();
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public float getDiagonalMenor() {
        return ladoMenor * 2;
    }
    public float getDiagonalMaior() {
        return ladoMaior * 2;
    }
    @Override
    public float getPerimetro() {
        return getDiagonalMenor() + getDiagonalMaior();
    }

    @Override
    public float getArea() {
        return (getDiagonalMenor() * getDiagonalMaior()) / 2;
    }

    @Override
    public float getVolume() {
        return getDiagonalMenor() * getDiagonalMaior() * getAltura();
    }
    @Override
    public float getPeso() {
        return getVolume() * getPesoEspecifico();
    }

    public String toString() {
        return "\nLOSANGO" +
                "\nLado Menor = " + getLadoMenor() +
                "\nLado Maior = " + getLadoMaior() +
                "\nArea = " + getArea() +
                "\nPerimetro = " + getPerimetro() +
                "\nVolume = " + getVolume() +
                "\nPeso = " + getPeso();
    }

}
