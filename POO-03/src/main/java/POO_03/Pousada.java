package POO_03;

public class Pousada 
{
	
	
	public Pousada() 
	{
	}

	public static void main(String[] args) 
	{
		Quarto quarto = new Quarto();
		System.out.println(quarto.calculaPreco()); 
		
		QuartoLuxo quartoluxo = new QuartoLuxo(25);
		System.out.println(quartoluxo.calculaPreco()); 
	}

}
