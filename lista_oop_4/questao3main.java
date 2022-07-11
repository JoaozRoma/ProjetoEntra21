package lista_oop_4;

import java.util.Scanner;

public class questao3main 
{
	public static void main(String[] args) 
	{
	int op;
		
	
	Scanner read = new Scanner(System.in);
	
	questao3classe Tempo = new questao3classe();
	

	System.out.print("Digite Uma opção : ");
	System.out.println("+++++++++++++++++++");
	System.out.println("1 :minuto p/ segundos");
	System.out.println("2 :  hora p/ minuto");
	System.out.println("3 :   dia p/ hora");
	System.out.println("4 :semana p/ dia");
	System.out.println("5 :   mes p/ dia");
	System.out.println("6 :   ano p/ dia");
	System.out.println("0 :         sair");
	
	op = read.nextInt();
		
	switch (op) 
	{
	case 1:
		System.out.print("Digite um valor (minuto p/ segundos) : ");
		Tempo.setValor(read.nextDouble());
		System.out.println(Tempo.convMinutoPSegundo(Tempo.getValor()));
	break;
	
	case 2:
		System.out.print("Digite um valor (hora p/ minuto) : ");
		Tempo.setValor(read.nextDouble());
		System.out.println(Tempo.convHoraPMinuto(Tempo.getValor()));
	break;
	
	case 3:
		System.out.print("Digite um valor (dia p/ hora) : ");
		Tempo.setValor(read.nextDouble());
		System.out.println(Tempo.convDiaPHora(Tempo.getValor()));
	break;
	
	case 4:
		System.out.print("Digite um valor (semana p/ dia) : ");
		Tempo.setValor(read.nextDouble());
		System.out.println(Tempo.convSemanaPDia(Tempo.getValor()));
	break;
	
	case 5:
		System.out.print("Digite um valor (mes p/ dia) : ");
		Tempo.setValor(read.nextDouble());
		System.out.println(Tempo.convMesPDia(Tempo.getValor()));
	break;
	
	case 6:
		System.out.print("Digite um valor (ano p/ dia) : ");
		Tempo.setValor(read.nextDouble());
		System.out.println(Tempo.convAnoPDia(Tempo.getValor()));
	break;
	case 0:

		System.out.print("quit");


	}
		
		
	
	}
}
