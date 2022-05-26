package lista6;

import java.util.Scanner;

public class questao10 
{
	public static void main(String[] args)
	{
	 int num = 1000;
	 int quinto =0;
	 
	 
	 
	 do 
	 {
		 if (num % 11 == 5)
		 {
		 quinto++;
		 
		 }
		 num++;
	 }
	 while(quinto < 5);
	 
	 System.out.println("Resposta "+num);
	 
	}
}