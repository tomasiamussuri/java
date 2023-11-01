/*
Verificação de número positivo:
Solicite ao usuário que digite um número;
Armazene o número em uma variável;
Verifique se o numero é positivo;
Se o número for positivo, exiba a mensagem "O número é positivo";
Caso contrário, exiba a mensagem "O número é negativo".
*/

programa {
  funcao inicio() {
    inteiro numero

    escreva("Digite um número inteiro: ")
    leia(numero)

    //escreva("O número digitado foi: ", numero)

    se(numero >= 0){
      escreva("\nO número ", numero, " é positivo.")
    } senao {
      escreva("\nO número ", numero, " é negativo.")
    }    
  }
}
