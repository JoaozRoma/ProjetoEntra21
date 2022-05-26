package lista3;
import java.util.Scanner;

public class questao3 
{

	public static void main(String[] args) 
	{
	
		
		Scanner ent = new Scanner(System.in);

	

	
		float area, lquad;
	
		
		
		
		System.out.println("Digite o valor do lado do quadrado : ");
		lquad = ent.nextFloat();
		
		area =(float)  (lquad * lquad);
		
		System.out.println("A área do quadrado é: "+area);
				
		ent.close();

	}

}
