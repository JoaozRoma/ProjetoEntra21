package lista7;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		int[] vetorA = new int[10];
		int contpar = 0;
		int contImp = 0;
		
		
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Entro com o valorA na posição : "+"["+i+"]");
			vetorA[i] = ent.nextInt();
			
			if(vetorA[i] % 2 == 0)
				
				contpar++;
			
			else
				
				contImp++;
				
		}
		System.out.println("A QUANTIDADE DE NUMERO PAR FOI   :"+contpar);
		System.out.println("A QUANTIDADE DE NUMERO IMPAR FOI :"+contImp);
		

		ent.close();

	}

}
