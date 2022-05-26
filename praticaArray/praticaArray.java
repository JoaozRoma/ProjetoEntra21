package praticaArray;
import java.util.Scanner;

public class praticaArray {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		int[]VetorA = new int[5];
		int[]VetorB = new int[VetorA.length];
		
		for(int i = 0; i < VetorA.length; i++)
		{
			System.out.println("Entre com o valor da posição :"+i);
			VetorA[i] = ent.nextInt();
			VetorB[i] = VetorA[i];
		}
		System.out.println("Vetor A");
		for(int i = 0; i < VetorA.length; i++)
		{
			System.out.println(VetorA[i] + " ");
		}
		System.out.println("===============");
		System.out.println("Vetor B");
		for(int i = 0; i < VetorB.length; i++)
		{
			System.out.print(VetorB[i] + " ");
		}

		ent.close();

	}

}
