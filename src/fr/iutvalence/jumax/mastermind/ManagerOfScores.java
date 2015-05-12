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
	public void writeScore(int score, String player) {
		File file = new File("scores.txt");
		FileWriter fw;

		try {
			fw = new FileWriter(file, true);
			if (score != 0) {
				String str = player + "," + score + "/";
				fw.write(str);
				fw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Display scores in the console.
	 */
	public void displayScores() {

		StringBuilder secretFileName = new StringBuilder();
		secretFileName.append("scores.txt");
		try {
			BufferedReader entry = new BufferedReader(new FileReader(
					secretFileName.toString()));
			try {
				String readText = entry.readLine();

				if (readText != null) {
					StringTokenizer scoreString = new StringTokenizer(readText,
							"/");

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
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}