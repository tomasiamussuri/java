/*
-------------------------- INCOMPLETO -------------------
MATRIZ
Faça um programa que preenche uma matriz 4x4 com o produto do valor da linha e da coluna de cada elemento.
Em seguida, imprima na tela a matriz.
*/
programa {

  funcao inicio() {

  const inteiro LINHAS = 4
  const inteiro COLUNAS = 4
  inteiro matriz[LINHAS][COLUNAS]

    para(inteiro i = 0 ; i < LINHAS ; i++){
      para(inteiro j = 0 ; j < COLUNAS ; j++) {
        escreva("Digite a informação para a posição [", i, "][", j, "] da matriz: ")    
        leia(matriz[i][j])    
      }
    }  

    para(inteiro k = 0 ; k < LINHAS ; k++){
      para(inteiro l = 0 ; l < COLUNAS ; l++){
        escreva("[",matriz[k][l], "] ")
      }
      escreva("\n")
    }
  }
}




