package Lista1;

import javax.swing.*;

public class Lembrar 
{

	public static void main(String[] args) 
	{
		

	
	int salario = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o salario : "));
			
	if(salario >= 1000)
	{
		Float resul = salario * 0.10F;
		
		JOptionPane.showMessageDialog(null,"Bonus de : " +resul+ " reais");
	}
	
	else if (salario <= 1000)
	{
		Float resul = salario * 0.15F;
		
		JOptionPane.showMessageDialog(null,"Bonus de : " +resul+ " reais");
	}
	
       
    }
}
