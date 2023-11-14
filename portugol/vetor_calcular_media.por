/*
Crie um vetor para armazenar 5 números inteiros digitados pelo
usuário e, em seguida, determine a média dos valores do vetor
*/

programa {
  funcao inicio() {

    inteiro numeros[5]
    inteiro soma = 0
    real media = 0

    para(inteiro i = 0 ; i < 5 ; i++){
      escreva("Digite o ", (i+1), "º número: ")
      leia(numeros[i])
      soma += numeros[i]
      media = soma / 5
    }
    escreva("A média dos valores digitados é: ", media)
  }
}
