package lista3;

import java.util.Scanner;

public class questao5 
{

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);

		int anos;
		float dias;
		
		System.out.println("Informe a idade em anos: ");
		anos = ent.nextInt();
		
		
		dias = anos * 365;
		
		System.out.println("Dias vividos: : "+dias);
		
		
		
		
		ent.close();

	}

}
