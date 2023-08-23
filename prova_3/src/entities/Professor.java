package entities;

public class Professor {
	
	public Aluno[] turma;

	public Double calcularMediaBimestre1(int indice, Aluno[] turma) {
		return (turma[indice].getNota1() + turma[indice].getNota2()) / 2;
	}
	
	public Double calcularMediaBimestre2(int indice, Aluno[] turma) {
		return (turma[indice].getNota3() + turma[indice].getNota4()) / 2; 
	}  
	
	public void calcularMediaFinal(int indice, Aluno[] turma) {
		double x = (turma[indice].getNota1() + turma[indice].getNota2()) / 2;
		double y = (turma[indice].getNota3() + turma[indice].getNota4()) / 2; 
		
		double media_final = (x + y) / 2;
		
		turma[indice].setMediaFinal(media_final);
		
		if(turma[indice].getMediaFinal() >= 6.0) {
			turma[indice].setAprovado(true);
		}
		else {
			turma[indice].setAprovado(false);
		}
	}
	
}
