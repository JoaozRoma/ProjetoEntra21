package lista5;

import java.util.Scanner;

public class questao13 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		float valor1,valor2,valor3;
		
		System.out.println("digite o valor do   1 : ");
		valor1 = ent.nextFloat();
		System.out.println("digite o valor do   2 : ");
		valor2 = ent.nextFloat();
		System.out.println("digite o valor do   3 : ");
		valor3 = ent.nextFloat();
		
		
		if ((valor1 < (valor2 + valor3) && valor2 < (valor1 + valor3) && valor3 < (valor1 + valor2 )))
			if(valor1 == valor2 && valor2 == valor3)
			{
				System.out.println("O triangulo é equilatero ");	
			}
			else if(valor1 == valor2 || valor2 == valor3 || valor3 == valor1)
			{
				System.out.println("O triangulo é isosceles ");
			}
			else if(valor1 != valor2 || valor2 != valor3)
			{
				System.out.println("O triangulo é escaleno ");
			}
			else
			{
				System.out.println("não é triangulo ");
			}
		
		ent.close();
	}

}
