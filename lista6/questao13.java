package lista6;

import java.util.Scanner;

public class questao13 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		int maior = 0;
		int entrada;
	
		
		
		
		do 
		{
		System.out.println("Digite um numero : ");
		entrada = ent.nextInt();
		if(entrada > 0)
		{
			if(entrada > maior)
			{
				maior = entrada;
				
			}
			System.out.println("-1 para sair : ");
			}
		}
		while(entrada > -1);
		
	
		
		System.out.println("Total de numeros digitados  o numero maior foi "+maior);

		ent.close();

	}

}
