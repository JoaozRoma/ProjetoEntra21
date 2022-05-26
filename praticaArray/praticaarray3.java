package praticaArray;
import java.util.Scanner;

public class praticaarray3 {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);

		int[] vetor1 = new int[3];
		int[] vetor2 = new int[vetor1.length];
		
		
		int menorV = 99999;
		int maiorV = 00000;
		
		int menorV2 = 99999;
		int maiorV2= 00000;
		
		int soma = 0;
		int soma2 = 0;
		
		int somaMM;
		int somaMN;
		
		for(int i = 0; i < vetor1.length; i++)
		{
			System.out.println("Entro com o valor1 na posição : "+"["+i+"]");
			vetor1[i] = ent.nextInt();
			
			soma += vetor1[i];
			if(vetor1[i] < menorV)
			{
				menorV = vetor1[i];
			}
			
			if(vetor1[i] > maiorV)
			{
				maiorV = vetor1[i];
			}
		}
	
		

		
		System.out.println("=================================================");
		

		
		for(int i = 0; i < vetor1.length; i++)
		{
			System.out.println("Entro com o valor2 na posição : "+"["+i+"]");
			vetor2[i] = ent.nextInt();
			
			soma2 += vetor2[i];
			
			if(vetor2[i] < menorV2)
			{
				menorV2 = vetor2[i];
			}
			
			if(vetor2[i] > maiorV2)
			{
				maiorV2 = vetor2[i];
			}
		}
		
		somaMM = maiorV + maiorV2;
		somaMN = menorV + menorV2;
		System.out.println("Soma do vetor 1 total    :"+"["+soma+"]");
		System.out.println("Maior numero do vetor 1  :"+"["+maiorV+"]");
		System.out.println("Menor numero do vetor 1  :"+"["+menorV+"]");
		
		System.out.println("=======================================");
		
		System.out.println("Soma do vetor 2 total    :"+"["+soma2+"]"); 
		System.out.println("Maior numero do vetor 2  :"+"["+maiorV2+"]");
		System.out.println("Menor numero do vetor 2  :"+"["+menorV2+"]");
		
		System.out.println("=======================================");
		
		System.out.println("Soma dos maiores numeros de ambos vetores : "+somaMM);
		System.out.println("Soma dos menores numeros de ambos vetores : "+somaMN);

		ent.close();
	}

}
