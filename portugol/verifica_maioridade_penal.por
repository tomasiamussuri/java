/*
VERIFICA��O DE MAIORIDADE PENAL
Solicite ao usu�rio que digite sua idade;
Armazene a idade em uma vari�vel;
Verifique se a idade � maior ou igual a 18 anos;
Se a idade for maior ou igual a 18 anos, exiba a mensagem "Voc� � penalmente respons�vel";
Caso contr�rio, exiba a mensagem "Voc� n�o � penalmente respons�vel".
*/

programa {
  funcao inicio() {
    inteiro idade

    escreva("Informa a sua idade: ")
    leia(idade)

    se(idade <= 18){
      escreva("Voc� � penalmente respons�vel")
    } senao {
      escreva("Voc� n�o � penalmente respons�vel")
    }

  }
}
