package lista6;

import java.util.Scanner;

public class questao1 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		int num;
		int impar = 1;
		int par = 0;
		int im = 1;
		
		do
		{
			System.out.println("Digite um número positivo e para terminar um negativo ou zero : "); 
			num = ent.nextInt();
		
			if(num % 2 == 0)
			{
				par += num;
			}
			else
			{
				impar *= num;
				im++;
			}
				
		
		
		
				
		}
		while(num > 0);
		
		System.out.println("A soma de numeros pares foi :"+par);
		System.out.println("A quantidade de numero impar foi :"+im);
		System.out.println("A multiplicação de numero impar foi :"+impar);
		ent.close();

	}

}
