package entities;

public abstract class Conta {

	protected String nome;
	protected Integer numero;
	protected double saldo;
	protected String dataAbertura;
	
	public Conta (String nome, Integer numero, double saldo, String dataAbertura) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public String getDataAbertura() {
		return dataAbertura;
	}
	
	public Double obterSaldo() {
		return saldo;
	}
}
