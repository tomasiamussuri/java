/*
Crie um programa que solicita ao usu�rio que digite 8 n�meros inteiros positivos e negativos e armazene-os em um vetor.
Em seguida, exiba na tela a posi��o do �ltimo n�mero negativo do vetor
*/

programa {
  funcao inicio() {
    
    inteiro numeros[8]
    inteiro numeroNegativo
    inteiro posicaoVetor

    para(inteiro i = 0 ; i < 8 ; i++){
      escreva("Digite o ", (i + 1), "� n�mero: ")
      leia(numeros[i])

      se(numeros[i] < 0){
        numeroNegativo = numeros[i]
        posicaoVetor = i
      }
    }
    escreva(posicaoVetor)
    escreva("O �ltimo n�mero negativo do vetor �: ", numeroNegativo, " e est� na posi��o: ", posicaoVetor, " do vetor.")

  }
}
