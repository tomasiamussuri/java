/*
FUNÇÃO
Faça uma função que receba um vetor de reais e retorne a média dele.
*/

programa {

  real numeros[3]
  real soma = 0
  real media = 0

  funcao inicio() {

    para(inteiro i = 0 ; i < 3 ; i++){ 
    escreva("Digite o ", (i + 1), "º número: ")
    leia(numeros[i])
    soma += numeros[i]
    }
    escreva("\nSoma: ", soma)
    escreva("\nMédia: ", media())
  }

  funcao media() {
    media = (soma / 3)
    retorne media
  }

}
