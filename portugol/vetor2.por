/*
VETOR 2
*/

programa {
  funcao inicio() {
  
  real numero
  real numeros[5]
  real soma

  para(inteiro i=0 ; i < 5 ; i++){
    escreva("Informe o ", (i + 1), "� n�mero: ")
    leia(numeros[i])
  }

  para(inteiro j=0 ; j < 5 ; j++){
  escreva("\nO valor da posi��o ", (j + 1), "� �: ", numeros[j])
  soma += numeros[j]
  }
  escreva("A soma dos n�mero �: ", soma)
  //escreva("\n", numeros)
  }
}
