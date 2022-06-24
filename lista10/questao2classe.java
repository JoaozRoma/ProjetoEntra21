package lista10;

public class questao2classe 
{

	int numeroConta;
	String nome;
	double saldo;
	double limite;
	String tipoConta;
	int op;
	int oop;
	double valor;
	
	
	boolean sacar(double valor)
	{
		if(saldo < valor)
		{
			return false;
		}
		else
		{
			saldo = saldo - valor;
			return true;
		}
	}
	
	void depositar(double valor)
	{
		saldo += valor;
	}
	
	
	boolean usarCheque(double valor)
	{
		if(saldo > valor)
		{
			return false;
		}
		else
		{
			saldo = saldo - limite;
			return true;
		}

	}
}
	

