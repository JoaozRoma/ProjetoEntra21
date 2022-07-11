package lista_oop_4;

public class questao5classeCURSO 
{
	private questao5classeALUNO[] aluno = new questao5classeALUNO[2];
	private questao5classeALUNO professor;
	private String nome;
	private String horario;
	private float soma;
	private float media;
	
	public questao5classeCURSO() {
	}

	public questao5classeCURSO(String nome, String horario) 
	{
		this.nome = nome;
		this.horario = horario;
	}

	public void getAlunoSit() 
	{
		for (int i = 0; i < aluno.length; i++) 
		{
			System.out.printf("%n%dº ALUNO", (i + 1));
			System.out.println(aluno[i]);
			aluno[i].getNotasMediaSituacao();
		}
	}

	public void setAluno(int i, questao5classeALUNO aluno) 
	{
		this.aluno[i] = aluno;
	}

	public questao5classeALUNO getProfessor() 
	{
		return this.professor;
	}

	public void setProfessor(questao5classeALUNO professor) 
	{
		this.professor = professor;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getHorario() 
	{
		return horario;
	}

	public void setHorario(String horario) 
	{
		this.horario = horario;
	}
	
	public void mediaTurma() 
	{
		for (int i = 0; i < aluno.length; i++) 
		{
			this.soma += aluno[i].getMedia();
		}
		this.media = this.soma / aluno.length;
		System.out.printf("%nMédia geral da turma: %.2f%n", this.media);
	}
	
	public String ShowCurso() 
	{
		return "\n____________________________" + "\n   Curso de " + this.nome + "\n   Horário: " + this.horario + "\n____________________________";
	}
}
