package fr.iutvalence.jumax.mastermind.model;

import java.util.Random;

/**
 * Pawn's color.
 *
 * @author jumax
 * @version 1.0.0
 */
public enum Color {
	/** Green color. */
	GREEN("Gre"),
	/** Red color. */
	RED("Red"),
	/** Orange color. */
	ORANGE("Ora"),
	/** Purple color. */
	PURPLE("Pur"),
	/** Yellow color. */
	YELLOW("Yel"),
	/** Black color. */
	BLACK("Bla"),
	/** Gray color. */
	GRAY("Gra"),
	/** Blue color. */
	BLUE("Blu"),
	/** White color. */
	WHITE("Whi");
	/** Color's representation. */
	private final String representation;

	/**
	 * Color's constructor.
	 *
	 * @param repr
	 *            The representation of the chosen color.
	 */
	Color(String repr) {
		this.representation = repr;
	}

	@Override
	public String toString() {
		return this.representation;
	}

	/**
	 * Get a random color.
	 * 
	 * @return a random color
	 * @throws WhiteColorException
	 */
	public static Color getRandomColor() throws WhiteColorException {
		Random random = new Random();
		Color color = values()[random.nextInt(values().length)];
		if (color == WHITE) {
			throw new WhiteColorException();
		}
		return color;
	}

	/**
	 * Display all the possible colors to input.
	 * 
	 * @return the colors
	 */
	public static String displayColorsToInput() {
		StringBuilder str = new StringBuilder();
		for (Color color : values()) {
			if (color != WHITE) {
				str.append(" ");
				str.append(color.name());
			}
		}
		return str.toString();
	}
}
