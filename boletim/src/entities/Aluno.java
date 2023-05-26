package entities;

public class Aluno {
	
	private String name;
	private double p1, p2, p3;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	//
	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}
	//
	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}
	//
	public double getP3() {
		return p3;
	}

	public void setP3(double p3) {
		this.p3 = p3;
	}
	
	public double getMedia(double p1, double p2, double p3) {
		return (p1 + p2 + p3);
	}
	
	public boolean result(double media) {
		if(media >= 60)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double missingPoints(double media) {
		return 60 - media;
	}
}
