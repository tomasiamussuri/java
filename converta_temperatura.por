/* 
CONVERS�O DE TEMPERATURA
Solicite ao usu�rio que digite uma temperatura em Celsius:
Armazene o n�mero em uma vari�vel;
Converta a temperatura para Fahrenheit utilizando a f�rmula: F = (C x 1.8) + 32;
Exiba a temperatura em Fahrenheit";
*/

programa {
  funcao inicio() {
    real temperatura

    escreva("Digite a temperatura em graus Celsius: ")
    leia(temperatura)

    temperatura = ((temperatura * 1.8) + 32)
    escreva("A temperatura convertida � de ", temperatura, " graus Fahrenheit.")
  
  }
}
