package entities;

public class Circulo extends Poligono{
	
	private double raio;
	
	public Circulo(Double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return Math.PI * (raio * raio);
	}

}
