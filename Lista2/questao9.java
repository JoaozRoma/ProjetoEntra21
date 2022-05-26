package Lista2;
import javax.swing.*;

public class questao9 
{

	public static void main(String[] args) 
	{
		int pessoas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de pessoas que participara na festa : "));	
		
		
		float carne, cerveja, total;
		
		
		carne = (float)   (0.5 * 18 * pessoas);
		cerveja = (float) (6 * 1.7 * pessoas);
		
		
		total = cerveja + carne;
		
		JOptionPane.showMessageDialog(null,"quantidade gasta em carne foi gasta : "+carne+" reais");
		JOptionPane.showMessageDialog(null,"quantidade gasta em cerveja foi gasta : "+cerveja+" reais");
		JOptionPane.showMessageDialog(null,"quantidade gasta no total: "+total+" reais");

	}

}
