package lista_oop_3;

public class questao3classe
{
	private int NumMatricula;
	private String nome;
	private String curso;
	private int loop = 3;
	private String materia[] = new String[loop];
	private double notas[][] = new double[loop][loop];
	int soma;
	
	private double media;
	
	
	
	void mediaNotas()
	{
		for(int i = 0; i < loop; i++)
		{
			soma = 0;
			media = 0;
			
			System.out.println("Materia: "+materia[i]);
			for (int j = 0; j < loop; j++) 
			{
				System.out.println("Nota : "+notas[i][j]);
				soma += notas[i][j];
			}
			media = soma / loop;
			System.out.println("media : "+media);
		}
		
		if(media >= 7.0)
			System.out.printf("APROVADO");
			
		else
		System.out.printf("REPROVADO");
		
	}
	
	void mostrarResul()
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Nome do Aluno : "+nome);
		System.out.println("Matricula do Aluno : "+NumMatricula);
		System.out.println("Nome do Curso : "+curso);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");

		mediaNotas();                  
	}

	public int getNumMatricula() 
	{
		return NumMatricula;
	}

	public void setNumMatricula(int numMatricula) 
	{
		NumMatricula = numMatricula;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCurso() 
	{
		return curso;
	}

	public void setCurso(String curso) 
	{
		this.curso = curso;
	}

	public int getLoop() 
	{
		return loop;
	}

	public void setLoop(int loop) 
	{
		this.loop = loop;
	}

	public String getMateria(int i) 
	{
		return this.materia[i];
	}

	public void setMateria(int i, String materia) 
	{
		this.materia[i] = materia;
	}

	public void getNotas(int i, int j, double notas) 
	{
		this.notas[i][j] = notas;
	}

	public void setNotas(int i, int j, double notas) 
	{
		this.notas[i][j] = notas;
	}
	
	public int getSoma() 
	{
		return soma;
	}

	public void setSoma(int soma) 
	{
		this.soma = soma;
	}

	public double getMedia() 
	{
		return media;
	}

	public void setMedia(double media)
	{
		this.media = media;
	}

 

}