/* 
CALCULO DE DESCONTO
Solicite ao usu�rio que digite o valor do produto:
Armazene o n�mero em uma vari�vel;
Verifique se o valor � maior que R$ 50,00;
Se o valor for maior que R$ 50,00, calcule o desconto de 10% sobre o valor e exiba o novo valor com desconto";
Caso contr�rio, exiba a mensagem "N�o h� desconto para este produto".
*/

programa {
  funcao inicio() {
    real valorProduto
    //real valorComDesconto


    escreva("Digite o valor do produto: ")
    leia(valorProduto)

    //escreva("O n�mero digitado foi: ", numero)

    se(valorProduto > 50.00) {
      //valorComDesconto = (valorProduto - (valorProduto * 0.10) )
      valorProduto = (valorProduto - (valorProduto * 0.10))
      escreva("\nO valor do produto com desconto � de R$ ", valorProduto, " .")
       
    } senao {
      escreva("\nN�o h� desconto para este produto.")
    }    
  }
}
