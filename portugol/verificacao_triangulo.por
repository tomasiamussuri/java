/*
VERIFICAÇÃO DE TRIÂNGULO
Solicite ao usuário que digite três valores que representam os lados de um triângulo;
Armazene os valores em variáveis;
Verifique se os valores formam um triângulo;
Se os valores formarem um triângulo, exiba a mensagem "Os valores formam um triângulo";
Caso contrário, exiba a mensagem "Os valores não formam um triângulo".
*/
programa {
  funcao inicio() {
    real ladoa
    real ladob
    real ladoc

    escreva("Informe 3 valores para representar os lados de um triângulo: ")
    leia(ladoa)
    leia(ladob)
    leia(ladoc)

    se( ((ladoa + ladob) > ladoc) ou ((ladoa + ladoc) > ladob) ou ((ladob + ladoc) > ladoa) ){
      escreva("Os valores informados formam um triângulo.")
    } senao {
      escreva("Os valores informados não formam um triângulo")
    }

  }
}
