package lista8;

import java.util.Random;
import java.util.Scanner;

public class questao3 
{

	public static void main(String[] args) 
	{
	Random numero = new Random();
	int matriz[][] = new int[10][10];
	

	int maior_linha_cinco = 0;
	int menor_linha_cinco = 9;
	int maior_coluna_sete = 0;
	int menor_coluna_sete = 9;	

	for(int i = 0; i < 10; i++)
	{
		for(int j = 0; j < 10; j++) 
		{
			
			matriz[i][j] = numero.nextInt(100);
			

			
			if(i == 4 && matriz[4][j] > maior_linha_cinco) {
				maior_linha_cinco = matriz[4][j];
			}
			

			if(i == 4 && matriz[4][j] < menor_linha_cinco) 
			{
				menor_linha_cinco = matriz[4][j];
			}
			

			if(j == 6 && matriz[i][6] > maior_coluna_sete) 
			{
				maior_coluna_sete = matriz[i][6];
				
			}
			
			if(j == 6 && matriz[i][6] < menor_coluna_sete) 
			{
				menor_coluna_sete = matriz[i][6];
			}
		}
	}
	

	for(int i = 0; i < 10; i++) 
	{
		for(int j = 0; j < 10; j++)
		{
			System.out.print(matriz[i][j] + " "+"\t");
		}
		System.out.println("");
	}

	System.out.println("maior número da linha cinco: " + maior_linha_cinco);
	System.out.println("menor número da linha cinco: " + menor_linha_cinco);
	System.out.println("maior número da coluna sete: " + maior_coluna_sete);
	System.out.println("menor número da coluna sete: " + menor_coluna_sete);
	
}

}
