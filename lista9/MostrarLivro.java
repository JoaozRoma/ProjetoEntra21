package lista9;

public class MostrarLivro {

	public static void main(String[] args) 
	{
		dadosLivro livroirado = new dadosLivro ();

		livroirado.autor = "jorge";
		livroirado.ano = "2043";
		livroirado.editora = "bohrer editoras";
		livroirado.tipo = "edição de bolso";
		livroirado.tema = "ficção";
		
		
		System.out.println(livroirado.autor);
		System.out.println(livroirado.ano);
		System.out.println(livroirado.editora);
		System.out.println(livroirado.tipo);
		System.out.println(livroirado.tema);
		

	}

}
