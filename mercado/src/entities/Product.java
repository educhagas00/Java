package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; 
		//this é auto referencia para o objeto.
		//this especifica que quero me referir ao atributo da classe.
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

}
