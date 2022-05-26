package lista6;

import java.util.Scanner;

public class questao5 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		int num;
		int res = 0;
		int con = 1;
		
		System.out.println("Digite um numero e verifique se é triangular :");
		num = ent.nextInt();
		
		do
		{
			res = con * (con * 1) + (con * 2);
			con++;
		}
		while(res < num);
		
		
		if(res == num )
		{
			System.out.println("O numero é triangular :"+num);
		}
		else
		{
			System.out.println("O numero não é triangular :"+num);
		}
		ent.close();
	}

}
