package lista7;

import java.util.Scanner;

public class questao12 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		int n = 10;
		int a[] = new int[n];
		int i;
		boolean todospares;

			for (i=0; i<n; i++) 
			{
			System.out.printf("Informe %2do. elemento de %d: ", (i+1), n);
			a[i] = ent.nextInt();
			}

		todospares = true; 
		
			for (i=0; ((i < n) && (todospares == true)); i++) 
			{
			if ((a[i] % 2) != 0)
			todospares = false; 
			}

		if (todospares == true)
			
			System.out.printf("\nTodos os elementos do vetor são pares.\n");
		
		else
			
			System.out.printf("\nAlguns os vetores são um impares.\n");
	}

}
