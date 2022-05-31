package lista7;

import java.util.Scanner;

public class questao17 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		int num = 5;
		
		String cliente[] = new String[5];
		int dvd[] = new int [num];
		int promo = 0;
		int i;
		
		for(i =0; i < cliente.length; i++)
		{
			System.out.print("Digite o nome cliente : ");
			cliente[i] = ent.nextLine();
			
			/*if(i > 0)
			{
				cliente[i] = ent.nextLine();
			}*/
			System.out.print("Quantos dvd foram locados este ano? : ");
			dvd[i] = ent.nextInt();
			cliente[i] = ent.nextLine();
		}
		
		for(i =0; i < num; i++)
		{
			if(dvd[i] > 0 && dvd[i] < 10)
			{
				promo = 0;
				System.out.print("O cliente "+cliente[i]+" ainda não tem direito a locação gratis.\n");
			}
			else if(dvd[i] >= 10 && dvd[i] < 100)
			{
				promo = dvd[i]/10;
				System.out.print("O cliente "+cliente[i]+" tem direito a "+promo+" locação gratis.\n");
			}
			else if(dvd[i] >= 100 && dvd[i] < 1000) 
			{
				promo = dvd[i]/100;
				System.out.print("O cliente "+cliente[i]+" tem direito a "+promo+" locação gratis.\n");
			}
		}	
		
		ent.close();
	}
}
