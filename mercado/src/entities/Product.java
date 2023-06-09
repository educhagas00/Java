package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	//
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	//
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	//

	public void addProducts(int quantity) {
		this.quantity += quantity; 
		//this é auto referencia para o objeto.
		//this especifica que quero me referir ao atributo da classe.
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	// o objeto.toString quando chamado, ira printar exatamente da forma identada que for posto aqui
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)  // definir o numero de casas decimais
			+ ", "
			+ quantity
			+" units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
	

}
