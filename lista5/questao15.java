package lista5;

import java.util.Scanner;

public class questao15 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		char resposta;
		
		float kilos,resultado1,resultado2,resultado3;

		
		
		System.out.println("Selecione o tipo da carne (F)file (A)alca (P)pica: ");
		resposta =  ent.next().charAt(0);
		
		switch(resposta)
		{
		case 'f', 'F':
			
			System.out.println("=====File=====");
			System.lineSeparator();
			
			System.out.println("Digite a quantidade de carne : ");
			kilos = ent.nextFloat();
			
			if(kilos <= 5)
			{
				resultado1 = kilos * 4.9F;
				System.out.println("O valor da carne (FILE) foi de : "+resultado1+" reais");
				System.out.println("O pagamento será em (D)dinheiro ou (C)cartão? : ");
				resposta =  ent.next().charAt(0);
				//if do if
				if(resposta == 'c' || resposta == 'C')
				{
					resultado2 = resultado1 * 0.05f;
					System.out.println("O valor do desconto da carne foi de : "+resultado2+" reais");
					resultado3 = resultado1 - resultado2;
					System.out.println("O valor FINAL da carne (FILE) foi de : "+resultado1+" reais");
				}
				else if(resposta == 'd' || resposta == 'D')
				{
					System.out.println("O valor da carne (FILE) foi de : "+resultado1+" reais");
				}
				else
				{
					System.out.println("Metodo de pagamento não informado ! ");
				}
				// fim do if do if
			}
			else
			{
				resultado1 = kilos * 5.8F;
				System.out.println("O valor da carne (FILE) foi de : "+resultado1+" reais");
				System.out.println("O pagamento será em (D)dinheiro ou (C)cartão? : ");
				resposta =  ent.next().charAt(0);
				//if do if
				if(resposta == 'c' || resposta == 'C')
				{
					resultado2 = resultado1 * 0.05f;
					System.out.println("O valor do desconto da carne foi de : "+resultado2+" reais");
					resultado3 = resultado1 - resultado2;
					System.out.println("O valor FINAL da carne (FILE) foi de : "+resultado1+" reais");
				}
				else if(resposta == 'd' || resposta == 'D')
				{
					System.out.println("O valor da carne (FILE) foi de : "+resultado1+" reais");
				}
				else
				{
					System.out.println("Metodo de pagamento não informado ! ");
				}
				// fim do if do if
				
			}
		case 'a', 'A':
			
			System.out.println("=====Alcatra=====");
			System.lineSeparator();
			
			System.out.println("Digite a quantidade de carne : ");
			kilos = ent.nextFloat();
			
			if(kilos <= 5)
			{
				resultado1 = kilos * 5.9F;
				System.out.println("O valor da carne (ALCATRA) foi de : "+resultado1+" reais");
				System.out.println("O pagamento será em (D)dinheiro ou (C)cartão? : ");
				resposta =  ent.next().charAt(0);
				//if do if
				if(resposta == 'c' || resposta == 'C')
				{
					resultado2 = resultado1 * 0.05f;
					System.out.println("O valor do desconto da carne foi de : "+resultado2+" reais");
					resultado3 = resultado1 - resultado2;
					System.out.println("O valor FINAL da carne (ALCATRA) foi de : "+resultado1+" reais");
				}
				else if(resposta == 'd' || resposta == 'D')
				{
					System.out.println("O valor da carne (ALCATRA) foi de : "+resultado1+" reais");
				}
				else
				{
					System.out.println("Metodo de pagamento não informado ! ");
				}
				// fim do if do if
			}
			else
			{
				resultado1 = kilos * 6.8F;
				System.out.println("O valor da carne (ALCATRA) foi de : "+resultado1+" reais");
				System.out.println("O pagamento será em (D)dinheiro ou (C)cartão? : ");
				resposta =  ent.next().charAt(0);
				//if do if
				if(resposta == 'c' || resposta == 'C')
				{
					resultado2 = resultado1 * 0.05f;
					System.out.println("O valor do desconto da carne foi de : "+resultado2+" reais");
					resultado3 = resultado1 - resultado2;
					System.out.println("O valor FINAL da carne (ALCATRA) foi de : "+resultado1+" reais");
				}
				else if(resposta == 'd' || resposta == 'D')
				{
					System.out.println("O valor da carne (ALCATRA) foi de : "+resultado1+" reais");
				}
				else
				{
					System.out.println("Metodo de pagamento não informado ! ");
				}
				// fim do if do if
				
			}
		case 'p', 'P':
			System.out.println("=====Picanha=====");
		System.lineSeparator();
		
		System.out.println("Digite a quantidade de carne : ");
		kilos = ent.nextFloat();
		
		if(kilos <= 5)
		{
			resultado1 = kilos * 6.9F;
			System.out.println("O valor da carne (PICANHA) foi de : "+resultado1+" reais");
			System.out.println("O pagamento será em (D)dinheiro ou (C)cartão? : ");
			resposta =  ent.next().charAt(0);
			//if do if
			if(resposta == 'c' || resposta == 'C')
			{
				resultado2 = resultado1 * 0.05f;
				System.out.println("O valor do desconto da carne foi de : "+resultado2+" reais");
				resultado3 = resultado1 - resultado2;
				System.out.println("O valor FINAL da carne (PICANHA) foi de : "+resultado1+" reais");
			}
			else if(resposta == 'd' || resposta == 'D')
			{
				System.out.println("O valor da carne (PICANHA) foi de : "+resultado1+" reais");
			}
			else
			{
				System.out.println("Metodo de pagamento não informado ! ");
			}
			// fim do if do if
		}
		else
		{
			resultado1 = kilos * 7.8F;
			System.out.println("O valor da carne (PICANHA) foi de : "+resultado1+" reais");
			System.out.println("O pagamento será em (D)dinheiro ou (C)cartão? : ");
			resposta =  ent.next().charAt(0);
			//if do if
			if(resposta == 'c' || resposta == 'C')
			{
				resultado2 = resultado1 * 0.05f;
				System.out.println("O valor do desconto da carne foi de : "+resultado2+" reais");
				resultado3 = resultado1 - resultado2;
				System.out.println("O valor FINAL da carne (ALCATRA) foi de : "+resultado1+" reais");
			}
			else if(resposta == 'd' || resposta == 'D')
			{
				System.out.println("O valor da carne (ALCATRA) foi de : "+resultado1+" reais");
			}
			else
			{
				System.out.println("Metodo de pagamento não informado ! ");
			}
			// fim do if do if
			
		}
			default:
				System.out.println("deu erro ! ");
				
		}
		
		
		ent.close();

	}

}
