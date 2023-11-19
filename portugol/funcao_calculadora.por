/*
Função
Implemente uma calculadora (números reais) com suas funções
básicas: soma, subtração, multiplicação e divisão.

*/

programa {
  funcao inicio() {
    
    real primeiroNumero
    real segundoNumero
    real resultado
    inteiro opcao

    escreva("Informe o primeiro número: ")
    leia(primeiroNumero)
    escreva("Informe o segundo número: ")
    leia(segundoNumero)
    escreva("Escolha uma das opções abaixo: ")

    faca{
      escreva("\n[1]-Somar \n[2]-Subtrair \n[3]-Multiplicar \n[4]-Dividir \n[0]-Sair \n")
      leia(opcao)

      se(opcao == 1) {
        escreva("\nResultado soma: ", primeiroNumero, " + ", segundoNumero, " é: ", somar(primeiroNumero, segundoNumero), "\n")
      } senao se(opcao == 2) {
        escreva("\nResultado subtração: ", primeiroNumero, " - ", segundoNumero, " é: ", subtrair(primeiroNumero, segundoNumero), "\n")
      } senao se(opcao == 3) {
        escreva("\nResultado multiplicação: ", primeiroNumero, " * ", segundoNumero, " é: ", Multiplicar(primeiroNumero, segundoNumero), "\n")
      } senao se(opcao == 4) {
        escreva("\nResultado divisão: ", primeiroNumero, " / ", segundoNumero, " é: ", dividir(primeiroNumero, segundoNumero), "\n")
      } senao se(opcao == 0) {
        escreva("Você finalizou a calculadora, caso queira inicie a calculadora novamente!")
      } senao {
        escreva("\nVocê digitou uma opção inválida. Tente novamente!")
      }

    }enquanto(opcao != 0)
  }

  funcao real somar(real primeiroNumero, real segundoNumero) {
    real resultado = primeiroNumero + segundoNumero
    retorne resultado
  }

  funcao real subtrair(real primeiroNumero, real segundoNumero) {
    real resultado = primeiroNumero - segundoNumero
    retorne resultado
  }

  funcao real Multiplicar(real primeiroNumero, real segundoNumero) {
    real resultado = primeiroNumero * segundoNumero
    retorne resultado 
  }

  funcao real dividir(real primeiroNumero, real segundoNumero) {
    real resultado = primeiroNumero / segundoNumero
    retorne resultado
  }

}
