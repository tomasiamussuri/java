/*
ARMAZENAR NUMEROS E REALIZAR SOMA
Crie um vetor para armazenar 10 números inteiros digitados pelo usuário e, em seguida, faça a soma de todos os valores do vetor.
*/

programa {
  funcao inicio() {
    
    inteiro numeros[10]
    inteiro numerosPares[10]
    inteiro numerosImpares[10]
    inteiro soma = 0
    inteiro qtdePares = 0
    inteiro qtdeImpares = 0

    para(inteiro i = 0 ; i < 10 ; i++){
      escreva("Digite o ", (i+1), "º números: ")
      leia(numeros[i])
      //soma += numeros[i]

      se(numeros[i] % 2 == 0) {
        numerosPares[qtdePares] = numeros[i]
        qtdePares++
      } senao {
        numerosImpares[qtdeImpares] = numeros[i]
        qtdeImpares++
      }      
    }

  // calcula a soma dos valores do vetor
    para(inteiro j = 0 ; j < 10 ; j++){
      soma += numeros[j]
    }

  // exibe os valores do vetor Pares
    escreva("\nPARES\n")
    para(inteiro k = 0 ; k <= qtdePares-1 ; k++){
      escreva("[", numerosPares[k], "] ")
    }

  // exibe os valores do vetor Impares
    escreva("\nIMPARES\n")
    para(inteiro l = 0 ; l <= qtdeImpares-1 ; l++){
      escreva("[", numerosImpares[l], "] ")
    }

    escreva(" A soma dos números digitados é: ", soma)
  }

}
