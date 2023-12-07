public abstract class Empresa {
    private String nome;
    private String cnpj;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "\nEmpresa: " + getClass().getName() +
                "\nNOME: " + nome +
                "\nCNPJ: " + cnpj;
    }
    public abstract boolean cobranca();
}
