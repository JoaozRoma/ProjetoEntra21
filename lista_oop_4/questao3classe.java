package lista_oop_4;

public class questao3classe
{
	private double valor;
	
	
	public questao3classe()
	{
		
	}
	public double getValor() 
	{
		return valor;
	}
	public void setValor(double valor) 
	{
		this.valor = valor;
	}
	public static double convMinutoPSegundo (double valor) 
	{
		return valor * 60;
	}
	
	public static double convHoraPMinuto (double valor) 
	{
		return valor * 60;
	}
	
	public static double convDiaPHora (double valor) 
	{
		return valor * 24;
	}
	
	public static double convSemanaPDia (double valor) 
	{
		return valor * 7;
	}
	
	public static double convMesPDia (double valor) 
	{
		return valor * 30;
	}
	
	public static double convAnoPDia (double valor) 
	{
		return valor * 365;
	}
}
