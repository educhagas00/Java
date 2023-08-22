package entities;

public class Retangulo extends Forma{
	
	protected double largura;
	protected double comprimento;
	
	public Retangulo() {
		
	}
	
	public Retangulo(double largura, double comprimento) {
		this.largura = largura;
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double area() {
		return largura * comprimento;
	}
	
	public double perimetro() {
		return (largura + comprimento) * 2;
	}
	
	public void imprimir() {
		System.out.println("area = " + area() + " , perimetro = " + perimetro());
	}
	
}
