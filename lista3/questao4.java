package lista3;

import java.util.Scanner;

public class questao4 
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		float desp,percent,lucro,receita;
		
		System.out.println("Digite o valor da receita: ");
		receita = ent.nextFloat();
		
		
		System.out.println("Digite o valor da despesa: ");
		desp = ent.nextFloat();
		
		
		lucro = (float) (receita - desp);
		
		percent = (float) ((lucro/receita)*100);

		System.out.println("O lucro foi de R$:"+lucro+",00 e o percentual das despesas em relação à receita foi de :"+percent+"%");

		ent.close();

	}

}
