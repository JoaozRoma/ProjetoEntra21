package lista5;

import java.util.Scanner;

public class questao6 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		float imc,peso,altura;
		
		
		System.out.println("Qual seu peso? (kg):");
		peso = ent.nextFloat();
		System.out.println("Qual sua altura? (m):");
		altura = ent.nextFloat();

		imc = (float) (peso/Math.pow(altura, 2));

		 
        if (imc <= 19)
        	System.out.println ("Abaixo do Peso : "+imc);
        else
        
        if (imc < 25)
        	System.out.println("Peso ideal : "+imc);
        else
        
        if (imc < 30)
        	System.out.println("Acima do Peso : "+imc);
        else
        
        if (imc < 35)
        	System.out.println("Obeso : "+imc);
        


		ent.close();

	}

}
