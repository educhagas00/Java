package fatura;
import java.util.ArrayList;

public class Fatura {
	
	private String nome;
	private String cpf;
	private ArrayList<Item> itens;
	
	public Fatura(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.itens = new ArrayList<Item>(); 
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	//
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	//
	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public void addItem(Item item) {
		itens.add(item);
	}
	
	public double obtemPreco() {
		double precoFinal = 0;
		for (Item item : itens) {
			precoFinal += item.getPreco_unitario() * item.getQuantidade();
		}
		
		
	return precoFinal; 
	}
}
