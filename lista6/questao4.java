 package lista6;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		float menorAltura = 5.0f, maiorAltura = 0f, altura =0f;
		float mediaAlturaM = 0f, mediaAlturaPop = 0f;
		float totalAltura = 0f, totalMulheres =0f;
		int homens =0, mulheres =0, porcentHomenpop =0, i=1;
		String gen;
		
		
		System.out.println("====Pesquisa====");
		while(i<=5)
		{
			System.out.println("N"+i+" Questionario");
			System.out.println("Quak sua altura");
			altura = ent.nextFloat();
			
			totalAltura += altura;
			
			maiorAltura = (maiorAltura < altura) ? altura : maiorAltura;
			menorAltura = (altura < menorAltura) ? altura : menorAltura;
			
			System.out.println("Qual é o seu genero ? M ou F");
			gen = ent.next();
			
			if((!gen.equalsIgnoreCase("f")) && (!gen.equalsIgnoreCase("m"))) 
			{
				System.out.println("Erro , caracter invalido");
				break;
			}
			else
			{
				if(!gen.equalsIgnoreCase("m"))
				{
					homens++;
				}
				else if(!gen.equalsIgnoreCase("f"))
				{
					mulheres++;
					totalAltura += altura;
				}
			}
			i++;
	
			
		}
		
		mediaAlturaPop = totalAltura / 5;
		mediaAlturaM = totalMulheres / mulheres;
		porcentHomenpop = (homens * 100) / 5;
		
		
		System.out.println("Media de altura da mulheres : "+mediaAlturaM);
		System.out.println("Media de altura da população : "+mediaAlturaPop);
		System.out.println("% de homens na população e"+porcentHomenpop);
		System.out.println("Maior altura "+maiorAltura);
		System.out.println("Menor altura"+menorAltura);
			
		ent.close();

	}

}
