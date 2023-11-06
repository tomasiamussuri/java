/*
VERIFICAÇÃO DE ANO BISSEXTO
Solicite ao usuário que digite um ano;
Armazene o ano em uma variável;
Verifique se o ano é bissexto de acordo com as seguintes regras:
Anos divisíveis por 4 são bissextos;
Anos divisíveis por 100 não são bissextos, exceto os anos divisíveis por 400;
Se o ano for bissexto, exiba a mensagem "O ano é bissexto";
Caso contrário, exiba a mensagem "O ano não é bissexto".
*/

programa {
  funcao inicio() {
    inteiro ano
    
    escreva("Digite um ano: ")
    leia(ano)

    se( (ano % 4 == 0) ou (ano % 400 == 0) ){
      escreva("O ano: ", ano, " é bissexto.")
    } senao {
      escreva("O ano: ", ano, " não é bissexto.")
    }
  }
}
