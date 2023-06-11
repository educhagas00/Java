package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("augusto");
		list.add("dudu");
		list.add("victor");
		list.add("wong");
		list.add("paulo");
		list.add("calbo");
		list.add("menduina");
		list.add("erick");
		
		list.add(2, "andreza"); //adiciona o elemento na posição 2.
		
		System.out.println(list.size());//tamanho da lista

		for(String x : list) //pra cada string x pertencente a lista list...
		{
			System.out.println(x); //...printar valor de x.
		}
		
		System.out.println("---------------------");
		
		list.removeIf(x -> x.charAt(0) == 'v'); //remove cada elemento que comece com 'v'.
		
		for(String x : list) 
		{
			System.out.println(x); 
		}
		System.out.println("----------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
			//cria uma lista nova, 
			//converto para stream,
			//filtro apenas os elementos que comecam com 'a',
			//converto de volta para list.
		
		for(String x : result) 
		{
			System.out.println(x); 
		}
		
		System.out.println("----------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'a').findFirst().orElse(null);
			//procura o primeiro elemento que comeca com 'a'.
		
		System.out.println(name);
	}
}
