package lista11;

public class questao6classe 
{
	int num = 3;
	int jogo[][] = new int [num][num];
	
	
	boolean jogada(int jogador, int linha, int coluna)
	{
		if((linha < 0) || (coluna > 2))
		{
			return false;
		}
		if((coluna < 0) || (coluna > 2))
		{
			return false;
		}
		if(jogo[linha][coluna] != 0)
		{
			return false;
		}
		jogo[linha][coluna] = jogador;
			return true;
		
	}
	
	void jogodaVelha()
	{
		for (int i = 0; i < num; i++) 
		{
			for (int j = 0; j < num; j++) 
			{
				jogo[i][j] = 0;
				
			}
			
		}
	}
	
	
	void mostrar()
	{
		for (int i = 0; i < num; i++) 
		{
			for (int j = 0; j < num; j++) 
			{
				System.out.print(jogo[i][j]+ " ");
				
			}
			System.out.println();
		}
	}
	
	int verVencedor()
	{
		for (int i = 0; i < num; i++) 
		{
			if((jogo[i][0] == jogo[i][1]) && (jogo[i][0] == jogo[i][2]))
			{
				if(jogo[i][0] != 0)
				{
					return jogo[i][0];
				}
			}
		}
		
		for (int j = 0; j < num; j++) 
		{
			if((jogo[0][j] == jogo[1][j]) && (jogo[0][j] == jogo[2][j]))
			{
				if(jogo[0][j] != 0)
				{
					return jogo[j][j];
				}
			}
		}
		if((jogo[0][0] == jogo[1][1]) && (jogo[0][0] == jogo[2][2]) && (jogo[0][2] !=0))
		{
			return jogo[0][0];
		}
		if((jogo[0][2] == jogo[1][1]) && (jogo[0][2] == jogo[2][0]) && (jogo[0][2] !=0))
		{
			return jogo[0][2];
		}
		
		for (int i = 0; i < num; i++) 
		{
			for (int j = 0; j < num; j++) 
			{
				if(jogo[i][j] == 0)
				{
					return 0;
				}
				
			}
			
		}
		
		return num;
		
		
		
	}

}

	
