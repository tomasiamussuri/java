/*
MÉDIA DE NÚMEROS PARES
Crie um algoritmo em Portugol que peça ao usuário para inserir uma sequência de números inteiros.
O programa deve calcular e exibir a média dos números pares fornecidos.
A inserção de números deve ser encerrada quando o usuário digitar o número zero (0), e o programa 
deve então mostrar a média calculada.
*/

programa {

  funcao inicio() {

    inteiro somaPares = 0, qtdePares = 0
    real mediaPares = 0

    para(inteiro numero ; numero != 0; ){
      escreva("Informe um número inteiro ou 0 (zero) para sair: ")
      leia(numero)

      se(numero != 0 e numero % 2 == 0){
        somaPares += numero
        qtdePares++
      }
    }

    mediaPares = somaPares / qtdePares
    escreva("A média dos números pares digitados é: ", mediaPares)
  }
}
