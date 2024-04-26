package atvi1704;

import java.util.Scanner;

public class Numerospar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nume;
		Scanner ler =  new Scanner (System.in);
		nume = ler.nextInt();
		
		for (int i =nume; i<=nume; i++) {
			if (nume % 2 == 0)
				System.out.println("o numero é par");
			else
				System.out.println("o numero é impar");
			
		}
		ler.close();
	}

}
