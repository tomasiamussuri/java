/*
VERIFICA��OO DE N�MERO PAR E M�LTIPLO DE 5
Solicite ao usu�rio que digite um n�mero;
Armazene o n�mero em uma vari�vel;
Verifique se o n�mero � par e m�ltiplo de 5;
Se o n�mero for par e m�ltiplo de 5, exiba a mensagem "O n�mero � par e m�ltiplo de 5";
Caso contr�rio, exiba a mensagem "O n�mero n�o atende aos crit�rios".
*/
programa {
  funcao inicio() {
    inteiro numero

    escreva("DIgite um n�mero: ")
    leia(numero)

    se(numero % 2 == 0 e numero % 5 == 0){
      escreva("O n�mero � par e m�ltiplo de 5.")
    } senao {
      escreva("O n�mero n�o atende aos crit�rios.")
    }


  }
}
