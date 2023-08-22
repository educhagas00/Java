package entities;

public class Notas {

	private String data;
	private double valor;
	
	public Notas() {
	}
	
	public Notas(String data, double valor) {
		this.data = data;
		this.valor = valor;
	}
	
	public String getData() {
		return data;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void setData(String data) {
		this.data = data;
	}
}
