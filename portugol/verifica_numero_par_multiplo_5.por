/*
VERIFICAÇÃOO DE NÚMERO PAR E MÚLTIPLO DE 5
Solicite ao usuário que digite um número;
Armazene o número em uma variável;
Verifique se o número é par e múltiplo de 5;
Se o número for par e múltiplo de 5, exiba a mensagem "O número é par e múltiplo de 5";
Caso contrário, exiba a mensagem "O número não atende aos critérios".
*/
programa {
  funcao inicio() {
    inteiro numero

    escreva("DIgite um número: ")
    leia(numero)

    se(numero % 2 == 0 e numero % 5 == 0){
      escreva("O número é par e múltiplo de 5.")
    } senao {
      escreva("O número não atende aos critérios.")
    }


  }
}
