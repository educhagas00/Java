package entities;

public class Elipse extends Forma implements Excentricidade{

	protected double eixoA;
	protected double eixoB;
	
	public Elipse(double eixoA, double eixoB) {
		this.eixoA = eixoA;
		this.eixoB = eixoB;
	}

	public double area() {
		return Math.PI * eixoA * eixoB;
	}
	
	public double perimetro() {
		return Math.PI * Math.sqrt(2 * ( (Math.pow(eixoA, 2) + Math.pow(eixoB, 2) ) - Math.pow( (eixoA - eixoB), 2) ) / 2);
	}
	
	public double calcularExcentricidade(double eixoA, double eixoB) {
		return Math.sqrt(1 -  Math.pow(eixoA, 2) / Math.pow(eixoB, 2) );
	}
	
	public void imprimir() {
		System.out.println("area = " + area() + " , perimetro = " + perimetro());
	}
	
}
