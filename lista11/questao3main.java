package lista_oop_3;

import java.util.Iterator;
import java.util.Scanner;

public class questao3main
{

	public static void main(String[] args) 
	{
		questao3classe Aluno = new questao3classe();
		Scanner ent = new Scanner(System.in);
	
		
		System.out.println("Digite o nome do aluno :");
		Aluno.setNome(ent.next());
		
		System.out.println("Digite o numero de matricula :");
		Aluno.setNumMatricula(ent.nextInt());
		
		System.out.println("Digite o curso :");
		Aluno.setCurso(ent.next());
		
		
		for (int i = 0; i < Aluno.getLoop(); i++) 
		{
			System.out.println("Digite o nome da "+(i+1)+" materia : ");
			Aluno.setMateria(i, ent.next());
			
			for (int j = 0; j < Aluno.getLoop(); j++) 
			{
				System.out.println("Digite a "+ (j+1) +"° Nota : ");
				Aluno.setNotas(i, j, ent.nextDouble());
			}
			
		}
		Aluno.mostrarResul();
		

	}

}