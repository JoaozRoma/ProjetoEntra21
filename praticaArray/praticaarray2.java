package praticaArray;
import java.util.Scanner;

public class praticaarray2 {

	public static void main(String[] args) 
	{
	Scanner ent = new Scanner(System.in);

	int[] vetorC = new int[8];
	int[] vetorD = new int[vetorC.length];
	
	for(int i = 0; i < vetorC.length; i++)
	{
		System.out.println("Entro com o valor na posição : "+"["+i+"]");
		vetorC[i] = ent.nextInt();
		vetorD[i] = vetorC[i] * 2;
	}
	System.out.println("Vetor C");
	for(int i = 0; i < vetorC.length; i++)
	{
		System.out.println(vetorC[i] + " ");
	}
	System.out.println("===============");
	System.out.println("Vetor D");
	for(int i = 0; i < vetorD.length; i++)
	{
		System.out.print(vetorD[i] + " ");
	}
	ent.close();

	}

}
