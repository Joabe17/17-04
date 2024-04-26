package atvi1704;

import java.util.Scanner;

public class Medianota {

	public static void main(String[] args) {

		double nume,md,soma=0,resultado;
		Scanner ler = new Scanner (System.in);

		for (double i=0; i<=4; i++) {
			System.out.println("informe a nota:");
			nume= ler.nextDouble();
			soma += nume;

			md = soma /5;
			System.out.println("sua media é" + md);

		}

	}
}
