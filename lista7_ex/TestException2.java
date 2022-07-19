package lista7_ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException2 
{

	public static void main(String[] args) 
	{
		int x = 0;
		int y = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Eu sei dividir");
		try
		{
		System.out.println("Informe o primeiro valor : ");
		x = teclado.nextInt();
		
		System.out.println("Informe o segundo valor :");
		y = teclado.nextInt();
		
		double r = (x / y);
		
		System.out.println("Resultado da divisão e :"+ r);
		}
		catch (InputMismatchException e) 
		{
			System.out.println("Informe um NUMERO O CORRETO :"+e);
		}
		catch (ArithmeticException e)
		{
			System.out.println("divisao por 0 erro"+e);
		}
	}

}
