package lista6;



public class questao17 {

	public static void main(String[] args) 
	{
		  

		int ano=0;   
		double a=80000, b=200000;

		do
		{ 

			a = a + a*0.03;   

			b = b + b*0.015; 
	
			ano=ano+1;   

		}
		while (a<=b);

		System.out.println( "Anos: "+ano);

	}

}
