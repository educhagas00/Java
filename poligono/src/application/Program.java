package application;

import entities.Circulo;
import entities.Poligono;
import entities.PoligonoComplex;
import entities.Retangulo;
import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Poligono circulo = new Circulo(5.0);
		Poligono retangulo = new Retangulo(10.0, 3.0);
		Poligono triangulo = new Triangulo(3.0, 4.0);
		
		System.out.println("area circulo = " + circulo.calcularArea());
		System.out.println("area retangulo = " + retangulo.calcularArea());
		System.out.println("area traingulo = " + triangulo.calcularArea());
		
		PoligonoComplex complexo = new PoligonoComplex();
		
		complexo.addPoligono(circulo);
		complexo.addPoligono(retangulo);
		complexo.addPoligono(triangulo);
		
		System.out.println("area = " + complexo.calcularArea());
	}
	
}
