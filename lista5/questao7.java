package lista5;

import java.util.Scanner;

public class questao7 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		int desc = 10;
		float conta;
		float preco;
		char tutu;
		float conta2;
		
		System.out.println("Digite o valor da compra : ");
		preco = ent.nextFloat();
		
		System.out.println("Qual metodo de pagamento cheque(C) ou Dinheiro(D): ");
		tutu = ent.next().charAt(0);
		
		if(tutu == 'd' && preco >99 || tutu == 'D' && preco >99)
		{
			conta =  preco*(desc/100f);
			conta2 = preco - conta;
			System.out.println("Tem desconto no dinheiro, e ele será de 10%, preço : "+conta+" total"+conta2);
		}
		else
			System.out.println("Dinheiro abaixo da promoção ou pagamento em cheque, total : "+preco);
		

		ent.close();

	}

}
