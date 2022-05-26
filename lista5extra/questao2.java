package lista5extra;

import java.util.Scanner;

public class questao2 
{

	public static void main(String[] args)
	{
		float p1,p2,p3;
		Scanner ent = new Scanner(System.in);

		

		
		
		System.out.println("===================================");
		System.out.println("====== comparador 3 produtos ======");
		System.out.println("===================================");

		System.out.println("Digite o valor do produto 1 : ");
		p1 = ent.nextFloat();
		
		System.out.println("Digite o valor do produto 2 : ");
		p2 = ent.nextFloat();
		
		System.out.println("Digite o valor do produto 3 : ");
		p3 = ent.nextFloat();
		
		if(p1 < p2 && p1 < p3)
		{
			System.out.println("O produto 1 é o mais barato : ");
		}
		else if(p2 < p3 && p2 < p1)
		{
			System.out.println("O produto 2 é o mais barato : ");
		}
		else if(p3 < p1 && p3 < p2)
		{
			System.out.println("O produto 3 é o mais barato : ");
		}
		

		
		
		ent.close();
	}

}
