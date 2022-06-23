package lista10;

public class questao2classe 
{

	int numeroConta;
	String nome;
	double saldo;
	double limite;
	String tipoConta;
	int op;
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

}
	

