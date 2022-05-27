package lista7;

import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		int[] vetorA = new int[5];
		int soma = 0;
		int soma1 = 0;
		int soma2 = 0;
		float media = 0f;
		
		
		for(int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Entro com o valorA na posição : "+"["+i+"]");
			vetorA[i] = ent.nextInt();
			
			if(vetorA[i] < 15)
			{
				soma +=vetorA[i];
			}
			else if(vetorA[i] == 15)
			{
				soma1 ++;
			}
			else if(vetorA[i] > 15)
			{
				soma2 += vetorA[i];
				media =(float) soma2 / 5;
			}
		}
		System.out.println("A soma dos numero Inferior a 15 : "+soma);
		System.out.println("A quantidade de numeros iguais a 15 : "+soma1);
		System.out.println("A media de numeros maior que 15 : "+media+"%");
		
		ent.close();
	}

}
