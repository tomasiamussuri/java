/*
Um comerciante está curioso para saber o preço médio que vendeu as 3 últimas caixas de bombons e contratou você para desenvolver
um programa que resolva isso.
Como você ainda não aprendeu a receber parâmetros, você pediu ao comerciante os 3 últimos preços que ele vendeu as caixas de
bombons para incluir dentro do código-fonte do programa (mas prometeu arrumar isso assim que aprendesse).
O comerciante lhe passou os seguintes valores: 5, 8, 12. Desenvolva um programa que calcula a média desses números.
1. Crie um arquivo chamado "PrecoMedioBombom.java" e coloque o seguinte código-fonte dentro dele:

2. Agora temos os preços atribuídos às variáveis dentro de nosso programa. Inclua um comentário de linha acima das variáveis para
ficar mais claro para outros programadores que por acaso precisem trabalhar neste código-fonte no futuro.

3. Calcule a média dos preços e atribua o resultado em outra variável.

4. Imprima na tela os 3 preços e a média calculada. Use sequências de escape em algum lugar para praticar.

5. Compile e execute o programa.
*/

public class PrecoMedioBombom {
	public static void main(String[]args) {
	
	// variaveis criadas para atribuir valores de venda
	int caixaBombomUm = 5;
	int caixaBombomDois = 8;
	int caixaBombomTres = 12;
	
	int media = (caixaBombomUm + caixaBombomDois + caixaBombomTres) / 3;
	
	System.out.println("\"Sistema de Calculo de Media\"");
	System.out.println("Caixa 1 -> " + caixaBombomUm);
	System.out.println("Caixa 2 -> " + caixaBombomDois);
	System.out.println("Caixa 3 -> " + caixaBombomTres);
	System.out.println("Media -> " + media);

	}
}
