/*
VERIFICA��O DE IDADE
Solicite ao usu�rio que digite sua idade;
Armazene o valor em uma vari�vel;
Verifique se a idade � maior ou igual a 18 anos;
Se a idade for maior ou igual a 18 anos, exiba a mensagem: "Voc� pode dirigir.";
Caso contr�rio, exiba a mensagem "Voc� n�o pode dirigir."
*/

programa {
  funcao inicio() {
    inteiro idade

    escreva("Digite a sua idade: ")
    leia(idade)

    se(idade >= 18) {
      escreva("Voc� pode dirigir.")
    } senao {
      escreva("Voc� n�o pode dirigir.")
    }



  }
}
