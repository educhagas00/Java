package entities;

public class Aluno extends Pessoa{
	
	private Double nota1, nota2, nota3, nota4;
	private boolean aprovado;
	
	public Aluno() {
	}
	
	public Aluno(String nome, Integer idade, String sexo, Double nota1, Double nota2, Double nota3, Double nota4) {
		super(nome, idade, sexo);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

	public Double getNota4() {
		return nota4;
	}

	public void setNota4(Double nota4) {
		this.nota4 = nota4;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
	public void responderChamada() {
		System.out.println(nome + ": Aquiii!!");
	}
	
	public void imprimirAluno() {
		System.out.printf("Nome: %s | Nota1: %.2f | Nota2: %.2f | Nota3: %.2f | ");
	}
	
}
