/*
VERIFIA��O DE N�MERO PRIMO
Solicite ao usu�rio que digite um n�mero;
Armazene o n�mero em uma vari�vel;
Verifique se o n�mero � primo;
Se o n�mero for primo, exiba a mensagem "O n�mero � primo";
Caso contr�rio, exiba a mensagem "O n�mero n�o � primo".
*/
programa {
  funcao inicio() {

    inteiro numero
    inteiro contador = 0

    escreva("Digite um numero: ")
    leia(numero)

    para(inteiro x = 1 ; x <= numero ; x++){
      se(numero % x == 0){
          contador = contador + 1
      }
    }

    se(contador == 2){
        escreva(numero, " � primo")
    }senao{
      escreva(numero, " n�o � primo")
    }
    
  }
}
