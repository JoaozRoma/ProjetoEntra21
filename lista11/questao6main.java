package lista11;

import java.util.Scanner;

public class questao6main 
{
	public static void main(String[] args) 
	{
		
		questao6classe velha = new questao6classe();
		Scanner ent = new Scanner(System.in);
		int linha;
		int coluna;
		int jogador = 1;
		int vencedor = velha.verVencedor();
		
		velha.mostrar();
		
		while(vencedor == 0)
		{
			System.out.println("Jogador "+jogador);
			System.out.println("Linha :");
			linha = ent.nextInt();
			
			System.out.println("coluna :");
			coluna = ent.nextInt();
			
			if(!velha.jogada(jogador,linha - 1 , coluna - 1))
			{
				System.out.println("Jogada Invalida !");
			}
			else
			{
				jogador = (jogador == 1) ? 2 : 1;
			}
			
			velha.mostrar();
			vencedor = velha.verVencedor();
		}
		switch(vencedor)
		{
		case 1:
			System.out.println("Vencedor jogador 1");
			break;
			
		case 2 :
			System.out.println("Vencedor jogador 2");
			break;
			
		case 3:
			System.out.println("Empatezada");
			break;
		}

	}
}