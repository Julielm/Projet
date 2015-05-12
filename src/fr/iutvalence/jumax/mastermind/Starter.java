package fr.iutvalence.jumax.mastermind;

import java.util.Arrays;
import java.util.Scanner;

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
		ManagerOfScores scores = new ManagerOfScores();
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

			if (index == 1) {
				System.out.println("Input your name->");
				String str = scanner.nextLine();
				Player player = new Player(str);
				
				System.out.println("");
				System.out.println("What do you want to do ? ");
				System.out.println("1: Random Secret");
				System.out.println("2: Input a secret");
				System.out.println("3: Secret with the dictionary");
				index = scanner.nextInt();
				dummy = scanner.nextLine();
				Color[] secret = new GeneratorOfRandomSecrets().getSecret(Grid.COLUMNS_NB);

				if(index==2){
					secret = new GeneratorOfManualSecrets().getSecret(Grid.COLUMNS_NB);
					}
				if(index==3){
					secret = new GeneratorOfSecretsWithDictionary().getSecret(Grid.COLUMNS_NB);
				}	
				Game game = new Game(player, secret);
				scores.writeScore(game.start(), player.getName());
				System.out.println(Arrays.toString(secret));
			}
			if (index == 2) {
				System.out.println("------ Scores ------");
				scores.displayScores();
			}
		}

	}
}
