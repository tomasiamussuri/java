/*
Crie uma classe "Livro" que tenha como atributos o título, o autor, o
número de páginas, o ano de publicação e a editora do livro, e como
método a impressão das informações do livro.
 */
public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setTitulo("Programação em Java");
        livro.setAutor("Tomásia Mussurí");
        livro.setNumeroPagina(147);
        livro.setAno(2023);
        livro.setEditora("Senai");

        livro.mostrarDados();
    }
}