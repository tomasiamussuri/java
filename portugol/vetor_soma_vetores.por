/*
Faça um programa que leia dois vetores A e B, ambos com 7
elementos. Em seguida, calcule e mostre na tela o vetor C, que é a
soma dos elementos correspondentes de A e B.
*/


programa {
  funcao inicio() {
    
    inteiro vetorA[7]
    inteiro vetorB[7]
    inteiro vetorC[7]

    para(inteiro i = 0 ; i < 7 ; i++){
      escreva("Digite o ", (i + 1), "º número para o vetor A: ")
      leia(vetorA[i])
    }

    para(inteiro j = 0 ; j < 7 ; j++){
      escreva("Digite o ", (j + 1), "º número para o vetor B: ")
      leia(vetorB[j])
      vetorC[j] = vetorA[j] + vetorB[j]
    }
    escreva("\nVetor A: ", vetorA)
    escreva("\nVetor B: ", vetorB)
    escreva("\nA soma dos valores dos vetores é: ", vetorC)
  }
}
