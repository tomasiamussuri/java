/*
FUN��O
Escreva uma fun��o que retorne o menor n�mero de um vetor
(n�meros reais).
*/

programa {

  real numeros[5]
  
  funcao inicio() {

    para(inteiro i = 0 ; i < 5 ; i++) {
      escreva("Digite o ", (i + 1), "� n�mero: ")
      leia(numeros[i])
    }

    escreva(validaNumero(numeros))
  }

  funcao real validaNumero(real numeros[]){
    real menorNumero = numeros[0]

    para(inteiro i = 0 ; i < 5 ; i++) {
      se(numeros[i] < menorNumero){
          menorNumero = numeros[i]
        }
    }
    retorne menorNumero
  }

}
