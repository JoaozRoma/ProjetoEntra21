package lista5;

import java.util.Scanner;

public class questao9 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);


		float conta;
		float preco;
		
		int sauce;
		
		System.out.println("===============================================");
		System.out.println("Digite uma fruta (1)Laranja (2)Limão (3)morango");
		System.out.println("===============================================");
		sauce = ent.nextInt();
		
		
		switch(sauce)
		{
		case 1:
			System.out.println("Valor a ser pago da Laranja (unitario) ? : ");
			System.out.println("===========================================");
			
			preco = ent.nextFloat();
			conta = preco * 60;
			
			System.out.println("Valor a ser pago unitario "+preco+", da caixa fica "+conta);
			System.out.println("========================================================");

		case 2:
			System.out.println("Valor a ser pago do Limão (unitario) ? : ");
			System.out.println("=========================================");
			
			preco = ent.nextFloat();
			conta = preco * 80;
			
			System.out.println("Valor a ser pago unitario "+preco+", da caixa fica "+conta);
			System.out.println("========================================================");
			
		case 3:
			System.out.println("Valor a ser pago do morango (unitario) ? : ");
			System.out.println("===========================================");
			
			preco = ent.nextFloat();
			conta = preco * 20;
			
			System.out.println("Valor a ser pago unitario "+preco+", da caixa fica "+conta);
			System.out.println("========================================================");
		
			
		default:
			System.out.println("nada");
			System.out.println("========================================================");
			
		}
		
		ent.close();

	}

}
