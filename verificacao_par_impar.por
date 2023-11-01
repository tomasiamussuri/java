/*
VERIFICAÇÃO DE NÚMERO PAR OU ÍMPAR
Solicite ao usuário que digite um número;
Armazene o número em uma variável;
Verifique se o número é par ou ímpar;
Se o número for par, exiba a ensagem "O número é par."
Caso contrário, exiba a mensagem "O número é ímpar."
*/

programa {
  funcao inicio() {
    inteiro numero            // número inteiro

    escreva("Digite um número: ")
    leia(numero)

    se(numero % 2 == 0) {
      escreva("O número é par.")
    } senao {
      escreva("O número é ímpar.")
    }
    }
  }
}
