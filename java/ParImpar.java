
class ParImpar {
	public static void main(String[]args){
		
		int numeroA = 98;
		int numeroB = 100;
		int resultado = numeroA * numeroB;
		
		if(resultado % 2 == 0){
			System.out.println("O numero: " + resultado + " e par.");	
		} else {
			System.out.println("O numero: " + resultado + "e impar.");
		}
	}
}

