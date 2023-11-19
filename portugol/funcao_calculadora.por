/*
Fun��o
Implemente uma calculadora (n�meros reais) com suas fun��es
b�sicas: soma, subtra��o, multiplica��o e divis�o.

*/

programa {
  funcao inicio() {
    
    real primeiroNumero
    real segundoNumero
    real resultado
    inteiro opcao

    escreva("Informe o primeiro n�mero: ")
    leia(primeiroNumero)
    escreva("Informe o segundo n�mero: ")
    leia(segundoNumero)
    escreva("Escolha uma das op��es abaixo: ")

    faca{
      escreva("\n[1]-Somar \n[2]-Subtrair \n[3]-Multiplicar \n[4]-Dividir \n[0]-Sair \n")
      leia(opcao)

      se(opcao == 1) {
        escreva("\nResultado soma: ", primeiroNumero, " + ", segundoNumero, " �: ", somar(primeiroNumero, segundoNumero), "\n")
      } senao se(opcao == 2) {
        escreva("\nResultado subtra��o: ", primeiroNumero, " - ", segundoNumero, " �: ", subtrair(primeiroNumero, segundoNumero), "\n")
      } senao se(opcao == 3) {
        escreva("\nResultado multiplica��o: ", primeiroNumero, " * ", segundoNumero, " �: ", Multiplicar(primeiroNumero, segundoNumero), "\n")
      } senao se(opcao == 4) {
        escreva("\nResultado divis�o: ", primeiroNumero, " / ", segundoNumero, " �: ", dividir(primeiroNumero, segundoNumero), "\n")
      } senao se(opcao == 0) {
        escreva("Voc� finalizou a calculadora, caso queira inicie a calculadora novamente!")
      } senao {
        escreva("\nVoc� digitou uma op��o inv�lida. Tente novamente!")
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
