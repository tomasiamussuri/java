/*
Crie um vetor para armazenar 5 n�meros inteiros digitados pelo
usu�rio e, em seguida, determine a m�dia dos valores do vetor
*/

programa {
  funcao inicio() {

    inteiro numeros[5]
    inteiro soma = 0
    real media = 0

    para(inteiro i = 0 ; i < 5 ; i++){
      escreva("Digite o ", (i+1), "� n�mero: ")
      leia(numeros[i])
      soma += numeros[i]
      media = soma / 5
    }
    escreva("A m�dia dos valores digitados �: ", media)
  }
}
