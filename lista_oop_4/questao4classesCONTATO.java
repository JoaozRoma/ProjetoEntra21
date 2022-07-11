package lista_oop_4;

public class questao4classesCONTATO 
{
	String nomeContato, telefoneContato, emailContato;

	public questao4classesCONTATO() 
	{
		
	}

	public String getNomeContato() 
	{
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) 
	{
		this.nomeContato = nomeContato;
	}

	public String getTelefoneContato() 
	{
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato)
	{
		this.telefoneContato = telefoneContato;
	}

	public String getEmailContato()
	{
		return emailContato;
	}

	public void setEmailContato(String emailContato) 
	{
		this.emailContato = emailContato;
	}
	public String showContatos() 
	{
		return "Nome: "+this.getNomeContato()+". Telefone: "+this.getTelefoneContato()+"\n"+"E-mail: "+this.getEmailContato()+"\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
	}
}
