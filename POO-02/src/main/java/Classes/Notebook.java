package Classes;

public class Notebook extends Computer
{
	private String display;
	private String speaker;

	public Notebook() 
	{
		super();
	}
	
	public void setDisplay(String value)
	{
		display = value;
	}
	public void setSpeaker(String value)
	{
		speaker = value;
	}
	public String getDisplay() 
	{
		return display;
	}
	public String getSpeaker()
	{
		return speaker;
	}

}
