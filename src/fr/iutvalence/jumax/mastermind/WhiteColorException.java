package fr.iutvalence.jumax.mastermind;

/**
 * Exception when the input color is white.
 * 
 * @author jumax
 * @version 1.0.0
 */
public class WhiteColorException extends Exception
{
	public WhiteColorException() {
		System.out.println("You can't input the white color");
	}
}
