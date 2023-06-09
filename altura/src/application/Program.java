package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas?");
		int n = sc.nextInt();
		
		double[] vect = new double[n]; //declaração do vetor.
		
		System.out.println("");
		System.out.printf("Digite a altura das %d pessoas:\n", n);
		
		//recebimento das alturas.
		for (int i = 0; i < n; i++)
		{
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i = 0; i < n; i++)
		{
			soma += vect[i];
		}
		
		System.out.printf("Altura media: %.2f%n", soma/n);
		
		sc.close();
	}
}
