/*
FUN��O
Escreva uma fun��o para calcular se um dado inteiro � par ou
�mpar.
*/

programa {

  funcao inicio() {

    inteiro numero

    escreva("Digite um n�mero: ")
    leia(numero)

    logico n = validar(numero)

    se (n){
      escreva("N�mero par")
    }  senao {
      escreva("N�mero �mpar")
    }
  }


  funcao logico validar(inteiro numero){
    logico resultado = numero % 2 == 0
    retorne resultado
  }
}
