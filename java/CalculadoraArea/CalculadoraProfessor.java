/*
Um professor universitário precisa de um programa para calcular a área de um círculo a partir do raio. Isso irá economizar bastante tempo dele
ao elaborar exercícios para seus alunos.
O programa tem outros requisitos importantes para o professor: incluir uma opção para exibir (ou não) a fórmula usada para calcular a área e 
sempre exibir o resultado com casas decimais e também em inteiro.
O professor ficou sabendo que você está estudando Java e decidiu contratar seus serviços. Então, mãos à obra!
1. Para calcular a área de um círculo, deve-se multiplicar o raio ao quadrado por PI. Sabe-se que o valor de PI é uma constante igual a
3.14. Para começar, crie um programa chamado "CalculadoraProfessor", defina as variáveis "pi" e "raio", calcule a área e imprima o resultado.

2. Compile e execute o programa. Apesar de ainda não ter finalizado todo o trabalho, é uma boa prática compilar e executar seus programas
com frequência, assim o risco de bugs é bem menor.

3. Inclua o código para conversão da área para o tipo inteiro e também para imprimir o resultado em inteiro na tela.

4. Compile e execute o programa para testar as alterações.

5. Alterne o valor da variável "raio", compile, execute e veja os diferentes resultados
*/


public class CalculadoraProfessor{
	public static void main(String[]args) {
		// constante do Pi - http://pt.wikipedia.org/wiki/Pi
			float pi = 3.14f;
		// raio - informado pelo professor
			float raio = 7.93f;
		// area e igual ao raio ao quadrado multiplicado por Pi
			float area = (raio * raio) * pi;
			int areaSemCasasDecimais = (int) area;
			
		System.out.println("Resultado: " + area);
		System.out.println("Resultado sem casas decimais: " + areaSemCasasDecimais);

	}
}
