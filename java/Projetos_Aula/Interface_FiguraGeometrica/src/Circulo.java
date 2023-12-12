public class Circulo implements FiguraGeometrica {
    private float raio;
    private float altura;
    private float PI = 3.14f;
    private Material material;

    public Circulo(float raio, float altura, Material material) {
        this.raio = raio;
        this.altura = altura;
        this.material = material;
    }

    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPerimetro() {
        return 2 * getPI() * getRaio();
    }
    public float getArea() {
        return getRaio() * getRaio() * getPI();
    }
    public float getVolume() {
        return getArea() * getAltura();
    }
    public float getPeso() {
        return getVolume() * getPesoEspecifico();
    }
    public float getPI() {
        return PI;
    }
    public float getPesoEspecifico() {
        return material.getPeso();
    }

    @Override
    public String toString() {
        return "\nCIRCULO" +
                "\nRaio = " + getRaio() +
                "\nPerimetro = " + getPerimetro() +
                "\nArea = " + getArea() +
                "\nVolume = " + getVolume() +
                "\nPeso = " + getPeso() +
                "\nPI = " + getPI() ;
    }
}
