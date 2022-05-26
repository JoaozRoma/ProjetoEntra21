package lista3;

import java.util.Scanner;

public class questao2B 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		float a,b,c;
		
		a = 30;
		b = 20;
		c = a+b;
		
		System.out.println("Valor de C"+c);
		System.out.println("O valor de c é :"+b+" o valor de b é :"+c);
		
		c = a+b;
		
		System.out.println("O valor de A é :"+a+" o valor de B é :"+b+" o valor de C"+c);
	
		ent.close();
	}

}
