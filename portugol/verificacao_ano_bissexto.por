/*
VERIFICA��O DE ANO BISSEXTO
Solicite ao usu�rio que digite um ano;
Armazene o ano em uma vari�vel;
Verifique se o ano � bissexto de acordo com as seguintes regras:
Anos divis�veis por 4 s�o bissextos;
Anos divis�veis por 100 n�o s�o bissextos, exceto os anos divis�veis por 400;
Se o ano for bissexto, exiba a mensagem "O ano � bissexto";
Caso contr�rio, exiba a mensagem "O ano n�o � bissexto".
*/

programa {
  funcao inicio() {
    inteiro ano
    
    escreva("Digite um ano: ")
    leia(ano)

    se( (ano % 4 == 0) ou (ano % 400 == 0) ){
      escreva("O ano: ", ano, " � bissexto.")
    } senao {
      escreva("O ano: ", ano, " n�o � bissexto.")
    }
  }
}
