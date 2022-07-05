package lista11;

public class questao2classe 
{

	private int numeroConta;
	private String nome;
	private double saldo;
	private double limite;
	private String tipoConta;
	private double valor;
	 int op;
	 int oop;
	
	
	public questao2classe() 
	{
	
	}
	public void criarConta(String nome, double saldo, int numeroConta, double limite, String tipoConta, double valor)
	{
		
	}
	

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
	public int getNumeroConta() 
	{
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) 
	{
		this.numeroConta = numeroConta;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public double getSaldo() 
	{
		return saldo;
	}
	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}
	public double getLimite() 
	{
		return limite;
	}
	public void setLimite(double limite) 
	{
		this.limite = limite;
	}
	public String getTipoConta() 
	{
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) 
	{
		this.tipoConta = tipoConta;
	}
	public double getValor() 
	{
		return valor;
	}
	public void setValor(double valor) 
	{
		this.valor = valor;
	}
	public int getOp() 
	{
		return op;
	}
	public void setOp(int op) 
	{
		this.op = op;
	}
	public int getOop() 
	{
		return oop;
	}
	public void setOop(int oop) 
	{
		this.oop = oop;
	}
}
	

