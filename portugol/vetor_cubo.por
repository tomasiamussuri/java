/*
Ler um conjunto de n�meros reais, armazenando-o em vetor e calcular o cubo dos componentes deste vetor,
armazenando o resultado em outro vetor. 
Os conjuntos t�m 10 elementos cada.
Imprimir todos os conjuntos.
*/

programa {
  funcao inicio() {
    real numeros[10]
    real cubo[10]

    para(inteiro i = 0 ; i < 10 ; i++){
      escreva("Digite o ", (i + 1), "� n�mero: ")
      leia(numeros[i])
    }

    para(inteiro j = 0 ; j < 10 ; j++){
      cubo[j] = numeros[j] * numeros[j] * numeros[j]
    }

    escreva("[", numeros, "]")
    escreva("\n")
    escreva("[", cubo, "]")
  }
}
