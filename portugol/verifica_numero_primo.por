/*
VERIFIAÇÃO DE NÚMERO PRIMO
Solicite ao usuário que digite um número;
Armazene o número em uma variável;
Verifique se o número é primo;
Se o número for primo, exiba a mensagem "O número é primo";
Caso contrário, exiba a mensagem "O número não é primo".
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
        escreva(numero, " é primo")
    }senao{
      escreva(numero, " não é primo")
    }
    
  }
}
