package lista10;

public class questao3classe 
{
	int NumMatricula;
	String nome;
	String curso;
	int loop = 3;
	String materia[] = new String[loop];
	double notas[][] = new double[loop][loop];
	int soma;
	
	double media;
	
	
	
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

}
