package application;

import java.util.ArrayList;

import entities.Conta;
import entities.ContaCartaoCredito;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Conta> cliente = new ArrayList<Conta>();
		
		Conta joao = new ContaPoupanca("João", 43121344, 0.00, "26/11/2001", "15/07/2003");
		Conta jose = new ContaCorrente("José", 31231231, 0.00, "16/04/1976");
		Conta maria = new ContaCartaoCredito("Maria", 13792037, 0.00, "25/12/2000");
		
		cliente.add(joao);
		cliente.add(jose);
		cliente.add(maria);
		
		((ContaPoupanca) joao).creditar(100.00);
		((ContaCorrente) jose).debitar(20.00);

		for(Conta clientes: cliente) {
			System.out.println("Nome: " + clientes.getNome());
			System.out.println("Numero: " + clientes.getNumero());
			System.out.println("Saldo: " + clientes.getSaldo());
			System.out.println("");
		}
		
		System.out.println("------------------------------------------");
		
		((ContaPoupanca) joao).aplicarRendimentos();
		((ContaCorrente) jose).aplicarRendimentos();
		
		((ContaCartaoCredito) maria).cobrarJuros();
		
		for(Conta clientes: cliente) {
			System.out.println("Nome: " + clientes.getNome());
			System.out.println("Numero: " + clientes.getNumero());
			System.out.println("Saldo: " + clientes.getSaldo());
			System.out.println("");
		}
	}
}
