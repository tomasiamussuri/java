/* 
CONVERSÃO DE TEMPERATURA
Solicite ao usuário que digite uma temperatura em Celsius:
Armazene o número em uma variável;
Converta a temperatura para Fahrenheit utilizando a fórmula: F = (C x 1.8) + 32;
Exiba a temperatura em Fahrenheit";
*/

programa {
  funcao inicio() {
    real temperatura

    escreva("Digite a temperatura em graus Celsius: ")
    leia(temperatura)

    temperatura = ((temperatura * 1.8) + 32)
    escreva("A temperatura convertida é de ", temperatura, " graus Fahrenheit.")
  
  }
}
