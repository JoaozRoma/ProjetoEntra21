package lista6;

import java.util.Scanner;

public class questao19 
{

		public static void main(String[] args) 
		{
			Scanner ent = new Scanner(System.in);

			int PriNumero, SecNumero;
			int MenorNum = 0;
			int diff = 0;
			
			
			System.out.println("Digite o Primero numero : ");
			PriNumero = ent.nextInt();
			
			System.out.println("Digite o Segundo numero : ");
			SecNumero = ent.nextInt();
			
			if(PriNumero < SecNumero)
			{
				MenorNum = PriNumero;
			}
			else
				MenorNum = SecNumero;
			
			diff = Math.abs(PriNumero - SecNumero);
				
			for (int i = 1; i < diff; i++)

			System.out.print(MenorNum + i + " ");

		}

			
	}


