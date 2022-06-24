package lista10;

import java.util.Scanner;

public class questao2main {

	public static void main(String[] args) 
	{
		
		questao2classe Conta = new questao2classe();
		Scanner ent = new Scanner(System.in);

		Conta.nome = "Agiota Bohrer";
		Conta.saldo = 2000;
		Conta.limite = 200;
		Conta.tipoConta="Conta Especial";
		
			
		do
		{
			
		
		System.out.println("Bem-Vindo a Agiotagem Systems");
		System.out.println("+++++++++++++++++++++++++++++");
		
		System.out.println("Ola "+Conta.nome);
		
		System.out.println("O que deseja fazer :");
		System.out.println("1 - Ver Informações da conta");
		System.out.println("2 - Sacar ");
		System.out.println("3 - Depositar");
		System.out.println("4 - Cheque Especial");
		System.out.println("0 - Sair");
		Conta.op = ent.nextInt();
		
		
		if(Conta.op == 1)
		{
			System.out.println("+++++++++++++++++++++++++++++");
			System.out.println(Conta.nome );
			System.out.println(Conta.saldo );
			System.out.println(Conta.tipoConta);
			System.out.println(Conta.limite+" é o limite do cheque");
			
			System.out.println("+++++++++++++++++++++++++++++");
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
		else  if(Conta.op == 4)
		{
			System.out.println("Deseja usar o cheque especial ?: ");
			
				Conta.usarCheque(Conta.limite);
				System.out.println("Saldo da atual da Conta " + Conta.saldo);
			
		
		}
		}
		while(Conta.op !=0);
		System.out.println("Programa finalizado!");
		ent.close();
	}

}
