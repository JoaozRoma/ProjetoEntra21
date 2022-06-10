package lista8extra;
import java.util.Arrays;
import java.util.Scanner;

public class questao33
{

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);
		
		int linha = 2;
		int coluna = 2;
	
		
		int   matrizA [][] =  new int   [linha][coluna];
		int   matrizB [][] =  new int   [linha][coluna];
			
			
		for(int i = 0; i < linha; i++)
		{
			for(int j = 0; j < coluna; j++) 
			{
					System.out.println("Entre com a valor[1] na posição de linha  : "+"["+i+"]"+" na coluna : ["+j+"]");
					matrizA[i][j]= ent.nextInt();
			}
		}
		
		
		for(int i = 0; i < linha; i++)
		{
			for(int j = 0; j < coluna; j++) 
				{
					System.out.println("Entre com a valor[2] na posição de linha  : "+"["+i+"]"+" na coluna : ["+j+"]");
					matrizB[i][j]= ent.nextInt();
				}
		}
		
		
		
		System.out.println("Valores no MatrizA");
		for(int i = 0; i < linha; i++) 
		{
			for(int j = 0; j < coluna; j++)
			{
				System.out.print(matrizA[i][j] + " "/* +"\t"*/);
			}
				System.out.println();
				System.out.println();
		}
		
		System.out.println("Valores no MatrizB");
		for(int i = 0; i < linha; i++) 
		{
			for(int j = 0; j < coluna; j++)
			{
				System.out.print(matrizB[i][j] + " "/* +"\t"*/);
			}
				System.out.println();
				System.out.println();
		}
		
			if (Arrays.deepEquals(matrizA, matrizB))
			{
				System.out.println("matrizA e  matrizB e igual");
			}
			else
			{
				System.out.println("matrizA e  matrizB e nao igual");
			}
		
	}
}
		



