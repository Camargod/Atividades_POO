package POO;

import Classes.Notebook;

public class POO_02 
{

	public POO_02() 
	{
	}

	public static void main(String[] args) 
	{
		Notebook note = new Notebook();
		note.setDisplay("13 polegadas");
		note.setMemory("16gb ddr4 2133mhz");
		note.setMobo("Gigabyte");
		note.setModel("Macbook Pro 16.1 2020");
		note.setProcessor("Intel Core i5-1035G7");
		note.setSpeaker("Dolby atmos 5w");
		note.setVolume(0.125f);
		
		System.out.print(note.getDisplay() + '\n');
		System.out.print(note.getMemory() + '\n');
		System.out.print(note.getMobo() + '\n');
		System.out.print(note.getModel() + '\n');
		System.out.print(note.getProcessor() + '\n');
		System.out.print(note.getSpeaker() + '\n');
		System.out.print(note.getVolume() + '\n');

	}

}
