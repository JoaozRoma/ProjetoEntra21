package lista5;

import java.util.Scanner;

public class questao5 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		int num;
		
		System.out.println("Digite a idade : ");
		num = ent.nextInt();
		
		if (num >= 5 && num <= 80)
		{
	
			if (num >= 5 && num <= 7)
			{
				System.out.println("Idade digitada : "+num+".... Infantil A");
			}
			else if(num >= 8 && num <= 10)
			{    
				System.out.println("Idade digitada : "+num+".... Infantil B");
			}
			else if (num >= 11 && num <=13)
			{
				System.out.println("Idade digitada : "+num+".... Juvenil A");
			}
			else if (num >= 14 && num <= 17)
			{
				System.out.println("Idade digitada : "+num+".... Juvenil B");
		    }
			else if (num >= 18)
			{
				System.out.println("Idade digitada : "+num+".... Adulto");
			}
		}
		else
		{
		System.out.println("Erro");
		}
	}
}

