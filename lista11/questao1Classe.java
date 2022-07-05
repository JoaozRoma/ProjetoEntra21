package lista11;

public class questao1Classe 
{

	private boolean ligado;
	private String Status;
	private String nome;
	
	questao1Classe() 
	{
		
	}
	questao1Classe( String nome)
	{
		this.nome = nome;
	}
	
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
		System.out.println("A Lampada esta : "+ Status+ ": marca :"+this.nome);
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
}