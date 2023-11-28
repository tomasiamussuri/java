public class Aluno {

    private String nome;
    private float notaAluno;
    private float mediaTurma;
    private String disciplina;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaAluno() {
        return notaAluno;
    }

    public void setNotaAluno(float notaAluno) {
        this.notaAluno = notaAluno;
    }

    public float getMediaTurma() {
        return mediaTurma;
    }

    public void setMediaTurma(float mediaTurma) {
        this.mediaTurma = mediaTurma;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void verificaAprovacao() {
        if(notaAluno >= mediaTurma) {
            System.out.println("Parabéns! Você foi aprovado(a).");
        } else {
            System.out.println("Infelizmente você não foi aprovado(a). Estude um pouco mais.");
        }
    }
}