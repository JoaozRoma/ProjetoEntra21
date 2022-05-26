package lista6;

import java.util.Scanner;

public class questao7 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		int numero, contador=0 ;

		do
		{
			System.out.println("Digite um numero : ");
			numero = ent.nextInt();
			
			if(numero > 100 && numero < 200)
			{
				contador++;
			}
		}
		while(numero > 0);
		
		System.out.println("A quantidade foi de "+contador);

		ent.close();
	}

}
