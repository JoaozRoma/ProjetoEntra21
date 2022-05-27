package lista7;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);

		int[] vetorA = new int[5];
		int soma = 0;
		
		
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Entro com o valorA na posição : "+"["+i+"]");
			vetorA[i] = ent.nextInt();
			
			if(vetorA[i] % 5 == 0)
			soma +=vetorA[i];
				
		}
		System.out.println("O total da Soma de numero multiplo de 5 é :"+soma);
		
		ent.close();
	}

}
