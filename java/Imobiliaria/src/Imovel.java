public class Imovel {
    private String tipoContrato;
    private String tipoImovel;
    private float tamanhoImovel;
    private Endereco endereco;
    private int qtdeQuartos;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private int qtdeBanheiros;
    private int qtdeGaragem;
    private float valorImovel;
    private float valorCondominio;
    private float valorIPTU;
    private boolean statusLocacao;

    public boolean isStatusLocacao() {
        return statusLocacao;
    }

    public void setStatusLocacao(boolean statusLocacao) {
        this.statusLocacao = statusLocacao;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public float getTamanhoImovel() {
        return tamanhoImovel;
    }

    public void setTamanhoImovel(float tamanhoImovel) {
        this.tamanhoImovel = tamanhoImovel;
    }

    public int getQtdeQuartos() {
        return qtdeQuartos;
    }

    public void setQtdeQuartos(int qtdeQuartos) {
        this.qtdeQuartos = qtdeQuartos;
    }

    public int getQtdeBanheiros() {
        return qtdeBanheiros;
    }

    public void setQtdeBanheiros(int qtdeBanheiros) {
        this.qtdeBanheiros = qtdeBanheiros;
    }

    public int getQtdeGaragem() {
        return qtdeGaragem;
    }

    public void setQtdeGaragem(int qtdeGaragem) {
        this.qtdeGaragem = qtdeGaragem;
    }
    public float getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(float valorImovel) {
        this.valorImovel = valorImovel;
    }

    public float getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(float valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public float getValorIPTU() {
        return valorIPTU;
    }

    public void setValorIPTU(float valorIPTU) {
        this.valorIPTU = valorIPTU;
    }

    public void dadosImovel() {
        System.out.println("Contrato: " + getTipoContrato());
        System.out.println("Imovel: " + getTipoImovel());
        System.out.println("Tamanho: " + getTamanhoImovel() + "m²");
        System.out.println("Quartos: " + getQtdeQuartos());
        System.out.println("Banheiro: " + getQtdeBanheiros());
        System.out.println("Garagem: " + getQtdeGaragem());
        System.out.println("Bairro: " + getEndereco().getBairro());
        System.out.println("Cidade: " + getEndereco().getCidade());
        System.out.println("Estado: " + getEndereco().getEstado());
        System.out.println("Valor: R$ " + valorImovel);
        System.out.println("Condomínio: R$ " + valorCondominio);
        System.out.println("IPTU: R$ " + valorIPTU);
        System.out.println("Status: " + isStatusLocacao());

    }

}
