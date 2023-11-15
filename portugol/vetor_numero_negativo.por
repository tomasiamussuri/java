/*
Crie um programa que solicita ao usuário que digite 8 números inteiros positivos e negativos e armazene-os em um vetor.
Em seguida, exiba na tela a posição do último número negativo do vetor
*/

programa {
  funcao inicio() {
    
    inteiro numeros[8]
    inteiro numeroNegativo
    inteiro posicaoVetor

    para(inteiro i = 0 ; i < 8 ; i++){
      escreva("Digite o ", (i + 1), "º número: ")
      leia(numeros[i])

      se(numeros[i] < 0){
        numeroNegativo = numeros[i]
        posicaoVetor = i
      }
    }
    escreva(posicaoVetor)
    escreva("O último número negativo do vetor é: ", numeroNegativo, " e está na posição: ", posicaoVetor, " do vetor.")

  }
}
