package lista7;

import java.util.Scanner;

public class questao15 
{

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);

		

		
		  int n = 2;
		  int a[] = new int[n];
		  int i;
		  String res = "";
		  
		  
			for (i=0; i<n; i++) 
			{
				System.out.printf("Informe %2d.elemento de %d: ", (i+1), n);
				a[i] = ent.nextInt();
			}
			
			for(i =0; i < n; i++)
			{
				System.out.print("Valor["+i+"] : ");
				res = "";
				
				for (int z = 2; z <= a[i]; z++)//incrementa
				{
					res += (a[i] % z == 0) ? ", "+z : "";//valida a divisao
				}
				System.out.println("D("+ a[i] +") = {1"+ res +"}");
			}
			ent.close();
	}

}
