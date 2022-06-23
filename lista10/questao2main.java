package lista10;

import java.util.Scanner;

public class questao2main {

	public static void main(String[] args) 
	{
		
		questao2classe Conta = new questao2classe();
		Scanner ent = new Scanner(System.in);

		Conta.nome = "Agiota Bohrer";
		Conta.saldo = 2000;
		
		System.out.println("Bem-Vindo a Agiotagem Systems");
		System.out.println("+++++++++++++++++++++++++++++");
		
		System.out.println("Ola "+Conta.nome);
		
		
		System.out.println("O que deseja fazer :");
		System.out.println("1 - Ver Informações da conta");
		System.out.println("2 - Sacar ");
		System.out.println("3 - Depositar");
		Conta.op = ent.nextInt();
		
		
		if(Conta.op == 1)
		{
			Conta.nome = "Agiota Bohrer";
			Conta.saldo = 2000;
		}
		else if(Conta.op == 2)
		{
			System.out.println("Digite o valor para sacar :");
			Conta.valor = ent.nextDouble();
			
			Conta.sacar(Conta.valor);
			System.out.println("Saldo da atual da Conta " + Conta.saldo);
		}
		else if(Conta.op == 3)
		{
			System.out.println("Digite o valor para Depositar :");
			Conta.valor = ent.nextDouble();
			
			Conta.depositar(Conta.valor);
			System.out.println("Saldo da atual da Conta " + Conta.saldo);
		}
		
	
		ent.close();
	}

}
