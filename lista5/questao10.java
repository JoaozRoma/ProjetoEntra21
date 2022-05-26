package lista5;

import java.util.Scanner;

public class questao10 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		int valorProduto;
		int PagoProduto;
		
		int valorC ,valorD,valorU;
		
		
		int conta;

		
		System.out.println("digite o valor do produto : ");
		valorProduto = ent.nextInt();
		
		System.out.println("digite o valor do pagamento : ");
		PagoProduto = ent.nextInt();
		
		conta = (valorProduto - PagoProduto)* -1;
		
		System.out.println("Valor pago foi : "+conta);
		
		
		if(valorProduto > PagoProduto)
		{
			System.out.println("");
		}
		else 
			
		conta%=100;
		valorC = conta/100;
		

		conta%=10;
		valorD = conta/10;


		conta%=1;
		valorU = conta/1;
		
		
		System.out.println("Voce precisará de"+valorC+" de centena, "+valorD+" de dezena, "+valorU+" de unidade");
		
		ent.close();

	}

}
