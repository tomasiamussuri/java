/*
VERIFICA��O DE TRI�NGULO
Solicite ao usu�rio que digite tr�s valores que representam os lados de um tri�ngulo;
Armazene os valores em vari�veis;
Verifique se os valores formam um tri�ngulo;
Se os valores formarem um tri�ngulo, exiba a mensagem "Os valores formam um tri�ngulo";
Caso contr�rio, exiba a mensagem "Os valores n�o formam um tri�ngulo".
*/
programa {
  funcao inicio() {
    real ladoa
    real ladob
    real ladoc

    escreva("Informe 3 valores para representar os lados de um tri�ngulo: ")
    leia(ladoa)
    leia(ladob)
    leia(ladoc)

    se( ((ladoa + ladob) > ladoc) ou ((ladoa + ladoc) > ladob) ou ((ladob + ladoc) > ladoa) ){
      escreva("Os valores informados formam um tri�ngulo.")
    } senao {
      escreva("Os valores informados n�o formam um tri�ngulo")
    }

  }
}
