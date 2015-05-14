package fr.iutvalence.jumax.mastermind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Generator of secrets with a dictionary (text file).
 * 
 * @author jumax
 * @version 1.0.0
 */
public class GeneratorOfSecretsWithDictionary extends GeneratorOfSecrets {
	
	/**
	 * File where the dictionary is.
	 */
	private final File dictionary;
	
	/**
	 * Constructor of a generator of secrets thanks to the dictionary put in parameter.
	 * @param dictionary
	 */
	public GeneratorOfSecretsWithDictionary(File dictionary) {
		super();
		this.dictionary=dictionary;
	}
	
	@Override
	public Color[] getSecret(int size) throws IOException {
		try (BufferedReader entry = new BufferedReader(new FileReader(this.dictionary))) {
			String readText = entry.readLine();
	
			ArrayList<Color[]> secretsCollection = new ArrayList<Color[]>();
			if (readText!=null) {
				String[] secretString = readText.split("/");
				for (int index=0; index < secretString.length; index++) {
					Color[] currentSecret = new Color[size];
					String[] color = secretString[index].split(",");
					for (int position=0; position < size; position++) {
						currentSecret[position] = Color.valueOf(color[position]);
					}
					secretsCollection.add(currentSecret);
				}		
			}	
			Collections.shuffle(secretsCollection);
			return secretsCollection.get(0);
		}
	}

}
