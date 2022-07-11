package lista_oop_4;

public class Questao1main {

	public static void main(String[] args) 
	{
		Questao1classe contador = new Questao1classe(1);
		System.out.println(Questao1classe.getCont());
		
		Questao1classe contador2 = new Questao1classe(2);
		System.out.println(Questao1classe.getCont());
		
		Questao1classe contador3 = new Questao1classe(3);
		System.out.println(Questao1classe.getCont());
	
		
		Questao1classe.zerarContador();
		System.out.println(Questao1classe.getCont());
		
		Questao1classe.setContador(4);
		System.out.println(Questao1classe.getCont());
		
		Questao1classe.setContador(8);
		System.out.println(Questao1classe.getCont());
		


	}

}
