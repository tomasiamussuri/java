/*
CONVERSÃO DE MOEDAS
Solicite ao usuário que digite um valor em reais;
Armazene o valor em uma variável;
Solicite ao usuário que digite a cotação do dólar;
Armazene a cotação em uma variável;
Converta o valor em reais para dólares utilizando a fórmula: valor em dólares = valor em reais / cotação;
Exiba o valor em dólares.
*/

programa {
  funcao inicio() {
    real valorReal
    real valorDolar
    real cotacao

    escreva("Informe o valor em real para converter em dólar: ")
    leia(valorReal)

    escreva("Qual o valor da cotação do dólar? ")
    leia(cotacao)

    valorDolar = valorReal * cotacao

    escreva("O valor convertido para dólar é: ", valorDolar)
  }
}
