/*
Ler um conjunto de números reais, armazenando-o em vetor e
calcular o quadrado das componentes deste vetor, armazenando
o resultado em outro vetor. Os conjuntos têm 10 elementos cada.
Imprimir todos os conjuntos.
*/

programa {
  funcao inicio() {
    
    real numeros[10]
    real quadrado[10]

    para(inteiro i = 0 ; i < 10 ; i++){
      escreva("Digite o ", (i + 1), "º número: ")
      leia(numeros[i])
      quadrado[i] = numeros[i] * numeros[i]
    }

    escreva("\nOs números digitados foram: ", numeros)
    escreva("\nO quadrado dos números digitados é: ", quadrado)
  }
}
