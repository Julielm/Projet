package fr.iutvalence.jumax.mastermind;

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
     * @param repr The representation of the chosen color.
     */
    Color(String repr) {
        this.representation = repr;
    }

    @Override
    public String toString() {
        return this.representation;
    }
}
