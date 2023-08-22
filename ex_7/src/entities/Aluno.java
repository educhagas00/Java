package entities;

public class Aluno extends Pessoa{
	
	private Notas[] notas; 
	
	public Aluno(){	
	}
	
	public Aluno(String nome, String cpf, Notas[] notas) {
		super(nome, cpf);
		this.notas = notas;
	}

	public Notas[] getNotas() {
		return notas;
	}

	public void setNotas(Notas[] notas) {
		this.notas = notas;
	}
	
}
