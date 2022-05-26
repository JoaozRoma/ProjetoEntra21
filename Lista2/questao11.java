package Lista2;

import java.util.Scanner;

public class questao11 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		int rosa,tulipa;
		
		float total;
		
		System.out.println("digite a quantidade de rosa :");
		rosa = leia.nextInt();
		
		System.out.println("digite a quantidade de tulipa");
		tulipa = leia.nextInt();
		
		total = (float) ((tulipa*4.2) + (rosa*2.8));
		
		System.out.println("O valor total será : "+total+" reais");
		

		
		
		
		
		
	}

}
