/*
CONVERS�O DE MOEDAS
Solicite ao usu�rio que digite um valor em reais;
Armazene o valor em uma vari�vel;
Solicite ao usu�rio que digite a cota��o do d�lar;
Armazene a cota��o em uma vari�vel;
Converta o valor em reais para d�lares utilizando a f�rmula: valor em d�lares = valor em reais / cota��o;
Exiba o valor em d�lares.
*/

programa {
  funcao inicio() {
    real valorReal
    real valorDolar
    real cotacao

    escreva("Informe o valor em real para converter em d�lar: ")
    leia(valorReal)

    escreva("Qual o valor da cota��o do d�lar? ")
    leia(cotacao)

    valorDolar = valorReal * cotacao

    escreva("O valor convertido para d�lar �: ", valorDolar)
  }
}
