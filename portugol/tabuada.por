/*
TABUADA DE N�MEROS
Descri��o: Elabore um algoritmo em Portugol que solicite ao usu�rio que insira 20 n�meros, um de cada vez.
Para cada n�mero informado, o programa deve gerar e exibir a tabuada completa de multiplica��o desse n�mero, come�ando do 1 e
indo at� o pr�prio n�mero fornecido.
*/

programa {
  funcao inicio() {
  
  inteiro numero
  inteiro contador
//  escreva("Informe um n�mero: ")
//  leia(numero)
//  escreva(numero, " X ", contador, " = ", numero * contador) 

  para(contador = 1 ; contador <= 3 ; contador++){
    escreva("\nInforme um n�mero: ")
    leia(numero)

    para(inteiro j = 1 ; j <= numero ; j++)
      escreva("\n\t",numero, " X ", j, " = ", (numero * j)\n) 
  }
  
  }
}
