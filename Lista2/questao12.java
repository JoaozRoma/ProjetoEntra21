package Lista2;
import java.util.Scanner;


public class questao12
{

	public static void main(String[] args)
	{

		Scanner leia = new Scanner(System.in);
		
		int pacote,foto_avulsa;
 		
		float total;
		
		System.out.println("digite a quantidade de fotos avulsas para revelar: : ");
		foto_avulsa = leia.nextInt();
		
		System.out.println("digite a quantidade de pacotes fotos (100 fotos cada) para revelar : ");
		pacote= leia.nextInt();
		
		total= (float) ((pacote * 44) + (foto_avulsa * 0.70));
		
		System.out.println("a quantidade de pacotes foi de: "+pacote);
		System.out.println("a quantidade de fotos avulsas foi de: "+foto_avulsa);
		System.out.println("o valor total pelas fotos será de: "+total);
		
		
		

	}

}
