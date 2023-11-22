/*
MATRIZ
Dada uma matriz 4x4 de inteiros, imprimir o número de linhas e o
número de colunas da matriz.
*/
programa {
  funcao inicio() {

    //const inteiro LINHAS = 4
    //const inteiro COLUNAS = 4
    inteiro matriz [4][4] = { {1,2,3,4}, 
                              {5,6,7,8},
                              {9,10,11,12},
                              {13,14,15,16} }
    
    para(inteiro k = 0 ; k < 4 ; k++) {
      para(inteiro l = 0 ; l < 4 ; l++) {
        escreva("[", matriz[k][l], "]")
      }
    escreva("\n")
    }
  }
}