/*
Crie um algoritmo que leia 10 números aleatórios pelo teclado.
Depois de ler os 10 números, o algoritmo deve apresentar:
• Os valores digitados.
• Os valores digitados na ordem inversa.
*/
programa {
  funcao inicio() {
    
    const inteiro QTDE = 10
    inteiro numeros[QTDE]
    

    para(inteiro i = 0 ; i < QTDE ; i++) {
      escreva("Digite o ", (i+1), "º número: ")
      leia(numeros[i])
    }

    para(inteiro j = 0 ; j < QTDE ; j++){
      escreva("[", numeros[j], " ]")
    }

    escreva("\n")
    
    para(inteiro k = (QTDE - 1) ; k >= 0 ; k--){
      escreva("[", numeros[k], " ]")
    }

  }
}

