public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String telefone;

    public Pessoa(String nome, int idade, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void aniversario() {
        idade += 1;
    }

    @Override
    public String toString() {
        return "\n\t *** PESSOAS CADASTRADAS *** \n" +
                "\n\tClasse Social: " + getClass().getName() +
                "\n\tNome: " + getNome() +
                "\n\tIdade: " + getIdade() +
                "\n\tEmail: " + getEmail() +
                "\n\tTelefone: " + getTelefone();
    }
}
