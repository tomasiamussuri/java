/*
 Crie uma classe "Produto" que tenha como atributos o nome, o preço,
a quantidade em estoque, a marca e a descrição do produto, e
como método a atualização da quantidade em estoque após uma
venda.
 */
public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        estoque.setQtdeEstoque(10);
        estoque.calcularEstoque(2);

        System.out.println(estoque.getQtdeEstoque());
    }
}