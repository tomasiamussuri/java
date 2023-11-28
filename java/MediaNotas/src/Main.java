/*
Crie uma classe "Aluno" que tenha como atributos o nome, a nota do
aluno em uma prova, a média da turma e a disciplina, e como
método a verificação se o aluno foi aprovado ou não, considerando
uma nota de corte.
 */


public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Tomásia");
        aluno.setNotaAluno(9.5f);
        aluno.setMediaTurma(8f);
        aluno.setDisciplina("Programação");

        aluno.verificaAprovacao();
    }
}