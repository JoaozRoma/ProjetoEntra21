package lista9;

public class MostrarLamp {

	public static void main(String[] args)
	{
		dadosLamp LampLed = new dadosLamp ();
		
		LampLed.marca = "Generic";
		LampLed.Modelo = "Bombilla de luz de luz";
		LampLed.cor = "	Branco";
		
		
		System.out.println(LampLed.marca);
		System.out.println(LampLed.Modelo);
		System.out.println(LampLed.cor);

	}

}
