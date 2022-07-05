package lista11;

import java.util.Scanner;

public class questao2main {

	public static void main(String[] args) 
	{
		
		questao2classe Conta = new questao2classe();
		Scanner ent = new Scanner(System.in);

		Conta.setNome("Agiota Bohrer");
		Conta.setSaldo(2000);
		Conta.setLimite(200);
		Conta.setTipoConta("Conta Especial");
		
			
		do
		{
			
		
		System.out.println("Bem-Vindo a Agiotagem Systems");
		System.out.println("+++++++++++++++++++++++++++++");
		
		System.out.println("Ola "+Conta.getNome());
		
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
			System.out.println(Conta.getNome());
			System.out.println(Conta.getSaldo());
			System.out.println(Conta.getTipoConta());
			System.out.println(Conta.getLimite()+" é o limite do cheque");
			
			System.out.println("+++++++++++++++++++++++++++++");
		}
		else if(Conta.op == 2)
		{
			System.out.println("Digite o valor para sacar :");
			Conta.setValor(ent.nextDouble());
			
			Conta.sacar(Conta.getValor());
			System.out.println("Saldo da atual da Conta " + Conta.getSaldo());
		}
		else if(Conta.op == 3)
		{
			System.out.println("Digite o valor para Depositar :");
			Conta.setValor(ent.nextDouble());
			
			Conta.depositar(Conta.getValor());
			System.out.println("Saldo da atual da Conta " + Conta.getSaldo());
		}
		else  if(Conta.op == 4)
		{
			System.out.println("Deseja usar o cheque especial ?: ");
			
				Conta.usarCheque(Conta.getLimite());
				System.out.println("Saldo da atual da Conta " + Conta.getLimite());
			
		
		}
		}
		while(Conta.op !=0);
		System.out.println("Programa finalizado!");
		ent.close();
	}

}
