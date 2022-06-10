package lista8extra;
import java.util.Scanner;

public class questao1 {


	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		int linha = 2;
		int coluna = 2;
		int profundidade = 2;
		
		int   matrizA [][][] =  new int   [linha][coluna][profundidade];
		int   matrizB [][][] =  new int   [linha][coluna][profundidade];
		float matrizC [][][] =  new float [linha][coluna][profundidade];
		
		for(int i = 0; i < linha; i++)
		{
			for(int j = 0; j < coluna; j++) 
			{
				for (int k = 0; k < profundidade; k++) 
				{
					System.out.println("Entre com a valor[1] na posição de linha  : "+"["+i+"]"+" na coluna : ["+j+"]"+" de profundidade : ["+k+"]");
					matrizA[i][j][k] = ent.nextInt();
				}

			}
		
		}
		for(int i = 0; i < linha; i++)
		{
			for(int j = 0; j < coluna; j++) 
			{
				for (int k = 0; k < profundidade; k++) 
				{
					System.out.println("Entre com a valor[2] na posição de linha  : "+"["+i+"]"+" na coluna : ["+j+"]"+" de profundidade : ["+k+"]");
					matrizB[i][j][k] = ent.nextInt();
				}

			}
		
		}


		//calcular agora
		System.out.println("Valores no MatrizA");
		for(int i = 0; i < linha; i++) 
		{
			for(int j = 0; j < coluna; j++)
			{
				for (int k = 0; k < profundidade; k++)
				{
					System.out.print(matrizA[i][j][k] + " "/* +"\t"*/);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("Valores no MatrizB");
		for(int i = 0; i < linha; i++) 
		{
			for(int j = 0; j < coluna; j++)
			{
				for (int k = 0; k < profundidade; k++)
				{
					System.out.print(matrizB[i][j][k] + " "/* +"\t"*/);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("Valores no MatrizC (SOMA)");
		for(int i = 0; i < linha; i++) 
		{
			for(int j = 0; j < coluna; j++)
			{
				for (int k = 0; k < profundidade; k++)
					{
					matrizC[i][j][k]  = matrizA[i][j][k] + matrizB[i][j][k];
					System.out.print(matrizC[i][j][k] + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
		
		
		
		System.out.println("Valores no MatrizC (SUBTRAÇÃO)");
		for(int i = 0; i < linha; i++) 
		{
			for(int j = 0; j < coluna; j++)
			{
				for (int k = 0; k < profundidade; k++)
					{
					matrizC[i][j][k]  = matrizA[i][j][k] - matrizB[i][j][k];
					System.out.print(matrizC[i][j][k] + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
	
		System.out.println("Valores no MatrizC (MULTIPLICAÇÃO)");
		for(int i = 0; i < linha; i++) 
		{
			for(int j = 0; j < coluna; j++)
			{
				for (int k = 0; k < profundidade; k++)
					{
					matrizC[i][j][k]  = matrizA[i][j][k] * matrizB[i][j][k];
					System.out.print(matrizC[i][j][k] + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
		
		System.out.println("Valores no MatrizC (DIVISÃO)");
		for(int i = 0; i < linha; i++) 
		{
			for(int j = 0; j < coluna; j++)
			{
				for (int k = 0; k < profundidade; k++)
					{
					matrizC[i][j][k]  = (float) matrizA[i][j][k] / matrizB[i][j][k];
					System.out.print(matrizC[i][j][k] + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
		
		
		
		
		
		}
	
	

		
	}
/*
		
		
		/////////////////////////////////////////////////////////////////
		
		System.out.println("Valores no VetorC (DIVISAO)");
		for(int i = 0; i < vetorC.length; i++)
		{
			vetorC[i] = (float) vetorA[i] /  vetorB[i];
			System.out.println("Vetor C (DIVISAO):"+"["+i+"]"+vetorC[i]);	
		}
		////////////////////////////////////////////////////////////////////////

		

		ent.close();

	}

}

*/