package lista8extra;
import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		int linha = 2;
		int coluna = 2;
		int[] vetor1 = new int [linha];
		int   matrizA [][] =  new int   [linha][coluna];
		int num = 0 ;

			
			
		for(int i = 0; i < linha; i++)
		{
			for(int j = 0; j < coluna; j++) 
			{
					System.out.println("Entre com a valor[1] na posição de linha  : "+"["+i+"]"+" na coluna : ["+j+"]");
					matrizA[i][j]= ent.nextInt();
					
					
					if(matrizA[i][j]  % 7 == 0)
					{
						num = matrizA[i][j];
						vetor1[i] += num;
						System.out.println("é divisivel !");
					}
			
			}
		}
		for(int i = 0; i < linha; i++)
		{
			System.out.println(vetor1[i]);
		}
		

	}

}
