/*
M�DIA DE N�MEROS PARES
Crie um algoritmo em Portugol que pe�a ao usu�rio para inserir uma sequ�ncia de n�meros inteiros.
O programa deve calcular e exibir a m�dia dos n�meros pares fornecidos.
A inser��o de n�meros deve ser encerrada quando o usu�rio digitar o n�mero zero (0), e o programa 
deve ent�o mostrar a m�dia calculada.
*/

programa {

  funcao inicio() {

    inteiro somaPares = 0, qtdePares = 0
    real mediaPares = 0

    para(inteiro numero ; numero != 0; ){
      escreva("Informe um n�mero inteiro ou 0 (zero) para sair: ")
      leia(numero)

      se(numero != 0 e numero % 2 == 0){
        somaPares += numero
        qtdePares++
      }
    }

    mediaPares = somaPares / qtdePares
    escreva("A m�dia dos n�meros pares digitados �: ", mediaPares)
  }
}
