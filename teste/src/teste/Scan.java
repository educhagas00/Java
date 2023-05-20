package teste;
import java.util.Scanner;

public class Scan {
	
	public static void main(String[] args) {
		
		int x;
		String c, v, b;
		
		Scanner sc = new Scanner(System.in);
		
		x= sc.nextInt();
		//evitar erro de quebra de linha
		sc.nextLine();
		c = sc.nextLine();
		b = sc.nextLine();
		v = sc.nextLine();
		sc.close();
		
		
		System.out.println("vc digitou: " + x + "\n" + c + "\n" + b + "\n" + v);
		
			
	}

}

