package fr.iutvalence.jumax.mastermind;

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
            representation.append(lineToDisplay[columnNumber].toString() + " ");
            
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
    
    /** Get the grid. */
	public Grid getGrid()
	{
		return this.grid;
	}
	
	
	/** Start a game. */
	public void start()
	{
		int lineNumber=0;
		int columnSecretNumber=0;
		while(lineNumber!= Grid.LINES_NB && columnSecretNumber != Grid.COLUMNS_NB)
		{
			int columnNumber=0;
			while(columnNumber!=Grid.COLUMNS_NB)
				//TODO exception for colors not in Color.java and find a solution when we input a color not in capital.
					{
						System.out.println("Input a color ->");
						Scanner scanner = new Scanner(System.in);
						String str=scanner.nextLine();
						this.grid.getGrid()[lineNumber][columnNumber]=Color.valueOf(str);
						columnNumber++;				
					}
			System.out.println(this.displayLine(lineNumber));
			columnNumber=0;
			int goodColorGoodPlace=0;
			int goodColor=0;
			columnSecretNumber=0;
			while(columnNumber!=Grid.COLUMNS_NB)
			{
				if(this.grid.getGrid()[lineNumber][columnNumber]==this.secret[columnNumber])
				{
					goodColorGoodPlace++;
					columnNumber++;
					columnSecretNumber++;
				}
				else
				{
					//TODO test if the color is good but has a bad place.
					columnNumber++;
				}
			}
			lineNumber++;
			System.out.println("You have "+goodColorGoodPlace+" pawn(s) which have the good place.");
			System.out.println("You have "+goodColor+" pawn(s) which have the good color but the bad place.");
		}
		if(columnSecretNumber== Grid.COLUMNS_NB)
			System.out.println("Congratulations "+this.player.getName()+" you won !!");
		else
			System.out.println("Try again "+this.player.getName());

	}
	

}
