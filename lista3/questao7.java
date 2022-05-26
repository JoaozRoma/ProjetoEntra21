package lista3;

import java.util.Scanner;

public class questao7
{

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);

		

		int entrada;
		float h,m,s;
		
		System.out.println("Informe a hora: ");
		entrada = ent.nextInt();
		
		h =(float) (entrada);
		m =(float) ((entrada) * 60);
		s =(float) ((m) * 60);
		
		System.out.println("Hora : "+h);
		System.out.println("Minutos : "+m);
		System.out.println("segundos : "+s);
				
	    ent.close();
	}

}
