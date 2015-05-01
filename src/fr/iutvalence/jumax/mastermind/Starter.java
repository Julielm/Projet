package fr.iutvalence.jumax.mastermind;

import java.util.Arrays;

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
		Color[] secret = new GeneratorOfRandomSecrets().getSecret(Grid.COLUMNS_NB);
		Game game = new Game(player, secret);	
		System.out.println(Arrays.toString(secret));
		game.start();

	}
}
