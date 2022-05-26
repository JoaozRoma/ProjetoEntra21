package lista6;

import java.util.Scanner;

public class questao15 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		int nome;
		int senha;

		do
		{
			System.out.println("Digite um nome : ");
			nome = ent.nextInt();
			
			System.out.println("Digite uma senha : ");
			senha = ent.nextInt();
			
			System.out.println("Usuario nao cadastrado");
			
		}
		while (nome == senha);
		
		
		System.out.println("Usuario cadastrado");
		
		
		

		ent.close();
	}

}
