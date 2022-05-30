package lista7;

import java.util.Scanner;

public class questao16 
{

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);
		int n = 10;
		int a[] = new int[n];
		int i;
		
		for (i=0; i<n; i++) 
		{
				System.out.printf("Informe %2d.elemento de %d: ", (i+1), n);
				a[i] = ent.nextInt();
		}
		 
		for (i=0; i<n; i++)
		{
			if(a[i] <= 0)
			{
				continue;
			}
			else 
			{
				a[i] = a[i];
				System.out.print(a[i]+", ");
			}
		}

}
}
