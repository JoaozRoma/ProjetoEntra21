package lista5extra;

import java.util.Scanner;

public class questao3 
{

	public static void main(String[] args) 
	{
		int ano;
		
		Scanner ent = new Scanner(System.in);

		

		
		System.out.println("Digite o ano para ver se é bissexto : ");
		ano = ent.nextInt();
		
		
		if(ano % 400 == 0)
		{
			System.out.println("é bissexto : ");
		}
		else if((ano % 4 == 0) && (ano != 0))
		{
			System.out.println("é bissexto : ");
		}
		else 
			System.out.println("nao é bissexto : ");
		
		ent.close();
	}

}
