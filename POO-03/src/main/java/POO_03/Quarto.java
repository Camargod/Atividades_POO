package POO_03;

public class Quarto 
{
	private double basePrice;

	public Quarto()
	{
		this.basePrice = 10;
	}
	public Quarto(double basePrice) 
	{
		this.basePrice = basePrice;
	}
	
	public void setBasePrice(double price)
	{
		basePrice = price;
	}
	
	public double getBasePrice()
	{
		return basePrice;
	}
	
	public double calculaPreco()
	{
		return basePrice;
	}

}
