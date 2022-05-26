package lista3;

import java.util.Scanner;

public class questao1
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		int A =10;
		int B =20;
		int C;
		
		System.out.println("O valor de A é :"+A+" o valor de B é :"+B);
		
		C = A;
		A = B;
		B = C;
		
		System.out.println("O valor de A é :"+A+" o valor de B é :"+B);
		
		

		ent.close();
		

	}

}
