package lista5;

import java.util.Scanner;

public class questao14 {
	

	public static void main(String[] args) 
	{
	Scanner ent = new Scanner(System.in);

	float saldoM,credito;
	
	
	System.out.println("Qual o seu saldo ?: ");
	saldoM = ent.nextFloat();
	
	if(saldoM < 200)
	{
		credito = 0;
	}
	else if(saldoM > 201 && saldoM < 400)
	{
		credito = saldoM * 0.2f;
		
		System.out.println("Saldo Medio : "+saldoM);
		System.out.println("Valor credito : "+credito);
	}
	else if (saldoM > 401 && saldoM < 600)
	{
		credito = saldoM * 0.3f;
		
		System.out.println("Saldo Medio : "+saldoM);
		System.out.println("Valor credito : "+credito);
	}
	else if(saldoM > 601)
	{
		credito = saldoM * 0.4f;
		
		System.out.println("Saldo Medio : "+saldoM);
		System.out.println("Valor credito : "+credito);
	}

	
	ent.close();

	}

}
