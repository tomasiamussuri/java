/*
MAIOR E MENOR VALOR EM UM CONJUNTO
Implemente um programa em Portugol que instrua o usu�rio a digitar um total de 50 valores num�ricos.
O algoritmo deve determinar qual � o maior e o menor valor entre todos os n�meros digitados e, em
seguida, apresentar esses valores ao usu�rio.
*/

programa {
  funcao inicio() {
    inteiro numero
    inteiro maior
    inteiro menor

    escreva("Digite um n�mero: ")
    leia(numero)
    maior = numero
    menor = numero

    para(inteiro i = 1 ; i < 5 ; i++){
      escreva("Digite um n�mero: ")
      leia(numero)
      se(numero > maior) {
        maior = numero
      } senao se(numero < menor) {
        menor = numero
      }
    }
    escreva("Maior valor: ",maior," Menor valor: ",menor)
  }
}

/*
// USANDO ENQUANTO
programa {

  inteiro contador = 1
  inteiro numero
  inteiro maior = 0
  inteiro menor = 0

  funcao inicio() {

    enquanto(contador <= 5){
      escreva("Digite 50 n�meros inteiros: ")
      leia(numero)
      
      se(contador == 1){
        maior = numero
        menor = numero
        contador++
      } senao {
          contador++
          se(numero > maior){
          maior = numero
          }

          se(numero < menor){
            menor = numero
          }
      }
      
    }

    escreva("O maior n�mero digitado foi: ", maior, " e o menor foi: ", menor, ".") 

  }
}
*/