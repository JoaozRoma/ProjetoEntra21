package lista7;

import java.util.Scanner;

public class questao9
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		int[] vetorA = new int[5];
		int soma = 0;
		int soma1 = 0;
		
		
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Entro com o valorA na posição : "+"["+i+"]");
			vetorA[i] = ent.nextInt();
			
			if(vetorA[i] < 35)
			{
				soma ++;
			}
			else if(vetorA[i] >= 34)
			{
				soma1 ++;
			}
		}
		System.out.println(":"+soma);
		System.out.println(":"+soma1);
		
		ent.close();
	}

}
