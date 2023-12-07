public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    public void imprimir() {
        System.out.println("NOME: " + this.nome);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nAnimal: " + getClass().getName() +
                "\nNOME: " + nome;
    }

    public abstract void falar();

}
