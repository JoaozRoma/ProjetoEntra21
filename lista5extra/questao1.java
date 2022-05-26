package lista5extra;

import java.util.Scanner;

public class questao1 
{

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);

		float nivel;
		
		System.out.println("============================");
		System.out.println("==== Nivel de Poluição =====");
		System.out.println("============================");
		System.out.println("=== 0 á 0,25 - Aceitavel ===");
		System.out.println("======= 0,3 - Alerta =======");
		System.out.println("===== 0,4 - Precupante =====");
		System.out.println("====== 0,5 - Perigoso ======");
		System.out.println("============================");
		System.getProperty("line.separator");
		
		System.out.println("Digite o nivel de Poluição : ");
		nivel = ent.nextFloat();
		
		if(nivel == 0 || nivel <= 0.25)
		{
			System.out.println("Nenhuma empresa será chamada");
		}
		else if (nivel == 0.3)
		{
			System.out.println("Empresas do grupo (1) será intimada");
		}
		else if (nivel == 0.4)
		{
			System.out.println("Empresas dos grupos (1) e (2) será intimadas e suspensas");
		}
		else if (nivel == 0.5)
		{
			System.out.println("Empresas de todos os grupos será suspensas");
		}
		else
		{
			System.out.println("Nivel não resgistrado");
		}
		ent.close();
	}

}
