package entities;

public class Item {
	
	private int quantidade;
	private double precoUnitario;
	private String name;
	
	public Item(int quantidade, double precoUnitario, String name) {
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		this.name = name;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public String getName() {
		return name;
	}
	
}
