package fr.iutvalence.jumax.mastermind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Management of the scores.
 * 
 * @author jumax
 * @version 1.0.0
 */
public class HistoricOfScores {
	/**
	 * File of the scores where historic is saved.
	 */
	private final File scoresFile;
	
	/**
	 * Constructor of the historic.
	 * @param nameOfFile
	 */
	public HistoricOfScores(File nameOfFile)
	{
		this.scoresFile=nameOfFile;
	}
	/**
	 * Add a score in the scores' file.
	 * 
	 * @param score
	 * @param player
	 */
	public void writeScore(int score, String player) throws IOException {
		try (FileWriter fw = new FileWriter(this.scoresFile, true)) {
			if (score != 0) {
				fw.write(String.format("%s,%d/", player, score));
			}
		}
	}

	/**
	 * Display scores in the console.
	 */
	public void displayScores() throws IOException {
		try (BufferedReader entry = new BufferedReader(new FileReader(this.scoresFile))) {
				String readText = entry.readLine();
				
				if (readText != null) {
					String[] scoreString = readText.split("/");
					for (int index = 0; index < scoreString.length; index++) {
						String[] string = scoreString[index].split(",");
						StringBuilder str = new StringBuilder();
						str.append(string[0]);
						str.append(" : ");
						str.append(string[1]);
						str.append(" rounds.");
						System.out.println(str);						
					}
				}
			}
		}
}