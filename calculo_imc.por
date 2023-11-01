/*
CALCULO DO INDICE DE MASSA CORPORAL (IMC)
Solicite ao usuario que digite seu peso em quilos;
Armazene o peso em uma variavel;
Solicite ao usuario que digite sua altura em metros;
Armazene a altura em uma variavel;
Calcule o IMC utilizando a formula: IMC = PESO / (ALTURA X ALTURA);
Verifique o resultado do IMC e exiba a mensagem "Abaixo do peso ideal", "Peso normal", "Sobrepeso" ou "Obesidade", de acordo com a tabela de classificacao do IMC 
*/

programa {
  funcao inicio() {
    real peso
    real altura
    real imc

    escreva("Informe seu peso em quilos: ")
    leia(peso)

    escreva("Informe sua altura em metros: ")
    leia(altura)

    imc = peso / (altura * altura)

    se(imc < 18.5){
      escreva("Abaixo do peso ideal")
    } senao se(imc < 24.9){
      escreva("Peso normal")
    } senao se(imc < 29.9){
      escreva("Sobrepeso")
    } senao {
      escreva("Obesidade")
    }

  }
}
