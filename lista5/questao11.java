package lista5;

import java.util.Scanner;

public class questao11 
{	
	public static void main(String[] args) 
	{
	Scanner ent = new Scanner(System.in);
	float num1, num2;
	char resposta;
	
	float conta;
	
	System.out.println("digite o valor do primeiro numero  : ");
	num1 = ent.nextFloat();
	System.out.println("digite o valor do primeiro numero  : ");
	num2 = ent.nextFloat();
	System.out.println("Escolha o valor da operação (+, -, *, /) : ");
	resposta =  ent.next().charAt(0);
	
	
	switch(resposta)
	{
	case '+':
		conta = num1 + num2;
		System.out.println("O valor da soma foi  : "+conta);
	break;
		
	case '-':
		conta = num1 - num2;
		System.out.println("O valor da subtração foi : "+conta);
	break;
	
	case '*':
		conta = num1 * num2;
		System.out.println("O valor da multiplicação foi: "+conta);
	break;
	
	case '/':
		conta = num1 / num2;
		System.out.println("O valor da divisão foi : "+conta);
	break;
	
	default:
		System.out.println("Operação não encontrada ");
	}



	ent.close();
	}
}