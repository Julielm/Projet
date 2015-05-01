package fr.iutvalence.jumax.mastermind;

/**
 * Generator of random secrets.
 * 
 * @author jumax
 * @version 1.0.0
 */
public class GeneratorOfRandomSecrets extends GeneratorOfSecrets 
{
	@Override
	public Color[] getSecret(int size)
	{
		Color[] secret = new Color[size];
		for (int position=0; position < size; position++) {
			secret[position]=Color.getRandomColor();
		}
		return secret;
	}
}
