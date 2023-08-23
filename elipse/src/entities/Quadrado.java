package entities;

public class Quadrado extends Retangulo{

	public Quadrado(double largura, double comprimento) {
		super(largura, comprimento);
	}
	
	public double area() {
		return largura * comprimento;
	}
	
	public double perimetro() {
		return ( largura + comprimento ) * 2;
	}
	
	public void imprimir() {
		System.out.println("area = " + area() + " , perimetro = " + perimetro());
	}
}
