/*
FUNÇÃO
Escreva uma função que retorne o menor número de um vetor
(números reais).
*/

programa {

  real numeros[5]
  
  funcao inicio() {

    para(inteiro i = 0 ; i < 5 ; i++) {
      escreva("Digite o ", (i + 1), "º número: ")
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
