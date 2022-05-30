package lista7;

import java.util.Scanner;

public class questao13 
{

	public static void main(String[] args) 
	{
	Scanner ent = new Scanner(System.in);
	int a[] = new int[10];
	int b[] = new int[a.length];
	int contador = 1;
	int j = 0;
	
	
	for(int i = 0; i < 10; i++)
	{
		System.out.print("Digite o " + (contador++) + "N numero: ");
		a[i] = ent.nextInt();
	}
	

	for(int i = 9; i >= 0; i--)
	{
		b[i] = a[j];
		
		j++;
	}
	
	System.out.println("\n=======================================");
	for(int i = 0; i < 10; i++)
	{
		System.out.printf("VetorA[%d] = %03d\t\tVetorB[%d] = %03d\n", i, a[i], i, b[i]);
	}
	System.out.println("\n=======================================");
	}

}
