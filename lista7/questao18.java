package lista7;

public class questao18
{

	public static void main(String[] args)
	{
		int num = 10;
		int[] x = new int[num];
		int primo = 0, init = 1, end = 101;
		
		for(int i = 0; i < num; i++) 
		{
			for(int j = init; j <=  end; j++) 
			{
				primo = end % j == 0 ? primo += 1 : primo;
			}
				if(primo == 2) 
				{
					x[i] = end;
				}
				else 
				{
					i--;
				}
			primo = 0; 
			end +=1;
		}
		for(int i = 0; i < num; i++)
		{
			System.out.println("Vetor ["+i+"]: "+x[i]);
		}
		

	}

}
