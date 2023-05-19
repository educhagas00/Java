package boletim;
import java.util.ArrayList;

public class Aluno extends Pessoa {
	ArrayList<Double> notas = new ArrayList<Double>();

	public Aluno(String nome, String cpf) {
		super(nome, cpf);
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void addNota(double nota) {
		notas.add(nota);
	}
	
	public double getMedia() {
		double notaFinal = 0;
		for (Double nota : notas) {
			
			notaFinal += nota;
			
		}
		return notaFinal/2;
	}

	
	public static void main(String[] args) {
		
		Aluno dudu = new Aluno("Dudu", "123.453.153-77");
	
		//adicionar o nome do objeto criado, no caso dudu.
		dudu.addNota(7.5);
		dudu.addNota(8.9);
		
		System.out.println("media do aluno:" + dudu.getMedia());
	}
}
