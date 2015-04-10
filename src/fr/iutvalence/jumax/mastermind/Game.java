/**
 * 
 */
package fr.iutvalence.jumax.mastermind;

/**
 * Preparation of a new game.
 * 
 * @author jumax
 * @version 1.0.0
 */
public class Game {
	/** Secret line of pawn's colors. */
	private final Color[] secret;
	/** Player of the game. */
	private final Player player;
	/** Grid of the game. */
	private final Grid grid;
	/** Rounds' number of the game. */
	private final int roundNb;
	/** Game's constructor */
	public Game(Player player, Color[] secret){
		this.player=player;
		this.secret=secret;
		this.grid=new Grid();
		this.roundNb=10;			
	}
	/** Start a game.*/	
	public void start() {
				
	}

}
