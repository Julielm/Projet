package fr.iutvalence.jumax.mastermind;

import java.util.Scanner;

/**
 * Generate a secret manually.
 * 
 * @author jumax
 * @version 1.0.0
 */
public class GeneratorOfManualSecrets extends GeneratorOfSecrets 
{
	@Override
	public Color[] getSecret(int size)
	{
		Scanner scanner = new Scanner(System.in);
		Color[] secret = new Color[size];
		for (int col = 0; col < size; col++) {
			System.out.println("Input a color for the secret ->");
			String str = scanner.nextLine();
			secret[col] = Color.valueOf(str);
		}
		return secret;
	}

}
