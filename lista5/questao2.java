package lista5;

import java.util.Scanner;

public class questao2 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero : ");
		num = ent.nextInt();
		
		
		if(num > 0)
			System.out.println("Ele é positivo ");
		else if(num < 0)
			System.out.println("Ele é Negativo ");
		else
			System.out.println("Ele é neutro ");

		ent.close();

	}

}
