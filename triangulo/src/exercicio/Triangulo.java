package exercicio;

public class Triangulo {
	
	private double a, b, c;

	public double getA() {
		return a;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public double getB() {
		return b;
	}
	
	public void setB(double b) {
		this.b = b;
	}
	
	public double getC() {
		return c;
	}
	
	public void setC(double c) {
		this.c = c;
	}
	
	
	public double area() {
		double p = (a + b + c )/ 2.0;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
	}
}
