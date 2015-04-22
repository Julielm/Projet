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
		// TODO You should do a method to reuse this comportment
		// Display of secret's colors.
		for (final Color color : secret) {
			System.out.println(color);
		}
		Game game = new Game(player, secret);
		game.start();

	}
}
