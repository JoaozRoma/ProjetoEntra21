package lista6;

import java.util.Scanner;

public class questao2 
{

	public static void main(String[] args)
	{
	Scanner ent = new Scanner(System.in);

	float divida = 0, totaldivida = 0, arreca = 0;
	int   cnh, qtdmulta = 0, cnhm = 0, nmulta = 0;
	char res;
	
	do
	{
		totaldivida = 0;
		System.out.println("Numero do da CNH : ");
		cnh = ent.nextInt();
		
		System.out.println("Digite quantas multas são : ");
		qtdmulta = ent.nextInt();
		
		for(int i = 1; i <= qtdmulta; i++)
		{
			System.out.println("Digite o valor da multa : ");
			divida = ent.nextFloat();
			
			totaldivida += divida;
			arreca += divida;
			
			if(nmulta < qtdmulta)
			{
				nmulta = qtdmulta;
				cnhm = cnh;
			}
		}
		System.out.println("O portador da cnh:"+cnh+" com numero de multa de:"+qtdmulta+" tem uma divida de : "+totaldivida);
		System.out.println("Deseja faz novo cadastro ? : ");
		res = ent.next().charAt(0);
		
	}
	while(res == 's');
		
		System.out.println("O valor total de arrecadação do detran foi :"+arreca);
		System.out.println("A cnh de N:"+cnhm+ " teve o maior numero de multas:"+nmulta+" no total");
	

	ent.close();

	}

}
