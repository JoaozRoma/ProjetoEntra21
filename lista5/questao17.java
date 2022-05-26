package lista5;

import java.util.Scanner;

public class questao17 
{

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);

		int num;
		
		System.out.println("Digite um numero : ");
		num = ent.nextInt();
		
	    switch(num)
	    {
	        case 1: 
	        	System.out.println("Domingo"); 
	        break;
	        
	        case 2: 
	        	System.out.println("Segunda-Feira"); 
	        break;
	        
	        case 3:
	        	System.out.println("Terca-Feira"); 
	        break;
	        
	        case 4: 
	        	System.out.println("Quarta-Feira"); 
	        break;
	        
	        case 5: 
	        	System.out.println("Quinta-Feira");
	        break;
	        
	        case 6: 
	        	System.out.println("Sexta-Feira"); 
	        break;
	        
	        case 7: 
	        	System.out.println("Sabado"); 
	        break;
	    }
		

		ent.close();
	}
}