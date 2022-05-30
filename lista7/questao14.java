package lista7;

import java.util.Scanner;

public class questao14 {

	public static void main(String[] args) 
	{
	try (Scanner ent = new Scanner(System.in)) {
		int n = 10;
		  int a[] = new int[n];
		  int b[] = new int[n];
		  int c[] = new int[n*2];
		  int i, j;

			for (i=0; i<n; i++) 
			{
				System.out.printf("Informe V1 %2d.elemento de %d: ", (i+1), n);
				a[i] = ent.nextInt();

			}
			
			for (i=0; i<n; i++) 
			{
				System.out.printf("Informe V2 %2d.elemento de %d: ", (i+1), n);
				b[i] = ent.nextInt();
			}

			j = n;
			for (i=0; i<n; i++) 
			{
				c[i] = a[i]; 
				c[j] = b[i]; //
				j = j + 1;
			}	

			System.out.printf("Vetor 'a'\n");
			for (i=0; i<n; i++) 
			{
				System.out.printf("%2d ", a[i],"\n");
			}

			System.out.printf("\nVetor 'b'\n");
			for (i=0; i<n; i++) 
			{
				System.out.printf("%2d ", b[i]);
			}

			System.out.printf("\n\nVetor 'c'\n");
			System.out.printf("primeiros vetor 'a'ultimos vetor 'b\n");
			
			for (i=0; i<(2*n); i++) 
			{
				System.out.printf("%2d ", c[i]);
			}
	}
	  System.out.printf("\n");
		}
	
}
