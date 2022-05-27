package lista7;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		int[]vetor1 = new int[3];
		int[]vetor2 = new int[vetor1.length];
		int menorV = Integer.MAX_VALUE;
		int maiorV = 00000;
		
		for(int i = 0; i < vetor1.length; i++)
		{
			System.out.println("Entro com o valor na posição : "+"["+i+"]");
			vetor1[i] = ent.nextInt();
			vetor2[i] = vetor1[i] * vetor1[i];
		}
			System.out.println("Vetor 1");
			for(int i = 0; i < vetor1.length; i++)
		{
			System.out.println(vetor1[i] + " ");
		}
			System.out.println("===============");
			System.out.println("Vetor 2");
			for(int i = 0; i < vetor2.length; i++)
		{
			System.out.print(vetor2[i] + " ");
		}
		
		ent.close();

	}

}
