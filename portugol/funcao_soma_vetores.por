/*
FUN��O
Fa�a um programa que leia dois vetores A e B, ambos com 7
elementos. Em seguida, calcule e mostre na tela o vetor C, que � a
soma dos elementos correspondentes de A e B.
*/

programa {

  const inteiro TAMANHO = 7

  funcao inicio() {  

    inteiro vetorA[TAMANHO]
    inteiro vetorB[TAMANHO]
    inteiro vetorC[TAMANHO]

    para(inteiro i = 0 ; i < TAMANHO ; i++){
      escreva("Digite o ", (i + 1), "� n�mero: ")
      leia(vetorA[i])
    }

    para(inteiro j  = 0 ; j < TAMANHO ; j++) {
      escreva("Digite o ", (j + 1) , j++)
      leia(vetorB[j])
      vetorC[j] = vetorA[j] + vetorB[j]
    }

      apresentarDados(vetorC)
  
  }


  funcao apresentarDados(inteiro vetor[]) {
    para(inteiro k = 0 ; k < TAMANHO ; k++){
      escreva("[", vetor[k], "]")
    }
  }

}
