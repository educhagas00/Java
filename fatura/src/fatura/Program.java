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
		carrinho.add(carne);
		carrinho.add(bebida);
		carrinho.add(doce);
		
		//mostrando a lista de precos
		for (Item item : carrinho) {
			System.out.println("itens: " + item.getNome());
			System.out.println("quantidade: " + item.getQuantidade());
			System.out.println("preco unitario: " + item.getPreco_unitario());
			System.out.println("");
		}
		
		//criar fatura
		
		

		//mostrar fatura
		//double preco = 0;
		
		//for (Item item : carrinho) {
			//preco += fatura.obtemPreco(); 
		//}
	}
}
