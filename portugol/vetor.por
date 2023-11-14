//VETOR

programa {
  funcao inicio() {
    cadeia nomes[3]

    nomes[0] = "Leandro Soares"
    nomes[1] = "Tomasia Mussuri"
    nomes[2] = "Lucia Silva"

    para(inteiro i = 0 ; i < 3 ; i++)
      escreva("\nO nome que está na posição ", i,  " é: ", nomes[i])
    
  }
}
