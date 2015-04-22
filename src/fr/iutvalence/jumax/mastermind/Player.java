package fr.iutvalence.jumax.mastermind;

/**
 * Game's player.
 * 
 * @author jumax
 * @version 1.0.0
 */
public class Player
{
	/** Player's name. */
	private final String name;

	/** Player's constructor. */
	public Player(String name)
	{
		this.name = name;
	}

	/** Name's getter. */
	public String getName()
	{
		return this.name;
	}
}
