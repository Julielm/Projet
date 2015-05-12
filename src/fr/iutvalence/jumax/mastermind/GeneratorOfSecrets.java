package fr.iutvalence.jumax.mastermind;

/**
 * Generator of secrets.
 * 
 * @author jumax
 * @version 1.0.0
 */
public abstract class GeneratorOfSecrets {
	/**
	 * Get a secret.
	 * 
	 * @param size
	 * @return a secret
	 * @throws WhiteColorException
	 */
	public abstract Color[] getSecret(int size) throws WhiteColorException;
}
