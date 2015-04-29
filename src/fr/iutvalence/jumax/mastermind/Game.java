package fr.iutvalence.jumax.mastermind;

import java.util.Arrays;
import java.util.Scanner;

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
		this.secret = secret.clone();
		this.grid = new Grid();
		this.roundNb = DEFAULT_ROUND_NB;
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
		int lineNumber=0;
		int goodColorGoodPlace=0;
		while(lineNumber!= this.roundNb && goodColorGoodPlace != Grid.COLUMNS_NB)
		{
			Color[] guess = askLine();
			this.grid.submitLine(guess, lineNumber);
			System.out.println(Arrays.toString(guess));
			
			Color[] cloneSecret=this.secret.clone();
			goodColorGoodPlace=checkGoodColorGoodPlace(guess, cloneSecret);
			int goodColor = checkGoodColor(guess, cloneSecret);
			
			lineNumber++;
			System.out.println("You have "+goodColorGoodPlace+" pawn(s) which have the good place.");
			System.out.println("You have "+goodColor+" pawn(s) which have the good color but the bad place.");
		}
		if(goodColorGoodPlace== Grid.COLUMNS_NB)
			System.out.println("Congratulations "+this.player.getName()+" you won in "+lineNumber+" round(s) !!");
		else
			System.out.println("Try again "+this.player.getName());
	}
	

	private int checkGoodColorGoodPlace(Color[] guess, Color[] cloneSecret) {
		int goodColorGoodPlace=0;		
		int columnNumber=0;
		while(columnNumber!=Grid.COLUMNS_NB) {
			if(guess[columnNumber]==cloneSecret[columnNumber]) {
				goodColorGoodPlace++;
				cloneSecret[columnNumber]=Color.WHITE;
				guess[columnNumber]=null;
			}
			columnNumber++;
		}
		return goodColorGoodPlace;
	}

	private int checkGoodColor(Color[] guess, Color[] cloneSecret) {
		int goodColor=0;
		int columnNumber=0;
		while(columnNumber !=Grid.COLUMNS_NB) {
				int columnSecretNumber=0;
				while(columnSecretNumber!=Grid.COLUMNS_NB && guess[columnNumber]!=cloneSecret[columnSecretNumber]) {
					columnSecretNumber++;
				}
				if (columnSecretNumber!=Grid.COLUMNS_NB) {
					goodColor++;
					cloneSecret[columnSecretNumber]=Color.WHITE;
				}
				columnNumber++;		
		}
		return goodColor;
	}
	
	private static Color[] askLine() {
		Scanner scanner = new Scanner(System.in);
		Color[] guess = new Color[Grid.COLUMNS_NB];
		for (int col = 0; col < Grid.COLUMNS_NB; col++) {
			System.out.println("Input a color ->");
			String str = scanner.nextLine();
			guess[col] = Color.valueOf(str);
		}
		return guess;
	}
}
