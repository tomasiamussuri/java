/*
FUN��O
Escreva uma fun��o para calcular o fatorial de um n�mero inteiro.
*/

programa {
  funcao inicio() {
    
    inteiro numero = 7
    inteiro resultadoFatorial = fatorial(numero)

    escreva(resultadoFatorial)

  }

  funcao inteiro fatorial(inteiro numero){
   
   inteiro resultado = 1
    para(inteiro i = 1 ; i <= numero ; i++){
      resultado *= i
    }
    retorne resultado

  }

}
