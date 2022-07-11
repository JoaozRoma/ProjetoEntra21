package lista_oop_4;
import java.util.Scanner;

public class questao5main {

	public static void main(String[] args)
	{
		Scanner ent = new Scanner(System.in);
		
		questao5classeALUNO aluno = new questao5classeALUNO();
		questao5classePROFESSOR  professor = new questao5classePROFESSOR();
		questao5classeCURSO  cursos = new questao5classeCURSO ();
		
		questao5classeCURSO curso = new questao5classeCURSO();
		System.out.print("Informe o nome do curso: ");
		curso.setNome(ent.nextLine());
		System.out.print("Informe o horário do curso: ");
		curso.setHorario(ent.nextLine());
		
		questao5classeALUNO aluno1 = new questao5classeALUNO();
		System.out.print("\nInforme o nome do 1º aluno: ");
		aluno1.setNome(ent.nextLine());
		System.out.print("Informe a matrícula: ");
		aluno1.setMatricula(ent.next());
		for (int i = 0; i < 4; i++) 
		{
			System.out.printf("Informe a %dª nota: ", (i+1));
			aluno1.setNotas(i, ent.nextFloat());
		}
		
		
		questao5classeALUNO aluno2 = new questao5classeALUNO();
		ent.nextLine();
		System.out.print("\nInforme o nome do 2º aluno: ");
		aluno2.setNome(ent.nextLine());
		System.out.print("Informe a matrícula: ");
		aluno2.setMatricula(ent.next());
		for (int i = 0; i < 2; i++) 
		{
			System.out.printf("Informe a %dª nota: ", (i+1));
			aluno2.setNotas(i, ent.nextFloat());
		}
		curso.setAluno(0, aluno1);
		curso.setAluno(1, aluno2);
	
		
		
		System.out.println(curso);
		curso.getAlunoSit();
		curso.mediaTurma();

		ent.close();

	}

}
