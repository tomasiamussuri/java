public class Livro extends Produto {
    private String autor;

    public Livro(String autor) {
        setNomeLoja("Brasileiras");
        setPreco(49);
        this.autor = autor;
    }

    public Livro() {

    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }
}
