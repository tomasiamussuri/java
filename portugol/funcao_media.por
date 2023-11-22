/*
------------------------------ INCOMPLETO -------------------------
FUNÇÃO
Faça uma função que receba um vetor de reais e retorne a média dele.
*/

programa {

  real numeros[3]
  real soma

  funcao inicio() {

    para(inteiro i = 0 ; i < 3 ; i++){ 
    escreva("Digite o ", (i + 1), "º número: ")
    leia(numero[i])
    soma += numero[i]
    }
    escreva(media())
  }

  funcao media() {
    real media = (soma / 3)
    retorne media
  }

}
