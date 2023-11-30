public class Estoque {
    private String nomeProduto;
    private float precoProduto;
    private int qtdeEstoque = 0;
    private String marca;
    private String descricaoProduto;
    private int venda;
    private int qtdeEstoque1;
    public int getQtdeEstoque1() {
        return qtdeEstoque1;
    }
    public void setQtdeEstoque1(int qtdeEstoque1) {
        this.qtdeEstoque1 = qtdeEstoque1;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void int calcularEstoque() {
        if(qtde)
        qtdeEstoque1 = getQtdeEstoque() - getVenda();
        return qtdeEstoque1;

    }

    public void mostrarEstoque() {
        System.out.println("Estoque inicial: " + qtdeEstoque);
        System.out.println("Estoque atual: " + getQtdeEstoque());
    }


}

