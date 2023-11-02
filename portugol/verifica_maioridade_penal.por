/*
VERIFICAÇÃO DE MAIORIDADE PENAL
Solicite ao usuário que digite sua idade;
Armazene a idade em uma variável;
Verifique se a idade é maior ou igual a 18 anos;
Se a idade for maior ou igual a 18 anos, exiba a mensagem "Você é penalmente responsável";
Caso contrário, exiba a mensagem "Você não é penalmente responsável".
*/

programa {
  funcao inicio() {
    inteiro idade

    escreva("Informa a sua idade: ")
    leia(idade)

    se(idade <= 18){
      escreva("Você é penalmente responsável")
    } senao {
      escreva("Você não é penalmente responsável")
    }

  }
}
