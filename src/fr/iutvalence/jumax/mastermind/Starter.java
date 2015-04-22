package fr.iutvalence.jumax.mastermind;

/**
 * Application of the game.
 *
 * @author jumax
 * @version 1.0.0
 */
public class Starter
{
	/** Main method of the game. */
	public static void main(String[] args)
	{
		Player player = new Player("Player1");
		Color[] secret = {Color.GREEN,  Color.BLACK, Color.PURPLE, Color.YELLOW};
		// Display of secret's colors.
		for(int columnNumber=0; columnNumber<Grid.COLUMNS_NB;columnNumber++)
			System.out.println(secret[columnNumber]);
		Game game = new Game(player, secret);
		game.start();

	}
}
