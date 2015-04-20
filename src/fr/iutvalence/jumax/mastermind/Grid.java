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
    	grid = new Color[LINES_NB][COLUMNS_NB];
    }
    /** Get a line of the grid. */
    public Color[] getLine(int linenb)
    {
    	Color[] line= new Color[COLUMNS_NB];
    	for (int columnNb=0;columnNb<COLUMNS_NB;columnNb++)
    	{
    		line[columnNb]=this.grid[linenb][columnNb];
    	}
    	return line;

        // TODO Why not simply: "return grid[linenb];"
    }
}
