package fatura;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Item> carrinho = new ArrayList<Item>();
		
		//criacao de item
		//(ao preencher deve estar na ordem exata no construtor: qntd, preco, nome.)
		Item doce = new Item(2, 9.90, "Fini Dentadura");
		Item bebida = new Item(1, 6.50, "coquinha");
		Item carne = new Item(13, 1.50, "picanha");
		
		//addicionar item ao pedido
		carrinho.add(doce);
		carrinho.add(bebida);
		carrinho.add(carne);
		
		Fatura fatura = new Fatura("Dudu", "13384934343");
		fatura.setItens(carrinho);
		
		//mostrando a lista de itens
		for (Item item : carrinho) {
			System.out.println("itens: " + item.getNome());
			System.out.println("quantidade: " + item.getQuantidade());
			System.out.println("preco unitario: " + item.getPreco_unitario());
			System.out.println("");
		}
		System.out.println("nome: " + fatura.getNome());
		System.out.println("cpf: " + fatura.getCpf());
		
		//somando total
		double precoTotal = fatura.obtemPreco();
		
		System.out.println("pague: " + precoTotal);	
		
	}
}
