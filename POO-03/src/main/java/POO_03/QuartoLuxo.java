package POO_03;

public class QuartoLuxo extends Quarto
{

	public QuartoLuxo()
	{
		super();
	}
	
	public QuartoLuxo(int basePrice) 
	{
		super(basePrice);
	}
	
	@Override
	public double calculaPreco()
	{
		return getBasePrice() * 1.3;
	}
	
}
