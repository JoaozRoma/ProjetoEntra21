package lista7;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		float[] vetorC = new float[vetorB.length];
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Entro com o valorA na posição : "+"["+i+"]");
			vetorA[i] = ent.nextInt();
		}
		for(int i = 0; i < vetorB.length; i++)
		{
			System.out.println("Entro com o valorB na posição : "+"["+i+"]");
			vetorB[i] = ent.nextInt();
		}
		
		//calcular agora
		System.out.println("Valores no VetorA");
		for(int i = 0; i < vetorA.length; i++)
		{ 
			;
			System.out.println("Vetor A:"+"["+i+"]"+vetorA[i]);	
		}
		System.out.println("Valores no VetorB");
		for(int i = 0; i < vetorB.length; i++)
		{
			
			System.out.println("Vetor B:"+"["+i+"]"+vetorB[i]);	
		}
		System.out.println("Valores no VetorC (SOMA)");
		for(int i = 0; i < vetorC.length; i++)
		{
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println("Vetor C (SOMA):"+"["+i+"]"+vetorC[i]);	
		}
		System.out.println("Valores no VetorC (SUBTRAÇÃO)");
		for(int i = 0; i < vetorC.length; i++)
		{
			vetorC[i] = vetorA[i] - vetorB[i];
			System.out.println("Vetor C (SUBTRAÇÃO):"+"["+i+"]"+vetorC[i]);	
		}
		System.out.println("Valores no VetorC (MULTIPLICAÇÃO)");
		for(int i = 0; i < vetorC.length; i++)
		{
			vetorC[i] = vetorA[i] * vetorB[i];
			System.out.println("Vetor C (MULTIPLICAÇÃO):"+"["+i+"]"+vetorC[i]);	
		}
		System.out.println("Valores no VetorC (DIVISAO)");
		for(int i = 0; i < vetorC.length; i++)
		{
			vetorC[i] = (float) vetorA[i] /  vetorB[i];
			System.out.println("Vetor C (DIVISAO):"+"["+i+"]"+vetorC[i]);	
		}


		

		ent.close();

	}

}
