package application;

import java.util.ArrayList;
import java.util.Locale;

import entities.Item;
import entities.Fatura;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//carrinho de itens.
		ArrayList<Item> carrinho = new ArrayList<>();
		
		//criação dos itens.
		Item trakinas = new Item(3, 2.50, "Trakinas");
		Item milka = new Item(5, 10.0, "Milka");
		Item guaraviton = new Item(10, 0.50, "Guaraviton");
		
		//adicionando itens no carrinho.
		carrinho.add(trakinas);
		carrinho.add(guaraviton);
		carrinho.add(milka);
		
		//criação da fatura.
		Fatura fatura = new Fatura("Dudu", "123.456.789-15", carrinho);
		
		fatura.setItens(carrinho);
		
		System.out.println("Nome: " + fatura.getName());
		System.out.println("Cpf: " + fatura.getCpf());
		System.out.println("");
		
		System.out.println("Itens: ");
		
		for(Item item: carrinho) {
			System.out.println("Nome do item: " + item.getName());
			System.out.println("Quantidade: " + item.getQuantidade());
			System.out.println("Preço unitario: " + item.getPrecoUnitario());
		}
		
		double total = fatura.obtemPreco();
		
		System.out.println("Total: " + total);
		
	}

}
