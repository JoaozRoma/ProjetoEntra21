package lista_oop_4;

public class questao4classeAGENDA 
{
	private questao4classesCONTATO contatos[];
	private String nomeAgenda;
	
	public questao4classeAGENDA()
	{
		contatos = new questao4classesCONTATO[2];
	}

	public questao4classesCONTATO[] getContatos() {
		return contatos;
	}

	public void setContatos(questao4classesCONTATO[] contatos) {
		this.contatos = contatos;
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public String showAgenda() 
	{
		String limpar = ""; //limpa 
		for (int i = 0; i < contatos.length; i++) {
			limpar +=  "CONTATO DE:\n"+contatos[i].showContatos()+"\n";
		}
		return "Nome da Agenda: "+this.getNomeAgenda()+"\n++++++++++++++++++++++++++++++\n"+limpar;
}
}
