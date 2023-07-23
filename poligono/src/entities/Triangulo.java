package entities;

public class Triangulo extends Poligono{
	
	private double base;
	private double altura;
	
	public Triangulo(Double base, Double altura) {
		this.altura = altura;
		this.base = base;
	}

	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		return (base * altura) / 2;
	}
}
