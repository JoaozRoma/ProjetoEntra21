package Lista2;
import javax.swing.*;

public class questao7 
{

	public static void main(String[] args) 
	{
		 
			JOptionPane.showMessageDialog(null,"Bem vindo");
	      
         
			
	                    
	       float comida = Float.parseFloat(JOptionPane.showInputDialog("digite o peso em gramas : "));
	       
	       float valor;
	       
	       
	       valor = (float) ((comida-230)* 0.02);
	       
	       JOptionPane.showMessageDialog(null,"O valor do prato sera : "+valor+" reais");

	}

}
