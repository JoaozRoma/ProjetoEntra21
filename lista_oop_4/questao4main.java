package lista_oop_4;

import java.util.Scanner;

public class questao4main
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		questao4classeAGENDA agenda = new questao4classeAGENDA();
		
		questao4classesCONTATO contatos[] = new questao4classesCONTATO[2];

		System.out.print("Escolha o nome da sua Agenda: ");
		agenda.setNomeAgenda(read.nextLine());
		for (int i = 0; i < contatos.length; i++) 
		{
			questao4classesCONTATO num = new questao4classesCONTATO();
			
			System.out.print("\nNome do " + (i + 1) + " contato: ");
			num.setNomeContato(read.nextLine());
			
			System.out.print("\nNº do telefone de "+num.getNomeContato()+": ");
			num.setTelefoneContato(read.nextLine());
			
			System.out.print("\nE-MAIL de "+num.getNomeContato()+": ");
			num.setEmailContato(read.nextLine());
			contatos[i] = num;
		}
		agenda.setContatos(contatos);
		System.out.println("\n=========================================\n"
		+ agenda.showAgenda());

		read.close();
		


		

	}
}
