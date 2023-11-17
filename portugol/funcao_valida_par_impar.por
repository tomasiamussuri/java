/*
FUNÇÃO
Escreva uma função para calcular se um dado inteiro é par ou
ímpar.
*/

programa {

  funcao inicio() {

    inteiro numero

    escreva("Digite um número: ")
    leia(numero)

    logico n = validar(numero)

    se (n){
      escreva("Número par")
    }  senao {
      escreva("Número ímpar")
    }
  }


  funcao logico validar(inteiro numero){
    logico resultado = numero % 2 == 0
    retorne resultado
  }
}
