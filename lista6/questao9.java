package lista6;

import java.util.Scanner;

public class questao9
{

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);

		int num =0;
		int conta =0;
		String res;
		
		System.out.println("Digite um numero inteiro e positivo : ");
		num = ent.nextInt();
		
		for(int i =1; i <= num; i++)
		{
			conta =(num % i == 0) ? conta + 1 : conta;
		}
 		res =(conta == 2)? "n "+num+"é primo" : "n "+num+" não é primo";
 		
 		
 		System.out.println(res);

		ent.close();

	}

}
