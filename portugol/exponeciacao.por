/*
Escreva uma função de potenciação, em que os dados de entrada são: base e expoente (inteiros).
*/

programa {
  inteiro numero
  inteiro expoente

  funcao inicio() {
    escreva("Digite o número: ")
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