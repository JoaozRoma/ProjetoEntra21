package lista5extra;

import java.util.Scanner;

public class questao4 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		char nn;
		
		System.out.println("Voçê esta em um interrogatorio, responda com (S)sim ou (N)nao !");
		
		
		
		int nivel_de_suspeita = 0;
		
		System.out.println("Telefonou para a vítima? :");
		nn = ent.next().charAt(0);
		if(nn== 's' || nn == 'S')
		{
			++nivel_de_suspeita;
			System.out.println("ok...");
		}
		else
		{
			System.out.println("serio?");
		}
		
		System.out.println("Esteve nolocal do crime? :");
		nn = ent.next().charAt(0);
		if(nn== 's' || nn == 'S')
		{
			++nivel_de_suspeita;
			System.out.println("ok...");
		}
		else
		{
			System.out.println("serio?");
		}
		
		System.out.println("Mora perto da vitima? :");
		nn = ent.next().charAt(0);
		if(nn== 's' || nn == 'S')
		{
			++nivel_de_suspeita;
			System.out.println("ok...");
		}
		else
		{
			System.out.println("serio?");
		}
		
		System.out.println("Devia para vitima? : ");
		nn = ent.next().charAt(0);
		if(nn== 's' || nn == 'S')
		{
			++nivel_de_suspeita;
			System.out.println("ok...");
		}
		else
		{
			System.out.println("serio?");
		}
		
		System.out.println("Já trabalhou com a vitima?");
		nn = ent.next().charAt(0);
		if(nn== 's' || nn == 'S')
		{
			++nivel_de_suspeita;
			System.out.println("ok...");
		}
		else
		{
			System.out.println("serio?");
		}
		
		
		switch(nivel_de_suspeita)
		{
		case 1:
			System.out.println("Inocente?");
			break;
			
		case 2:
			System.out.println("Suspeita");
			break;
			
		case 3:
			System.out.println("Cúmplice");
			break;
			
		case 4:
			System.out.println("Cúmplice");
			break;
			
		case 5:
			System.out.println("Assassino");
			break;
			
			
		default:
			System.out.println("Inocente");
		}
		ent.close();

	}

}
