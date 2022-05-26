package lista3;

public class questao6 
{

	public static void main(String[] args) 
	{
	    float compra = 32.87f;
	    float  venda = 33.92f;
	    float  porce =  0.02f;
	    int   quanti =   1000;
	    
	    //ESQUEÇA TUDO
	    
	    float TTcompra;
	    float TTvendas;
	    float TTlucros;
	    float TTlucrosVend;
	    float TTlucrosComp;
	    float TTDespCompra;
	    float TTDespVendas;
	    
	    //total da compra e venda das ações ; obs: ESQUEÇER / LEMBRAR
	    TTcompra = compra * quanti;
	    TTvendas = venda  * quanti;
	    
	    //valores pago ao corretor 1° compra / 2° venda
	    TTDespCompra = TTcompra * porce;
	    TTDespVendas = TTvendas * porce;
	    
	    //Lucros sob a venda e a compra da ações
	    TTlucrosVend = TTvendas - TTDespVendas;
	    TTlucrosComp = TTcompra + TTDespCompra;
	    
	    //real Nword
	    TTlucros = TTlucrosVend - TTlucrosComp;
	    
	    //exibições no console
	    System.out.println("A quantia que José pagou pelas ações : " +TTcompra);
	    System.out.println("O valor da comissão que José pagou ao seu corretor na compra : " +TTDespCompra);
	    System.out.println("A quantia pela qual José vendeu as ações :" +TTvendas);
	    System.out.println("A quantia de comissão que José pagou ao seu corretor na venda : " +TTDespVendas);
	    System.out.println("Lucro ou Prejuizo : " +TTlucros);
	   
	}

}
