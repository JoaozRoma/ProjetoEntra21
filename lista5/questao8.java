package lista5;

import java.util.Scanner;

public class questao8 
{

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);

		float gasolina = 2.53f;
		float Etanol   = 2.09f;
		float Diesel   = 1.92f;
		char vavas;
		int litros;
		float conta;
		
		
		System.out.println("Qual produto gostaria de abastecer seu carro, (G)gasolina,(E)etanol ou (D)diesel : ");
		vavas = ent.next().charAt(0);
		
		
		if(vavas == 'G' || vavas =='g')
		{
			System.out.println("Digite a quantidade que vai ser abastecida, (G)gasolina :");
			
			litros = ent.nextInt();
			conta = gasolina * litros;
			
			System.out.println("A quantidade abastecida foi de : "+conta+" reais "+litros+" litros");
			
		}
		else if(vavas == 'E' || vavas == 'e')
		{
			
			System.out.println("Digite a quantidade que vai ser abastecida, (E)etanol : ");
			
			litros = ent.nextInt();
			conta = Etanol * litros;
			
			if(litros < 30) 
				{
				System.out.println("A quantidade abastecida foi de : "+conta+" reais "+litros+" litros");
				}
			
			else 
				
				{
				System.out.println("A quantidade abastecida foi de : "+conta+" reais "+litros+" litros");
				System.out.println("Você ganhou uma promoção de troca de oleo ");
				}
					
		}
		else if(vavas == 'D' || vavas == 'd')
		{
			System.out.println("Digite a quantidade que vai ser abastecida, (D)diesel :");
			
			litros = ent.nextInt();
			conta = Diesel * litros;
			
			System.out.println("A quantidade abastecida foi de : "+conta+" reais "+litros+" litros");
		}
		else
			System.out.println("Produto não declarado !!!");
		
		ent.close();

	}

}
