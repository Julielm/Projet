package fr.iutvalence.jumax.mastermind;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import fr.iutvalence.jumax.mastermind.model.Color;
import fr.iutvalence.jumax.mastermind.model.GeneratorOfRandomSecrets;
import fr.iutvalence.jumax.mastermind.model.GeneratorOfSecretsWithDictionary;
import fr.iutvalence.jumax.mastermind.model.Grid;
import fr.iutvalence.jumax.mastermind.model.HistoricOfScores;
import fr.iutvalence.jumax.mastermind.model.Player;
import fr.iutvalence.jumax.mastermind.view.cli.Game;
import fr.iutvalence.jumax.mastermind.view.cli.GeneratorOfManualSecrets;
import fr.iutvalence.jumax.mastermind.view.gui.GameWindow;
import fr.iutvalence.jumax.mastermind.view.gui.Navigation;

/**
 * Application of the game.
 *
 * @author jumax
 * @version 1.0.0
 */
public class Starter {
	/**
	 * Main method of the game.
	 * 
	 * @param args
	 *            (n/a)
	 */
	public static void main(String[] args) {
		Navigation navigation = new Navigation();
		GameWindow game = new GameWindow();
		
	}
	
	/**
	 * Start of the game in cli.
	 */
	private static void start() {
		File scores = new File("scores.txt");
		File secrets= new File("secret.txt");
		HistoricOfScores historicOfScores = new HistoricOfScores(scores);
		Scanner scanner = new Scanner(System.in);
		int index = 0;
		System.out.println("Welcome");

		while (index != 3) {
			System.out.println("");
			System.out.println("What do you want to do ? ");
			System.out.println("1: Play");
			System.out.println("2: Watch scores");
			System.out.println("3: Quit");
			index = scanner.nextInt();
			String dummy = scanner.nextLine();
				
			int indexTwo = 0;
			if (index == 1) {
				System.out.println("Input your name->");
				String str = scanner.nextLine();
				Player player = new Player(str);
					
				System.out.println("");
				System.out.println("What do you want to do ? ");
				System.out.println("1: Random Secret");
				System.out.println("2: Input a secret");
				System.out.println("3: Secret with the dictionary");
				indexTwo = scanner.nextInt();
				dummy = scanner.nextLine();
				Color[] secret = new GeneratorOfRandomSecrets().getSecret(Grid.COLUMNS_NB);

				if(indexTwo ==2){
					secret = new GeneratorOfManualSecrets().getSecret(Grid.COLUMNS_NB);
					}
				if(indexTwo ==3){
					try {
						secret = new GeneratorOfSecretsWithDictionary(secrets).getSecret(Grid.COLUMNS_NB);
					} catch (IOException e) {
						System.err.println("Error reading the dictionary");
					}
				}	
				Game game = new Game(player, secret);
				try {
					historicOfScores.writeScore(game.game(), player.getName());
				}
				catch (IOException e) {
					System.err.println("Error saving the score");
				}
				System.out.println(Arrays.toString(secret));
			}
			if (index == 2) {
				System.out.println("------ Scores ------");
				try {
					System.out.println(historicOfScores.displayScores());
				} catch (IOException e) {
					System.err.println("Error displaying score");
				}
			}
		}
	}
}