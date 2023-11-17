/*
FUNÇÃO
Escreva uma função para calcular o fatorial de um número inteiro.
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
