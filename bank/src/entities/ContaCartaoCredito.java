package entities;

public class ContaCartaoCredito extends Conta{

	public ContaCartaoCredito (String nome, Integer numero, double saldo, String dataAbertura) {
		super(nome, numero, saldo, dataAbertura);
	}
	
	public void pagar() {
		
	}
	
	public void cobrarJuros() {
		saldo = saldo * 1.05;
	}
	
}
