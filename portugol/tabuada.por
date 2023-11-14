/*
TABUADA DE NÚMEROS
Descrição: Elabore um algoritmo em Portugol que solicite ao usuário que insira 20 números, um de cada vez.
Para cada número informado, o programa deve gerar e exibir a tabuada completa de multiplicação desse número, começando do 1 e
indo até o próprio número fornecido.
*/

programa {
  funcao inicio() {
  
  inteiro numero
  inteiro contador
//  escreva("Informe um número: ")
//  leia(numero)
//  escreva(numero, " X ", contador, " = ", numero * contador) 

  para(contador = 1 ; contador <= 3 ; contador++){
    escreva("\nInforme um número: ")
    leia(numero)

    para(inteiro j = 1 ; j <= numero ; j++)
      escreva("\n\t",numero, " X ", j, " = ", (numero * j)\n) 
  }
  
  }
}
