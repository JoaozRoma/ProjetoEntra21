package lista6;

import java.util.Scanner;

public class questao11 
{

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);
		int tabuada ;
		System.out.println("Digite um numero que voce queira a tabuada : ");
		tabuada = ent.nextInt();
		
		
		for(int x = 1; x <=10; ++x)
		{
			System.out.println(x+"X"+tabuada+" = "+x * tabuada);
		}

		ent.close();

	}

}
