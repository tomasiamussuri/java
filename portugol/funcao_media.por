/*
------------------------------ INCOMPLETO -------------------------
FUN��O
Fa�a uma fun��o que receba um vetor de reais e retorne a m�dia dele.
*/

programa {

  real numeros[3]
  real soma

  funcao inicio() {

    para(inteiro i = 0 ; i < 3 ; i++){ 
    escreva("Digite o ", (i + 1), "� n�mero: ")
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
