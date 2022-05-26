package lista5;

import java.util.Scanner;

public class questao3 
{

	public static void main(String[] args) 
	{
	Scanner ent = new Scanner(System.in);
	float num;
	char sexo;
	float conta;
	
	System.out.println("Digite a altura : ");
	num = ent.nextFloat();
	
	System.out.println("Digite seu sexo (M) ou (F): ");
	sexo = ent.next().charAt(0);
			
	
	if(sexo == 'M' || sexo =='m') 
	{
		conta = (float) ((72.7*num)-58);
		System.out.println("Peso ideal é :"+conta);
	
	}
	else
	{
		conta = (float) ((62.1*num)-44.7);
		System.out.println("Peso ideal é :"+conta);	
	}
	
	


	ent.close();

	}

}
