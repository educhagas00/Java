package entities;

import java.util.ArrayList;

public class Fatura {
	
	private String name;
	private String cpf;
	private ArrayList<Item> itens;
	
	public Fatura(String name, String cpf, ArrayList<Item> itens) {
		this.name = name;
		this.cpf = cpf;
		this.itens = new ArrayList<Item>();
	}

	public String getName() {
		return name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public ArrayList<Item> getItens() {
		return itens;
	}
	
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
	
	public double obtemPreco() {
		double total = 0;
		for(Item item : itens) {
			
			total += item.getPrecoUnitario() * item.getQuantidade();
		}
		return total;
	}
}
