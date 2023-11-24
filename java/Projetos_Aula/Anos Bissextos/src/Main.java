import java.util.Scanner;

/*
Determinando Anos Bissextos em Java
Você sabia que no calendário existem anos com 365 dias e outros com 366 dias?
Os anos com 366 dias são conhecidos como anos bissextos e essa adição de um dia extra
ocorre para manter o calendário anual alinhado com a translação da Terra e os eventos
sazonais relacionados às estações do ano.
Para identificar se um ano é bissexto ou não, existem algumas regras a serem seguidas:
1. São bissextos todos os anos múltiplos de 400, como 1600, 2000, 2400, e assim por diante.
2. São bissextos todos os anos múltiplos de 4 e que não são múltiplos de 100, como 1996, 2004, 2008, 2012, entre outros.
3. Todos os demais anos não são bissextos.
Aqui está o desafio: desenvolva um programa em Java que permita ao usuário inserir um ano, e em seguida, informe na tela se esse ano é
bissexto ou não.
Dica de matemática: para verificar se um número é múltiplo de outro, basta calcular o módulo (resto da divisão).
Um número é múltiplo de outro se o resultado do cálculo de módulo for igual a 0.
Requisitos do programa:
• Solicitar ao usuário que insira um ano.
• Calcular se o ano é bissexto ou não de acordo com as regras mencionadas.
• Exibir na tela a resposta, informando se o ano é bissexto ou não.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bissexto bissexto = new Bissexto();

        System.out.print("Informe o ano: ");
        bissexto.ano = sc.nextInt();

        bissexto.calculaBissexto();
    }
}