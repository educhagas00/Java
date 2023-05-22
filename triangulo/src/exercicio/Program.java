package exercicio;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
	
		System.out.println("Enter the measures of triangle x: ");
		x.setA(sc.nextDouble());
		x.setB(sc.nextDouble());
		x.setC(sc.nextDouble());
		
		System.out.println("Enter the measures of triangle y: ");
		y.setA(sc.nextDouble());
		y.setB(sc.nextDouble());
		y.setC(sc.nextDouble());
		
		double p = (x.getA() + x.getB() + x.getC()) / 2.0;
		double areaX = Math.sqrt(p * (p - x.getA()) * (p - x.getB()) * (p - x.getC()));
		
		p = (y.getA() + y.getB() + y.getC()) / 2.0;
		double areaY = Math.sqrt(p * (p - y.getA()) * (p - y.getB()) * (p - y.getC()));

		System.out.println("Triangle X area: " + areaX);
		System.out.println("Triangle Y area: " + areaY);
		System.out.println("");
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else if (areaX < areaY){
			System.out.println("Larger area: Y\n");
		}
		else if(areaX == areaY) {
			System.out.println("They're the same measures.\n");
		}
		
		sc.close();
	}
}
