package fr.iutvalence.jumax.mastermind.model;


/**
 * Generator of random secrets.
 * 
 * @author jumax
 * @version 1.0.0
 */
public class GeneratorOfRandomSecrets implements GeneratorOfSecrets {
	@Override
	public Color[] getSecret(int size) {
		Color[] secret = new Color[size];
		for (int position = 0; position < size; position++) {
			try {
				secret[position] = Color.getRandomColor();
			} catch (WhiteColorException e) {
				position -= 1;
			}
		}
		return secret;
	}
}
