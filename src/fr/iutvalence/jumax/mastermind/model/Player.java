package fr.iutvalence.jumax.mastermind.model;

/**
 * Game's player.
 * 
 * @author jumax
 * @version 1.0.0
 */
public class Player {
	/** Player's name. */
	private final String name;

	/** Player's constructor. 
	 * @param name 
	 */
	public Player(String name) {
		this.name = name;
	}

	/** Name's getter. 
	 * @return the name of the player
	 */
	public String getName() {
		return this.name;
	}
}
