/*
VERIFICA��O DE N�MERO PAR OU �MPAR
Solicite ao usu�rio que digite um n�mero;
Armazene o n�mero em uma vari�vel;
Verifique se o n�mero � par ou �mpar;
Se o n�mero for par, exiba a ensagem "O n�mero � par."
Caso contr�rio, exiba a mensagem "O n�mero � �mpar."
*/

programa {
  funcao inicio() {
    inteiro numero            // n�mero inteiro

    escreva("Digite um n�mero: ")
    leia(numero)

    se(numero % 2 == 0) {
      escreva("O n�mero � par.")
    } senao {
      escreva("O n�mero � �mpar.")
    }
    }
  }
}
