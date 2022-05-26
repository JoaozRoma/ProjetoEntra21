package lista5;

import java.util.Scanner;

public class questao18 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		char letra;
		
		System.out.println("Digite uma letra : ");
		letra = ent.next().charAt(0);
		
		switch(letra)
		{
		case 'a': 
        	System.out.println("Vogal"); 
        break;
        
        case 'e': 
        	System.out.println("Vogal"); 
        break;
        
        case 'i':
        	System.out.println("Vogal"); 
        break;
        
        case 'o': 
        	System.out.println("Vogal"); 
        break;
        
        case 'u': 
        	System.out.println("Vogal");
        break;
        
        default:
        System.out.println("Consoante");
		}
		
		


		

		ent.close();

	}

}
