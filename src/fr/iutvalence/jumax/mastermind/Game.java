package fr.iutvalence.jumax.mastermind;

/**
 * Preparation of a new game.
 * 
 * @author jumax
 * @version 1.0.0
 */
public class Game
{
	/** Rounds number by default. */
	public final static int DEFAULT_ROUND_NB=10;
	/** Secret line of pawn's colors. */
	private final Color[] secret;
	/** Player of the game. */
	private final Player player;
	/** Grid of the game. */
	private final Grid grid;
	/** Rounds' number of the game. */
	private final int roundNb;

	/** Game's constructor. */
	public Game(Player player, Color[] secret)
	{
		this.player = player;
		// TODO Warning! Array passed by reference in JAVA.
		this.secret = secret;
		this.grid = new Grid();
		this.roundNb = DEFAULT_ROUND_NB;
	}

	/**
     * Representation of a line of the grid.
     */
    public StringBuilder displayLine(int linenb) {
        // TODO Replace with for each loop // I don't understand what we have to replace
        StringBuilder representation= new StringBuilder();
        Color[] lineToDisplay = this.grid.getLine(linenb);
        for (int columnNumber = 0; columnNumber < Grid.COLUMNS_NB; columnNumber++) {
            representation.append(lineToDisplay[linenb].toString() + " ");
        }
        return representation;
    }
    
    /**
     * Representation of the secret.
     */
    public void displaySecret() {
        for (final Color color : secret) {
			System.out.println(color);
		}
    }
    
	/** Start a game. */
	public void start()
	{
		// Test of line's display of the grid in the game.
		System.out.println(this.displayLine(0));
	}

}
