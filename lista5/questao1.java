package lista5;

import java.util.Scanner;

public class questao1 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero : ");
		num = ent.nextInt();
		
		if(num % 2 == 0)
			System.out.println("É par");
		
		else
			System.out.println("impar");
			

		

		ent.close();

	}

}
