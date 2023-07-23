package entities;

import java.util.ArrayList;

public class PoligonoComplex extends Poligono{
	
	ArrayList<Poligono> poligonos;
	
	public PoligonoComplex() {
		this.poligonos = new ArrayList<>();
	}

	public void addPoligono(Poligono poligono) {
		poligonos.add(poligono);
	}
	
	public ArrayList<Poligono> getPoligonos() {
		return poligonos;
	}

	public void setPoligonos(ArrayList<Poligono> poligonos) {
		this.poligonos = poligonos;
	}
	
	public double calcularArea() {
		
		double total = 0;
		
		for(Poligono poligono: poligonos) {
			total += poligono.calcularArea();
		}
		
		return total;
	}
	
}
