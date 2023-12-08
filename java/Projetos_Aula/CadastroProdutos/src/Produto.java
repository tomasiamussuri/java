public abstract class Produto {
    private String nomeLoja;
    private float preco;

    public Produto(String nomeLoja, float preco, String descricao) {
        this.nomeLoja = nomeLoja;
        this.preco = preco;
        this.descricao = descricao;
    }

    private String descricao;

    public Produto() {

    }
    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        System.out.println("Produto de informática");
        return descricao;
    }

    @Override
    public String toString() {
        return "\nPRODUTO: " + getClass().getName() +
                "\nLOJA: " + nomeLoja +
                "\nPREÇO: R$ " + preco +
                "\nDESCRIÇÃO: " + descricao;
    }
}
