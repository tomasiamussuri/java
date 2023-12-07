public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private float preco;
    private float custo;

    public Produto(int codigo, String nome, String descricao, float custo) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.custo = custo;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return getCusto() / 0.333f;
    }

    public float getCusto() {
        return custo;
    }
    public void setCusto(float custo) {
        this.custo = custo;
    }

    @Override
    public String toString() {
        return "\n*** LISTA DE PRODUTOS ***" +
                "\nCÓDIGO: " + codigo +
                "\nNOME: " + nome + '\'' +
                "\nDESCRIÇÃO: " + descricao + '\'' +
                "\nCUSTO: R$ " + custo +
                "\nPREÇO: R$ " + getPreco();
    }
}
