package lista7;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);

		int[]vetorA = new int[10];
		int[]vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Entro com o valor na posição : "+"["+i+"]");
			vetorA[i] = ent.nextInt();
			vetorB[i] = vetorA[i] * i;
		}
			System.out.println("Vetor A");
			for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println(vetorA[i] + " ");
		}
			System.out.println("Vetor B");
			for(int i = 0; i < vetorB.length; i++)
		{
			System.out.println(vetorB[i] + " ");
		}
		
		ent.close();

	}

}
