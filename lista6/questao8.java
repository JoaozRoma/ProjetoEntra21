package lista6;

import java.util.Scanner;

public class questao8 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		int n=0, inferior=10000, superior = 0, somapar=0;
		
		String saida = " ";
		
		System.out.println("Digite o numero inferior : ");
		inferior = ent.nextInt();
		
		System.out.println("Digite o numero Superior : ");
		superior = ent.nextInt();
		
		for(int x = inferior; x <= superior; x++)
		{
			if(inferior == x)
			{
			continue;
			}
			else if (x % 2 == 0)
			{
			somapar += x;
			saida+= x+". ";
			
			
			}
		}
		System.out.println("Numero inferior :"+inferior);
		System.out.println("Numero superior  "+superior);
		System.out.println("Soma : "+somapar);
		System.out.println("saida :"+saida);

		ent.close();

	}

}
