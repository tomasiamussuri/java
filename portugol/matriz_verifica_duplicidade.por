/*
------------------------- INCOMPLETO ----------------------------------
MATRIZ
Faça um programa que leia uma matriz [5,5] de inteiros e verifique se existem elementos repetidos.
*/
programa {
  funcao inicio() {
    
    const inteiro LINHAS = 2
    const inteiro COLUNAS = 2
    inteiro matriz[LINHAS][COLUNAS]

    para(inteiro i = 0 ; i < LINHAS ; i++) {
      para(inteiro j = 0 ; j < COLUNAS ; j++) {
        escreva("Digite a informação para a posição [", i, "][", j, "] da matriz: ")
        leia(matriz[i][j])
      }
    }

    para(inteiro k = 0 ; k < LINHAS ; k++) {
      para(inteiro l = 0 ; l < COLUNAS ; l++) {
        para(inteiro m = 0 ; m < LINHAS ; m++) {
          para(inteiro n = 0 ; n < COLUNAS ; n++) {
            se(matriz[k] == matriz[m] e k != m) {
              escreva("indice = [", i, "] valor = [", j, "] ")
            }
          }
        }
      }
      escreva("\n")
    }

  } 
}

// codigo feito pelo professor utilizando vetor
/*
programa
{
	
	funcao inicio()
{
		inteiro vetor[] = {2,5,9,2,2}

		para(inteiro i=0 ; i < 5 ; i++){
			para(inteiro j=0 ; j < 5 ; j++){
				se(vetor[i] == vetor[j] e i != j){
					escreva("indice =",i," valor = ",vetor[i],"\n")
				}
			}
		}
	}
}
*/




