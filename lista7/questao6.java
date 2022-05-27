package lista7;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		int[] vetorA = new int[3];
		float soma = 0 ;
		float res = 0;
		
		
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Entro com o valorA na posição : "+"["+i+"]");
			vetorA[i] = ent.nextInt();
			
			if(vetorA[i] % 2 == 0)
				System.out.println("");
			
			else
				soma += vetorA[i];
				res = soma / 3;
				
		}
		System.out.println(""+res);
		

		ent.close();

	}

}

