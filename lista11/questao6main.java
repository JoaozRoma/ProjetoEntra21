package lista_oop_3;

import java.util.Scanner;

public class questao6main 
{
	public static void main(String[] args) 
	{
		
		questao6classe velha = new questao6classe();
		Scanner ent = new Scanner(System.in);
		int jogador = 1;
		int vencedor = velha.verVencedor();
		
		velha.mostrar();
		
		while(vencedor == 0)
		{
			System.out.println("Jogador "+jogador);
			System.out.println("Linha :");
			velha.setLinha(ent.nextInt());
			
			System.out.println("coluna :");
			velha.setColuna(ent.nextInt());
			
			if(!velha.jogada(jogador, velha.getLinha() - 1 , velha.getColuna() - 1))
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