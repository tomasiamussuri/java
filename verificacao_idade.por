/*
VERIFICAÇÃO DE IDADE
Solicite ao usuário que digite sua idade;
Armazene o valor em uma variável;
Verifique se a idade é maior ou igual a 18 anos;
Se a idade for maior ou igual a 18 anos, exiba a mensagem: "Você pode dirigir.";
Caso contrário, exiba a mensagem "Você não pode dirigir."
*/

programa {
  funcao inicio() {
    inteiro idade

    escreva("Digite a sua idade: ")
    leia(idade)

    se(idade >= 18) {
      escreva("Você pode dirigir.")
    } senao {
      escreva("Você não pode dirigir.")
    }



  }
}
