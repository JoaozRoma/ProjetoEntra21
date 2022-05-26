package lista6;

import java.util.Scanner;

public class questao16 
{

	
	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		

		
		int idade = 0;
		float salario = 0;
		String sexo = null;
		String estado_civil = null;
		String res;
		String nome;
		
		boolean ver; 
		
		
		System.out.println("Programa de validação de informação");
		System.out.println("===================================");
		
		System.out.println("Digite seu nome : ");
		nome = ent.nextLine();
		
		
		do
		{
			System.out.println("Digite sua idade : ");
			idade = ent.nextInt();
			if((idade > 0) && (idade <= 100))
			{
				ver = true;
			}
			else
			{
				ver = false;
				System.out.println("idade não compativel");
				
			}
			
			System.out.println("Qual é o seu salario ?:");
			salario = ent.nextFloat();
			if(salario > 0)
			{
				ver = true;
			}
			else
			{
				ver = false;
				System.out.println("Valor não permitido : ");
				continue;
			}
			
			System.out.println("Qual é o seu sexo? (M ou F) : ");
			sexo = ent.next();
			if((sexo.equalsIgnoreCase("m")) || (sexo.equalsIgnoreCase("f")))
			{
				ver = true;
			}
			else
			{
				ver = false;
				System.out.println("Genero não definido");
				continue;

			}
			
			System.out.println("Seu estado civil : ");
			estado_civil = ent.next();
			if((estado_civil.equalsIgnoreCase("s")) || (estado_civil.equalsIgnoreCase("c")) || (estado_civil.equalsIgnoreCase("v")) || (estado_civil.equalsIgnoreCase("d")))
			{
				ver = true;
			}
			else
			{
				ver = false;
				System.out.println("Estado civil não é valido ");
				continue;
			}
			
		}
		while(ver == false);
		System.out.println("cadastro validado");
		System.out.println("=================");
		System.out.println("Seu nome é : "+nome);
		System.out.println("idade :"+idade);
		System.out.println("Sexo :"+sexo);
		System.out.println("Estado civil : "+estado_civil);
		
		ent.close();
	}

}
