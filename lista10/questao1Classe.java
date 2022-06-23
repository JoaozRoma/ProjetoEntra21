package lista10;

public class questao1Classe 
{

	boolean ligado;
	String Status;
	
	
	void botaoLampada()
	{
		if(ligado == false)
		{
			ligado = true;
			Status = "Esta ligada !";
		}
		else if(ligado == true)
		{
			ligado = false;
			Status = "Esta desligada !";
		}
	}
	
	void statusLampada()
	{
		System.out.println("A Lampada esta : "+ Status);
	}
	
	
}
