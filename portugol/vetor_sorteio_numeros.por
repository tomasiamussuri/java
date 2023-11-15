/*
Crie um vetor de numero aleatorio simulando 6 números para mega sena.
*/

programa {
  inclua biblioteca Util --> u

  funcao inicio() {

    inteiro numeroInicial = 1
    inteiro numeroFInal = 60
    inteiro numerosSorteados[6]
    
    para(inteiro i = 0 ; i < 6 ; i++){
      numerosSorteados[i] = u.sorteia(numeroInicial, numeroFInal)
    }

    escreva(numerosSorteados)
  }
}
