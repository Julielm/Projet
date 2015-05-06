package fr.iutvalence.jumax.mastermind;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Application of the game.
 *
 * @author jumax
 * @version 1.0.0
 */
public class Starter
{
	/** Main method of the game. 
	 * @param args (n/a) */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your name->");
		String str = scanner.nextLine();
		
		Player player = new Player(str);
		Color[] secret = new GeneratorOfSecretsWithDictionary().getSecret(Grid.COLUMNS_NB);
		Game game = new Game(player, secret);	
		game.start();
		System.out.println(Arrays.toString(secret));

	}
}
