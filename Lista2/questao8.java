package Lista2;
import javax.swing.*;


public class questao8 
{

	public static void main(String[] args) 
	{
	
		String nome = JOptionPane.showInputDialog(null,"Insira seu nome : ");
		
		
		float distancia  = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira sua distancia (km) : "));
		
		float tempo = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira o tempo durante o percurso : "));
		
		
		float conta;
		
		
		conta = (float) (distancia/tempo);
		
		
		JOptionPane.showMessageDialog(null,"A velocidade média de "+conta+" (km/h) o nome do piloto era "+nome);

	}

}
