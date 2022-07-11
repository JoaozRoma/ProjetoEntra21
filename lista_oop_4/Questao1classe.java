package lista_oop_4;

public class Questao1classe 
{
	static private int contador;
	
	public static void setContador(int cont) 
	{
		Questao1classe.contador = cont;
	}

	public static void setContarMais(int cont)
	{
		Questao1classe.contador += cont;
	}
	
	public static void zerarContador() 
	{
		Questao1classe.contador = 0;
	}

	public Questao1classe() 
	{
		Questao1classe.contador++;
	}
	

	public Questao1classe(int cont) 
	{
		Questao1classe.contador += cont;
	}

	public static int getCont() 
	{
		return contador;
	}

}
