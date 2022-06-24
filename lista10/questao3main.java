package lista10;

import java.util.Iterator;
import java.util.Scanner;

public class questao3main
{

	public static void main(String[] args) 
	{
		questao3classe Aluno = new questao3classe();
		Scanner ent = new Scanner(System.in);
	
		
		System.out.println("Digite o nome do aluno :");
		Aluno.nome = ent.next();
		
		System.out.println("Digite o numero de matricula :");
		Aluno.NumMatricula= ent.nextInt();
		
		System.out.println("Digite o curso :");
		Aluno.curso= ent.next();
		
		
		for (int i = 0; i < Aluno.loop; i++) 
		{
			System.out.println("Digite o nome da "+(i+1)+" materia : ");
			Aluno.materia[i] = ent.next();
			
			for (int j = 0; j < Aluno.loop; j++) 
			{
				System.out.println("Digite a "+ (j+1) +"° Nota : ");
				Aluno.notas[i][j] = ent.nextDouble();
			}
		}
		Aluno.mostrarResul();
		

	}

}
