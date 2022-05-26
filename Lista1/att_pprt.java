package Lista1;

public class att_pprt 
{

	public static void main(String[] args) 
	{
		
		
		int salario = 1000;
		
		int porcen1 = 10;
		int porcen2 = 15;
		
		float res ;
		float res2;
		
		String resTernario;
		
		
		res  = salario %porcen1;
			
		res2 = salario %porcen2;
		
		
		resTernario = (salario <= 1000) ?"Bonus de 10%" : (salario >= 1000) ?"bonus de 15%" : "sem bonus";
		System.out.println("O bonus e de, "+resTernario);
		
		
		
		
		
		
		
		
		
		
	}

}
