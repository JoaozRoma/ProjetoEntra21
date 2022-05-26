package lista5;

import java.util.Scanner;

public class questao12 
{

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);
		float nota1,nota2,nota3,mediaAprov,mediaExec;
		
		System.out.println("digite o valor da primeira nota  : ");
		nota1= ent.nextFloat();
		
		System.out.println("digite o valor da segunda  nota  : ");
		nota2= ent.nextFloat();
		
		System.out.println("digite o valor da terceira nota  : ");
		nota3 = ent.nextFloat();
		
		mediaExec = (nota1 + nota2 + nota3) / 3;
		
		
		mediaAprov = (nota1 + nota2 * 2 + nota3 * 3+ mediaExec) / 7;
		
		
		 if(mediaAprov >= 9)
		 {
		  System.out.println("A media de aproveitamento (A) : "+mediaAprov);
		 }
		 else if(mediaAprov >= 7.5 || mediaAprov < 9)
		 {
				System.out.println("A media de aproveitamento (B): "+mediaAprov);
		 }
		 else if(mediaAprov >= 6.0 || mediaAprov < 7.5)
		 {
				System.out.println("A media de aproveitamento (C): "+mediaAprov);
		 }
		 else if(mediaAprov < 6)
		 {
				System.out.println("A media de aproveitamento (D): "+mediaAprov);
		 }
		 else
		 {
				System.out.println("deu erro");
		 }
		ent.close();
		

	}

}
