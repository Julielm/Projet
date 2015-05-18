package fr.iutvalence.jumax.mastermind.model;

import java.io.IOException;

/**
 * Generator of secrets.
 * 
 * @author jumax
 * @version 1.0.0
 */
public interface GeneratorOfSecrets {
	/**
	 * Get a secret.
	 * 
	 * @param size
	 * @return a secret
	 * @throws WhiteColorException
	 * @throws IOException 
	 */
	Color[] getSecret(int size) throws WhiteColorException, IOException;
}
