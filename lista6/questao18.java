package lista6;

import java.util.Scanner;

public class questao18 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		int ano = 0;
		
		double a, b;
		
		float porA, porB;
		
		float porAA, porBB;
		
		
	
		System.out.println("Digite o numero da populçãp A :");
		a = ent.nextDouble();
		
		System.out.println("Digite o numero da populçãp B :");
		b = ent.nextDouble();
		
		System.out.println("Digite porcetgem de crescimento da população A :");
		porA = ent.nextFloat();

		System.out.println("Digite porcetgem de crescimento da população B :");
		porB = ent.nextFloat();
		
		while (a<=b) 
		{
			porAA = porA / 100;
			porBB = porB / 100;

			a = a + a * porAA;   

			b = b + b * porBB; 

			ano=ano+1;   
			
		}
	
		System.out.println( "Anos: "+ano);
		
		
		
		

		ent.close();
		
		

	}

}
