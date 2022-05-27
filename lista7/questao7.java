package lista7;

import java.util.Scanner;

public class questao7 
{

	 public static void main(String[] args) 
	 {
		 try (Scanner ent = new Scanner(System.in)) {
			int numerovetor = 10;
			 int[] vetorA = new int[numerovetor];
			 int Contapar = 0;
			 int Contaimp = 0;
			 float PorcenPar;
			 float PorcenImpar;

			 for(int i = 0; i < vetorA.length; i++)
				{
					System.out.println("Entro com o valorA na posição : "+"["+i+"]");
					vetorA[i] = ent.nextInt();
					

					if ((vetorA[i] % 2) == 0) 
					{
						Contapar++;
						System.out.printf("Vetor[%d] = %2d <--- Num digitado '%d' = numero par\n", i, vetorA[i], Contapar);
					}
					else 
					{
						Contaimp++;
						System.out.printf("Vetor[%d] = %2d <--- Num digitado '%d' = impar\n", i, vetorA[i], Contaimp);
					}
				}

			 PorcenPar = Contapar / (float)numerovetor * 100;
			 System.out.printf("\nExistem %d numeros pares no vetor, ou seja, %.2f%%", Contapar, PorcenPar);

			 PorcenImpar = Contaimp / (float)numerovetor * 100;
			 System.out.printf("\nExistem %d numeros impares no vetor, ou seja, %.2f%%\n", Contaimp, PorcenImpar);
		}
	 }

}