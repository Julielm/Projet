package fr.iutvalence.jumax.mastermind.view.cli;

import java.util.Scanner;

import fr.iutvalence.jumax.mastermind.model.Color;
import fr.iutvalence.jumax.mastermind.model.GeneratorOfSecrets;
import fr.iutvalence.jumax.mastermind.model.WhiteColorException;

/**
 * Generate a secret manually.
 * 
 * @author jumax
 * @version 1.0.0
 */
public class GeneratorOfManualSecrets implements GeneratorOfSecrets {
	@Override
	public Color[] getSecret(int size) {
		Scanner scanner = new Scanner(System.in);
		Color[] secret = new Color[size];
		System.out.println("Input the secret :");
		for (int col = 0; col < size; col++) {
			try {
				Game.inputColor(col, secret);
			} catch (WhiteColorException e) {
				System.out.println("You can't input the white color");
				col -= 1;
			}
		}
		return secret;
	}

}
