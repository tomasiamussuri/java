/*
CONTAGEM DE VALROES NEGATIVOS
Desenvolva um programa em Portugol que solicite ao usuário a entrada de cinco valores numéricos, um após o outro. O programa deve 
contar quantos desses valores são negativos. Ao final da entrada dos dados, o programa deverá exibir a quantidade de valores 
negativos informados pelo usuário.
*/
programa {
  funcao inicio() {
    inteiro qtdeNegativos = 0, numero
    cadeia numerosNegativos = ""

    para(inteiro contador = 1 ; contador <= 5 ; contador++){
      escreva("Informe um numero: ")
      leia(numero)

      se(numero < 0){
        qtdeNegativos++ 
        numerosNegativos += ", " + numero 
      }
    }

    escreva("Quantidade de numeros negativos foram: ", qtdeNegativos)
    escreva("\nOs numeros digitados foram: ",numerosNegativos)
    
  }
}
