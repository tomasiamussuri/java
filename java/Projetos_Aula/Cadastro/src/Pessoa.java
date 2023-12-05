public class Pessoa {

    private String nome;
    private String cpf;
    private String dataNascimento;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "NOME: '" + nome + '\'' +
                ", CPF: '" + cpf + '\'' +
                ", DATA DE NASCIMENTO: '" + dataNascimento + '\'' +
                ", ENDEREÇO: " + endereco +
                '}';
    }
}
