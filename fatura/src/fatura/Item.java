package fatura;

public class Item {
	
	private String nome;
	private double preco_unitario;
	private int quantidade;
	
	public Item(int quantidade, double preco_unitario, String nome) {
		this.nome = nome;
		this.preco_unitario = preco_unitario;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	
}
