package fr.iutvalence.jumax.mastermind;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Preparation of a new game.
 * 
 * @author jumax
 * @version 1.0.0
 */
public class Game {
	public static final int LOST_GAME = 0;
	/** Secret line of pawn's colors. */
	private final Color[] secret;
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
		this.secret = secret.clone();
		this.grid = new Grid();
		this.roundNb = Grid.LINES_NB;
	}

	/** Start a game. */
	public int start() {
		int lineNumber = 0;
		int goodColorGoodPlace = 0;
		while (lineNumber != this.roundNb
				&& goodColorGoodPlace != Grid.COLUMNS_NB) {
			System.out.println("Round " + (lineNumber+1) +":");
			Color[] guess = askLine();
			this.grid.submitLine(guess, lineNumber);
			System.out.println(Arrays.toString(guess));

			Color[] cloneSecret = this.secret.clone();
			goodColorGoodPlace = checkGoodColorGoodPlace(guess, cloneSecret);
			int goodColor = checkGoodColor(guess, cloneSecret);

			lineNumber++;
			System.out.println("You have " + goodColorGoodPlace
					+ " pawn(s) which have the good place.");
			System.out
					.println("You have "
							+ goodColor
							+ " pawn(s) which have the good color but the wrong place.");
		}
		if (goodColorGoodPlace == Grid.COLUMNS_NB) {
			System.out.println("Congratulations " + this.player.getName()
					+ " you won in " + lineNumber + " round(s) !!");
			return lineNumber;
		}
		System.out.println("Try again " + this.player.getName());
		return LOST_GAME;
	}

	/**
	 * Check which pawns have a good color and a good place.
	 * 
	 * @param guess
	 * @param cloneSecret
	 * @return the good color good place number
	 */
	private int checkGoodColorGoodPlace(Color[] guess, Color[] cloneSecret) {
		int goodColorGoodPlace = 0;
		int columnNumber = 0;
		while (columnNumber != Grid.COLUMNS_NB) {
			if (guess[columnNumber] == cloneSecret[columnNumber]) {
				goodColorGoodPlace++;
				cloneSecret[columnNumber] = Color.WHITE;
				guess[columnNumber] = null;
			}
			columnNumber++;
		}
		return goodColorGoodPlace;
	}

	/**
	 * Check which pawns have a good color but a wrong place.
	 * 
	 * @param guess
	 * @param cloneSecret
	 * @return the good color number
	 */
	private int checkGoodColor(Color[] guess, Color[] cloneSecret) {
		int goodColor = 0;
		int columnNumber = 0;
		while (columnNumber != Grid.COLUMNS_NB) {
			int columnSecretNumber = 0;
			while (columnSecretNumber != Grid.COLUMNS_NB
					&& guess[columnNumber] != cloneSecret[columnSecretNumber]) {
				columnSecretNumber++;
			}
			if (columnSecretNumber != Grid.COLUMNS_NB) {
				goodColor++;
				cloneSecret[columnSecretNumber] = Color.WHITE;
			}
			columnNumber++;
		}
		return goodColor;
	}

	/**
	 * Ask a line to the player.
	 * 
	 * @return
	 */
	private static Color[] askLine() {

		Color[] guess = new Color[Grid.COLUMNS_NB];
		for (int col = 0; col < Grid.COLUMNS_NB; col++) {
			try {
				inputColor(col, guess);
			} catch (WhiteColorException e) {
				System.out.println("You can't input the white color");
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
			System.out.println("Error in data entry ");
			inputColor(col, guess);
		}
	}
}
