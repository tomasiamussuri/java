/*
Escreva uma fun��o de potencia��o, em que os dados de entrada s�o: base e expoente (inteiros).
*/

programa {
  inteiro numero
  inteiro expoente

  funcao inicio() {
    escreva("Digite o n�mero: ")
    leia(numero)
    escreva("Digite o expoente: ")
    leia(expoente)

    escreva(exponenciacao())
  }

  funcao exponenciacao() {
    inteiro resultado = numero
    
    para(inteiro i = 1 ; i <= expoente ; i++) {
      resultado = (resultado * numero)
    }
    retorne resultado
  }
}