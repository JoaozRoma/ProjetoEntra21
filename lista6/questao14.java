package lista6;

import java.util.Scanner;

public class questao14 
{

	public static void main(String[] args) 
	{
	Scanner ent = new Scanner(System.in);

	

		float mediaCd = 0f;
		float valorTotal = 0f; 
		int numCD ;
		
		System.out.println("Digite uma quantidade de cd : ");
		numCD = ent.nextInt();
		
		for(int i = 1; i <= numCD; i++)
		{
			System.out.println("Digite o valor do cd"+i+" : ");
			
			valorTotal += ent.nextFloat();
			
			mediaCd = valorTotal / numCD;
		}
		System.out.println("O valor da media de cd foi  : "+mediaCd);
		System.out.println("O valor total foi de : "+valorTotal);
		
		
				
		
		ent.close();

	}

}
