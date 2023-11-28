public class Circulo {
    private float raio;
    private float area;
    private float perimetro;
    private String cor;
    private String tipoMaterial;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getArea() {
        area = area();
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        perimetro = perimetro();
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public float area() {
        this.area = (getRaio() * getRaio()) * 3.14f;
        return area;
    }

    public float perimetro() {
        perimetro = 2f * getRaio() * 3.14f;
        return perimetro;
    }

    public void mostrarDados() {
        System.out.println("Raio: " + getRaio());
        System.out.println("Área: " + getArea());
        System.out.println("Perímetro: " + getPerimetro());
        System.out.println("Cor: " + getCor());
        System.out.println("Material: " + getTipoMaterial());
    }


}

