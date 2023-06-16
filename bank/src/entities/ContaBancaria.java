package entities;

public abstract class ContaBancaria extends Conta{
	
	public ContaBancaria(String nome, Integer numero, double saldo, String dataAbertura) {
		super(nome, numero, saldo, dataAbertura);
	}
	
	public void creditar(double valor) {
		saldo += valor;
	}

	public void debitar(double valor) { 
		saldo -= valor;
	}
	
	public abstract void aplicarRendimentos();
	
}
