/*
CÁLCULO DE DESCONTO PROGRESSIVO
Desenvolva um programa que realize o cálculo de desconto progressivo em um produto, de acordo com a seguinte tabela:
Para valores menores ou iguais a R$ 50,00, não há desconto;
Para valores entre R$ 50,01 e R$ 100,00, o desconto é de 5%;
Para valores entre R$ 100,01 e R$ 200,00, o desconto é de 10%;
Para valores acima de R$ 200,00, o desconto é de 15%;
O programa deve solicitar ao usuário que digite o valor do produto e, em seguida, calcular o valor do desconto e o valor final do produto com desconto. Ao final, o programa deve exibir o valor original do produto, o valor do desconto e o valor final com desconto.
Exemplo de saída:
Digite o valor do produto: 120.50
Valor original do produto: R$ 120.50 Valor do desconto: R$ 12.05 Valor final com desconto: R$ 108.45
*/

programa {
  inclua biblioteca Matematica --> mat 

  funcao inicio() {
    real valorProduto
    real valorDesconto
    real valorFinal
    escreva("Informe o valor do produto: ")
    leia(valorProduto)

    se(valorProduto <= 50.00){
      valorDesconto == 0
      //valorFinal = valorProduto - valorDesconto
    } senao se(valorProduto <= 100.00){
      valorDesconto = valorProduto * 0.05
    } senao se(valorProduto <= 200.00){
      valorDesconto = valorProduto * 0.10
    } senao {
      valorDesconto = valorProduto * 0.15
    }

    valorFinal = valorProduto - valorDesconto

    escreva("Valor do Produto: R$ ", mat.arredondar(valorProduto, 2), 
            "\nValor do desconto: R$ ", mat.arredondar(valorDesconto, 2), 
            "\nValor do Produto com Desconto: R$ ", mat.arredondar(valorFinal, 2))
  }
}
