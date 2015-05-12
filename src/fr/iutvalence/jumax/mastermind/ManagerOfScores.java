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
public class ManagerOfScores {

	/**
	 * Add a score in the scores' file.
	 * 
	 * @param score
	 * @param player
	 */
	public void writeScore(int score, String player) throws IOException {
		File file = new File("scores.txt");
		try (FileWriter fw = new FileWriter(file, true)) {
			if (score != 0) {
				fw.write(String.format("%s,%d/", player, score));
			}
		}
	}

	/**
	 * Display scores in the console.
	 */
	public void displayScores() throws IOException {
		StringBuilder secretFileName = new StringBuilder("scores.txt");

		File file = new File("scores.txt");
		try (BufferedReader entry = new BufferedReader(new FileReader(file))) {
				String readText = entry.readLine();

				if (readText != null) {
					// TODO readText.split()
					StringTokenizer scoreString = new StringTokenizer(readText, "/");

					int scoresNumber = scoreString.countTokens();

					for (int index = 0; index < scoresNumber; index++) {
						StringBuilder str = new StringBuilder();
						StringTokenizer string = new StringTokenizer(
								scoreString.nextToken(), ",");
						str.append(string.nextToken());
						str.append(" : ");
						str.append(string.nextToken());
						str.append(" rounds.");
						System.out.println(str);
					}
				}
			}
		}
}