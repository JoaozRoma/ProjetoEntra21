package praticaArray;

import java.util.Scanner;

public class praticaarray4 
{


	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		int[]vetor1 = new int[6];
		int menorV = Integer.MAX_VALUE;
		int maiorV = 00000;
		
		for(int i = 0; i < vetor1.length; i++)
		{
			System.out.println("Entro com o valor1 na posição : "+"["+i+"]");
			vetor1[i] = ent.nextInt();
			
			if(vetor1[i] < menorV)
			{
				menorV = vetor1[i];
			}
			
			if(vetor1[i] > maiorV)
			{
				maiorV = vetor1[i];
			}
		}
		for(int i = 0; i < vetor1.length; i++)
		{
			if(vetor1[i]==menorV)
			{
				System.out.println("Vetor :"+"["+i+"]"+vetor1[i]+"<-------- menor valor");	
			}
			else if(vetor1[i]==maiorV)
			{
				System.out.println("Vetor :"+"["+i+"]"+vetor1[i]+"<-------- maior valor");	
			}
			else
				System.out.println("Vetor :"+"["+i+"]"+vetor1[i]);	

		}
		
		ent.close();

	}

}
