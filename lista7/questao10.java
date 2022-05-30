package lista7;

import java.util.Scanner;

public class questao10 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		

		int n = 10;
		double nota1[] = new double[n];
		double nota2[] = new double[n];
		double resul[] = new double[n];
		
		
		
		for(int i = 0; i < n; i++)
		{
			System.out.printf("Informe as notas do %2do. aluno de %d. \n",(i+1),n);
			System.out.printf("1a. Nota = : ");
			nota1[i] = ent.nextDouble();
			
			System.out.printf("2a. Nota = : ");
			nota2[i] = ent.nextDouble();
			
			resul[i] = (nota1[i] + nota2[i]) / 2;
			
			System.out.printf("\n");

		}
		
		System.out.printf("\n Aluno|1a.Nota| 2a.Nota| Media|situação.");
		System.out.printf("\n==========================================");
		
		for(int i = 0; i < n; i++)
		{
			System.out.printf("\n %5d %7.2f %7.2f %5.2f",(i+1),nota1[i],nota2[i],resul[i]);
			if(resul[i] >= 7.0)
				System.out.printf("  APROVADO");
				
			else
			System.out.printf("  REPROVADO");
		}	
		System.out.printf("\n==========================================");



	}

}
