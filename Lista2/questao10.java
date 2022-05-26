package Lista2;

import javax.swing.JOptionPane;

public class questao10 
{

	public static void main(String[] args)
	{
		String nome = JOptionPane.showInputDialog(null,"Insira o nome : ");
		
		int horaT   = Integer.parseInt(JOptionPane.showInputDialog(null,"digite a quantidade de horas trabalhadas pelo funcionário : "));
		
		float horaV = Float.parseFloat(JOptionPane.showInputDialog(null,"digite o valor da hora de trabalho do funcionário : "));
		
		int filhos  = Integer.parseInt(JOptionPane.showInputDialog(null,"digite a quantidade de filhos : "));
		
		float salario;
		
		
		salario = (float) ((horaV * horaT) + (filhos * 0.03 * horaV * horaT));
		
		
		JOptionPane.showMessageDialog(null,"o salário total do funcionário "+nome+" é de "+salario+" reais");
		

	}

}
