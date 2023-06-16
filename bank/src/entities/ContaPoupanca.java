package entities;

public class ContaPoupanca extends ContaBancaria{

	private String dataAniversario;
	private double taxaRendimento;

	public ContaPoupanca(String nome, Integer numero, double saldo, String dataAbertura, String dataAniversario) {
		super(nome, numero, saldo, dataAbertura);
		this.dataAniversario = dataAniversario;
		this.taxaRendimento = 0.1;
	}
	
	public String getDataAniversario() {
		return dataAniversario;
	}
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}
	
	public void aplicarRendimentos() {
		taxaRendimento = saldo * (1 + taxaRendimento);
	}
}
