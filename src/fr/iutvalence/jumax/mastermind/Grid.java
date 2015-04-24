package fr.iutvalence.jumax.mastermind;

/**
 * Grid of MasterMind.
 *
 * @author jumax
 * @version 1.0.0
 */
public class Grid {
    /** Grid's lines' number. */
    public static final int LINES_NB   = 10;
    /** Grid's columns' number. */
    public static final int COLUMNS_NB = 4;
    /** Table of colors. */
    private final Color[][] grid;

	/** Grid's constructor. */
    public Grid() {
        this.grid = new Color[LINES_NB][COLUMNS_NB];
        for (int lineNumber = 0; lineNumber < LINES_NB; lineNumber++) {
            for (int columnNumber = 0; columnNumber < COLUMNS_NB; columnNumber++) {
                this.grid[lineNumber][columnNumber] = Color.WHITE;
            }
        }
    }

    /** Get the grid. */
	public Color[][] getGrid()
	{
		return this.grid;
	}
	
    /**
     * Get a line of the grid.
     */
    public Color[] getLine(int linenb) {
        return this.grid[linenb];
    }

    
}
