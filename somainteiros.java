package atvi1704;

public class somainteiros {
	
	public static void main(String[] args) {
		double nume,inte,soma=0, resultado;
		Scanner ler = new Scanner (System.in);
		
		for (double i=o; i<=9; i++) {
			System.out.println("Informe o numerro:");
			nume= ler.nextDouble();
			soma += nume;
			
	}
		inte =soma;
		System.out.println("sua soma é:" + inte);
		ler.close ();
		if (soma % 2 == 0)
			System.out.println("o numero é par");
		else
			System.out.println("o numerp é impar");
		
	}

}
