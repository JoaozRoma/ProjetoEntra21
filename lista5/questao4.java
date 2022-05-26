package lista5;

import java.util.Scanner;

public class questao4 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero :");
		num = ent.nextInt();
		
		
		if (num >= 1 && num <= 15)
		{
			if (num == 1)
			{
				System.out.println("Codigo do produto //"+num+"// Alimento não perecível");
			}
			else if (num >= 2 && num <= 4)
			{
				System.out.println("Codigo do produto //"+num+"// Alimento perecível");
			}
			else if(num == 5 || num == 6)
			{    
				System.out.println("Codigo do produto //"+num+"// Vestuário");
			}
			else if (num == 7)
			{
				System.out.println("Codigo do produto //"+num+"// Higiene pessoal");
			}
			else if (num >= 8 && num <= 15)
			{
				System.out.println("Codigo do produto //"+num+"// Limpeza e utensílios domésticos");
		    }
		}
		else
		{
		System.out.println("Erro");
		}
	}
}


