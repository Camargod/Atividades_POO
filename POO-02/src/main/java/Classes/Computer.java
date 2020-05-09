package Classes;

public class Computer extends Sound
{

	private String modelo;
	private String processador;
	private String memoria;
	private String mobo;
	
	public Computer() 
	{
		super();
	}
	
	public String getModel()
	{
		return modelo;
	}
	public String getProcessor()
	{
		return processador;
	}
	public String getMemory()
	{
		return memoria;
	}
	public String getMobo()
	{
		return mobo;
	}
	
	public void setModel(String value)
	{
		modelo = value;
	}
	public void setProcessor(String value)
	{
		processador = value;
	}
	public void setMemory(String value)
	{
		memoria = value;
	}
	public void setMobo(String value)
	{
		mobo = value;
	}
	
}
