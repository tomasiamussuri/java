import java.security.PrivilegedAction;

public class Professor extends Pessoa {
    private int id;
    private String disciplina;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "NOME: '" + getNome() + '\'' +
                "CPF: '" + getCpf() + '\'' +
                "DATA DE NASCIMENTO: '" + getDataNascimento() + '\'' +
                "ENDEREÇO: '" + getEndereco() + '\'' +
                "DISCIPLINA: '" + disciplina + '\'' +
                ", ID: " + id +
                '}';
    }
}
