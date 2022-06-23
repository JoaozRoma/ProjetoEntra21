package lista9;

public class MostrarConta {

	public static void main(String[] args) 
	{
		dadosConta ContaUser = new dadosConta ();
		
		
		ContaUser.NumConta = 001;
		ContaUser.nome = "Jorge";
		ContaUser.Status = "Especial";
		ContaUser.limite = 1000;
		ContaUser.saldo = 342;
		
		
		System.out.println(ContaUser.NumConta);
		System.out.println(ContaUser.nome);
		System.out.println(ContaUser.Status);
		System.out.println(ContaUser.limite);
		System.out.println(ContaUser.saldo);
		

	}

}
