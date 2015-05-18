package fr.iutvalence.jumax.mastermind.model;

/**
 * Oracle to test the secret.
 * 
 * @author jumax
 * @version 1.0.0
 */
public class Oracle
{
	/** Secret line of pawn's colors. */
	private final Color[] secret;
	
	/**
	 * Constructor of an oracle. 
	 * @param secret
	 */
	public Oracle(Color[] secret) {
		this.secret=secret;
	}
	
	/**
	 * Check guess with the secret.
	 * 
	 * @param guess
	 * @return an array of answers 
	 * 			the first column gives the number of good color good place pawns
	 * 			the second column gives the number of good color pawns
	 */
	public int[] check(Color[] guess) {
		int[] answer = new int[2];
		Color[] cloneSecret=this.secret.clone();
		answer[0] = checkGoodColorGoodPlace(guess, cloneSecret);
		answer[1] = checkGoodColor(guess, cloneSecret);
		return answer;
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
	 * Getter for the secret.
	 * @return the secret
	 */
	public Color[] getSecret()
	{
		return this.secret;
	}

	
}
