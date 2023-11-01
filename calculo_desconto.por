/* 
CALCULO DE DESCONTO
Solicite ao usuário que digite o valor do produto:
Armazene o número em uma variável;
Verifique se o valor é maior que R$ 50,00;
Se o valor for maior que R$ 50,00, calcule o desconto de 10% sobre o valor e exiba o novo valor com desconto";
Caso contrário, exiba a mensagem "Não há desconto para este produto".
*/

programa {
  funcao inicio() {
    real valorProduto
    //real valorComDesconto


    escreva("Digite o valor do produto: ")
    leia(valorProduto)

    //escreva("O número digitado foi: ", numero)

    se(valorProduto > 50.00) {
      //valorComDesconto = (valorProduto - (valorProduto * 0.10) )
      valorProduto = (valorProduto - (valorProduto * 0.10))
      escreva("\nO valor do produto com desconto é de R$ ", valorProduto, " .")
       
    } senao {
      escreva("\nNão há desconto para este produto.")
    }    
  }
}
