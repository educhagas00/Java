package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		
		System.out.println("Name: ");
		
		product.setName(sc.nextLine());
		 
		System.out.println("Price: ");
		 
		product.setPrice(sc.nextDouble());
		
		System.out.println("Quantity in Stock: ");
		
		product.setQuantity(sc.nextInt());
		
		System.out.println(product.getName() + ", " + product.getPrice() + ", " + product.getQuantity());
		
		sc.close();
	}

}
