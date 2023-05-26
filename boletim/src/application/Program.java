package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.setName(sc.nextLine());
		aluno.setP1(sc.nextDouble());
		aluno.setP2(sc.nextDouble());
		aluno.setP3(sc.nextDouble());
		
		double media = aluno.getMedia(aluno.getP1(), aluno.getP2(), aluno.getP3());
		
		System.out.println(aluno.getName());
		System.out.println("FINAL GRADE = " + media);
		
		if(aluno.result(media) == true)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAILED");
			System.out.println("MISSING POINTS: " + aluno.missingPoints(media));
		}
		
		sc.close();
	}
}
