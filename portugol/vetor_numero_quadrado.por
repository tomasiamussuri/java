/*
Ler um conjunto de n�meros reais, armazenando-o em vetor e
calcular o quadrado das componentes deste vetor, armazenando
o resultado em outro vetor. Os conjuntos t�m 10 elementos cada.
Imprimir todos os conjuntos.
*/

programa {
  funcao inicio() {
    
    real numeros[10]
    real quadrado[10]

    para(inteiro i = 0 ; i < 10 ; i++){
      escreva("Digite o ", (i + 1), "� n�mero: ")
      leia(numeros[i])
      quadrado[i] = numeros[i] * numeros[i]
    }

    escreva("\nOs n�meros digitados foram: ", numeros)
    escreva("\nO quadrado dos n�meros digitados �: ", quadrado)
  }
}
