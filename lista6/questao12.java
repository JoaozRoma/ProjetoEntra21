package lista6;

import java.util.Scanner;

public class questao12 
{	
	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		long graos = 1;
		String res = "1, ";
		
		for(int i = 1; i < 65;i++)
		{
			graos = graos * 2;
			res += graos+", ";
			
		}
		System.out.println("res : "+res);
		System.out.println("total : "+graos);

		ent.close();
	
	}
}