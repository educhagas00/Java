package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Product> list = new ArrayList<Product>();
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.println("Commom, used or imported? (c/u/i)");
			char c = sc.next().charAt(0);
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			
			if(c == 'c') {
				
				list.add(new Product(name, price));
			}
			else if (c == 'i') {
				
				System.out.println("Customs fee: ");
				double fee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, fee));
			}
			else if(c == 'u') {	
				
				System.out.println("Manufacture date: ");
				sc.nextLine();
				String date = sc.nextLine();
				
				list.add(new UsedProduct(name, price, date));
			}
		}
		
		System.out.println("");
		System.out.println("PRICE TAGS: ");
		
		for(Product product: list) {
			System.out.println(product.priceTag());
		}
		
		
		
		
		sc.close();
	}
}
