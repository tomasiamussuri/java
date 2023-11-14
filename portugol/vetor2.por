/*
VETOR 2
*/

programa {
  funcao inicio() {
  
  real numero
  real numeros[5]
  real soma

  para(inteiro i=0 ; i < 5 ; i++){
    escreva("Informe o ", (i + 1), "º número: ")
    leia(numeros[i])
  }

  para(inteiro j=0 ; j < 5 ; j++){
  escreva("\nO valor da posição ", (j + 1), "ª é: ", numeros[j])
  soma += numeros[j]
  }
  escreva("A soma dos número é: ", soma)
  //escreva("\n", numeros)
  }
}
