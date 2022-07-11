package lista_oop_4;

public class questao5classePROFESSOR 
{
	private String nome;
	private String departamento;
	private String email;
	
	public questao5classePROFESSOR() {
	}

	public questao5classePROFESSOR(String nome, String departamento, String email) {
		this.nome = nome;
		this.departamento = departamento;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String ShowProf() {
		return "\nNome: " + this.nome + "\nEmail: " + this.email + "\n Departamento: " + this.departamento;
	}
}
