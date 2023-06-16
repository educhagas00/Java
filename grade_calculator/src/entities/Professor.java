package entities;

import java.util.Scanner;

public class Professor extends Pessoa{
	Scanner sc = new Scanner(System.in);
	
	private Turma turma;
	private Calculadora calc = new Calculadora();
	
	public Professor() {
	}
	
	public Professor(String nome, Integer idade, String sexo) {
		super(nome, idade, sexo);
		System.out.println("tamanho da turma: ");
		int x = sc.nextInt();
		this.turma = new Turma(x);
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public Double calcularMediaBimestre1(Aluno aluno) {
		Double soma = calc.soma(aluno.getNota1(), aluno.getNota2());
		return calc.divisao(soma, 2.0);
		
	}
	
	public Double calcularMediaBimestre2(Aluno aluno) {
		Double soma = calc.soma(aluno.getNota3(), aluno.getNota4());
		return calc.divisao(soma, 2.0);
	}
		
	public boolean calcularMediaFinal(Aluno aluno) {
        if(calc.divisao(calc.soma(calcularMediaBimestre1(aluno), calcularMediaBimestre2(aluno)), 2.0) >= 6.0)
            return true ;
        else
            return false ;
    }
}
