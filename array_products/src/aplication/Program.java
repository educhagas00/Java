package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos produtos?");
		int n = sc.nextInt();
		
		Product[] products = new Product[n]; //novo vetor de tamanho n.
		
		for(int i = 0; i < products.length; i++) {
			sc.nextLine(); // quebra linha do /n.
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			products[i] = new Product(name, price); //intancia de novo product com vect na posica i apontando para esse objeto.
		}
		
		double soma = 0.0;
		
		for(int i = 0; i < products.length; i++){
			System.out.println(products[i].getName());
			System.out.println(products[i].getPrice());
			System.out.println("");
			
			soma += products[i].getPrice();
		}
		
		System.out.printf("Preco medio: %.2f%n", soma / products.length);
		
		sc.close();
	}
}
