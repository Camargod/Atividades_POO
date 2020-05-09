package Classes;

public class Sound {

	static float volume = 0f;
	static float maxVol = 1f;
	
	public Sound()
	{
		
	}
	
	public float getVolume()
	{
		return volume;
	}
	public void setVolume(float value)
	{
		if(volume <= maxVol && volume + value <= maxVol && volume + value >= 0f)
		{
			volume += value;
		}
		else
		{
			System.err.print("Por favor defina um valor que não ultrapasse os limites de volume.");
		}
	}

}
