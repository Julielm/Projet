package fr.iutvalence.jumax.mastermind.view.cli;

import java.util.Arrays;
import java.util.Scanner;

import fr.iutvalence.jumax.mastermind.model.Color;
import fr.iutvalence.jumax.mastermind.model.Grid;
import fr.iutvalence.jumax.mastermind.model.Oracle;
import fr.iutvalence.jumax.mastermind.model.Player;
import fr.iutvalence.jumax.mastermind.model.WhiteColorException;

/**
 * Preparation of a new game.
 * 
 * @author jumax
 * @version 1.0.0
 */
public class Game {
	/** Returned constant when the player loose. */
	public static final int LOST_GAME = 0;
	/** Secret line of pawn's colors. */
	private final Oracle secret;
	/** Player of the game. */
	private final Player player;
	/** Grid of the game. */
	private final Grid grid;
	/** Rounds' number of the game. */
	private final int roundNb;

	/**
	 * Game's constructor.
	 * 
	 * @param player
	 * @param secret
	 */
	public Game(Player player, Color[] secret) {
		this.player = player;
		this.secret = new Oracle(secret.clone());
		this.grid = new Grid();
		this.roundNb = Grid.LINES_NB;
		
	}
	
	
	/** 
	 * Start a game. 
	 * @return the number of rounds to win 
	 * */
	public int game() {
		int lineNumber = 0;
		int goodColorGoodPlace = 0;
		while (lineNumber != this.roundNb
				&& goodColorGoodPlace != Grid.COLUMNS_NB) {
			System.out.println("Round " + (lineNumber+1) +":");
			Color[] guess = askLine();
			this.grid.submitLine(guess, lineNumber);
			System.out.println(Arrays.toString(guess));

			int[] answer = this.secret.check(guess);
			goodColorGoodPlace = answer[0];
			int goodColor = answer[1];

			lineNumber++;
			System.out.println("You have " + goodColorGoodPlace
					+ " pawn(s) which have the good place.");
			System.out
					.println("You have "
							+ goodColor
							+ " pawn(s) which have the good color but the wrong place.");
		}
		if (goodColorGoodPlace == Grid.COLUMNS_NB) {
			System.out.print("Congratulations " + this.player.getName()
					+ " you won in " + lineNumber);
					if (lineNumber==1) {
						System.out.print("round !!");
					}
					else {
						System.out.print(" rounds !!");
					}
			return lineNumber;
		}
		System.out.println("Try again " + this.player.getName());
		return LOST_GAME;
	}

	
	/**
	 * Ask a line to the player.
	 * 
	 * @return a line of colors
	 */
	private static Color[] askLine() {

		Color[] guess = new Color[Grid.COLUMNS_NB];
		for (int col = 0; col < Grid.COLUMNS_NB; col++) {
			try {
				inputColor(col, guess);
			} catch (WhiteColorException e) {
				System.err.println("You can't input the white color");
				col -= 1;
			}
		}
		return guess;
	}

	/**
	 * Input a color.
	 * 
	 * @param col
	 * @param guess
	 * @throws WhiteColorException
	 */
	public static void inputColor(int col, Color[] guess)
			throws WhiteColorException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a color in capital->");
		System.out.println("Possible Colors:" + Color.displayColorsToInput());
		String str = scanner.nextLine();
		try {
			guess[col] = Color.valueOf(str);
			if (Color.valueOf(str) == Color.WHITE) {
				throw new WhiteColorException();
			}
		} catch (IllegalArgumentException f) {
			System.err.println("Error in data entry ");
			inputColor(col, guess);
		}
	}
}
