package entities;

import java.util.Scanner;

public class Turma {
	Scanner sc = new Scanner(System.in);
	
	private Aluno[] alunos;
	
	public Turma() {
	}

	public Turma(Integer n) {
		this.alunos = new Aluno[n];
	}
	
	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public void addAluno() {
		
		System.out.println("NOME | IDADE | SEXO | NOTA 1 | NOTA 2 | NOTA 3 | NOTA 4");
		
		for(int i = 0; i < alunos.length; i ++)
		{
			alunos[i] = new Aluno(sc.nextLine(), sc.nextInt(), sc.nextLine(), 
					sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		}
	}
}
