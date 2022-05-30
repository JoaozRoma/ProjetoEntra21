package lista7;
import java.util.Scanner;
public class questao11 
{

	public static void main(String[] args) 
	{
			Scanner ent = new Scanner(System.in);

			int n = 10;
			int a[] = new int[n];
			int i, j;
			
			boolean palin;

			for (i=0; i<n; i++) 
			{
				System.out.printf("Informe %2d. elemento de %d: ", (i+1), n);
				a[i] = ent.nextInt();
			}
			i = 0; 
			j = (n-1); 
		    palin = true; 
		    
		    while ((i < j) && (palin == true)) 
		    {
		    	if (a[i] != a[j])
		    		palin = false; 
		    	
		    	else 
		    	{
		    		i = i + 1;
		    		j = j - 1;
		    
		    	if (palin == true)
		    	{
		    		System.out.printf("\nOs elementos do vetor formam um palindromo.\n");
		    	break;
		    	}
		    	else 
		    		System.out.printf("\nOs elementos do vetor \"nao\" formam um palindromo.\n");
		    	}
		    }
	}
}
