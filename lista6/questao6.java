package lista6;

import java.util.Scanner;

public class questao6 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		float chico = 1.5f;
		float juca = 1.1f;
		int anos = 1;
		
		while (chico > juca)
		{
			chico += 0.02f;
			juca  += 0.03f;
			anos++;
		}
		
		System.out.println("Foram necessarios "+anos+" anos, para juca passar chico");

		ent.close();

	}

}
