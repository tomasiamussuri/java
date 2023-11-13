/*
MAIOR E MENOR VALOR EM UM CONJUNTO
Implemente um programa em Portugol que instrua o usuário a digitar um total de 50 valores numéricos.
O algoritmo deve determinar qual é o maior e o menor valor entre todos os números digitados e, em
seguida, apresentar esses valores ao usuário.
*/

programa {
  funcao inicio() {
    inteiro numero
    inteiro maior
    inteiro menor

    escreva("Digite um número: ")
    leia(numero)
    maior = numero
    menor = numero

    para(inteiro i = 1 ; i < 5 ; i++){
      escreva("Digite um número: ")
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
      escreva("Digite 50 números inteiros: ")
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

    escreva("O maior número digitado foi: ", maior, " e o menor foi: ", menor, ".") 

  }
}
*/