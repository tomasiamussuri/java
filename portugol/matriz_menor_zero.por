/*
MATRIZ
Faça um programa que leia uma matriz 3x4 de inteiros, substitua seus elementos negativos por 0 e imprima a matriz original e a
modificada.
*/

programa {

  funcao inicio() {

  const inteiro LINHAS = 3
  const inteiro COLUNAS = 4
  inteiro matrizOriginal[LINHAS][COLUNAS]
  inteiro matrizModificada[LINHAS][COLUNAS]

    para(inteiro i = 0 ; i < LINHAS ; i++) {
      para(inteiro j = 0 ; j < COLUNAS ; j++) {
        escreva("Digite a informação para a posição [", i, "][", j, "] da matriz: ")
        leia(matrizOriginal[i][j])
        se(matrizOriginal[i][j] < 0) {
          matrizModificada[i][j] = 0
        } senao {
          matrizModificada[i][j] = matrizOriginal[i][j]
        }
      }
    }

    escreva("\nMATRIZ ORIGINAL\n")
    para(inteiro k = 0 ; k < LINHAS ; k++) {
      para(inteiro l = 0 ; l < COLUNAS ; l++) {
        escreva("[", matrizOriginal[k][l], "]")
      }
      escreva("\n")
    }

    escreva("\nMATRIZ MODIFICADA\n")
    para(inteiro m = 0 ; m < LINHAS ; m++) {
      para(inteiro n = 0 ; n < COLUNAS ; n++) {
        escreva("[", matrizModificada[m][n], "]")
      }
      escreva("\n")
    }

  }
}
