/*
MATRIZ
Crie uma matriz para armazenar dados em 2 linhas e 2 colunas.
*/

programa {
 // inclua biblioteca Matematica -> mat
    
  funcao inicio() {
    
    const inteiro LINHAS = 2
    const inteiro COLUNAS = 2

    inteiro matrizNumeros[LINHAS][COLUNAS]

    para(inteiro i = 0 ; i < LINHAS ; i++) {
      para(inteiro j = 0 ; j < COLUNAS ; j++) {
        escreva("Digite a informação para a posição [", i, "][", j, "] da matriz: ")
        leia(matrizNumeros[i][j])
      }
    }

    escreva("MATRIZ ORIGINAL \n")
    para(inteiro k = 0 ; k < LINHAS ; k++) {
      para(inteiro l = 0 ; l < COLUNAS ; l++) {
        escreva("[", matrizNumeros[k][l], "]")
      }
    }
    escreva("\n")

    escreva("MATRIZ MODIFICADA \n")
    para(inteiro m = 0 ; m < LINHAS ; m++) {
      para(inteiro n = 0 ; n < COLUNAS ; n++) {
        escreva("[", matrizNumeros[m][n] * matrizNumeros[m][n], "]")
      }
    }
  }
}
