package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		 
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		System.out.println("Quantity in Stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("");
		
		System.out.println("Product data: " + product);
		System.out.println("");
		
		System.out.println("Enter the number of products to be added in stock: ");
		int number = sc.nextInt();
		product.addProducts(quantity); //objeto . metodo da classe product (variavel) ; .
		
		System.out.println("Updated: " + product);
		System.out.println("");
		
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(number);
		
		System.out.println("Updated: " + product);
		System.out.println("");
		
		sc.close();
	}

}
