/*
Verifica��o de n�mero positivo:
Solicite ao usu�rio que digite um n�mero;
Armazene o n�mero em uma vari�vel;
Verifique se o numero � positivo;
Se o n�mero for positivo, exiba a mensagem "O n�mero � positivo";
Caso contr�rio, exiba a mensagem "O n�mero � negativo".
*/

programa {
  funcao inicio() {
    inteiro numero

    escreva("Digite um n�mero inteiro: ")
    leia(numero)

    //escreva("O n�mero digitado foi: ", numero)

    se(numero >= 0){
      escreva("\nO n�mero ", numero, " � positivo.")
    } senao {
      escreva("\nO n�mero ", numero, " � negativo.")
    }    
  }
}
