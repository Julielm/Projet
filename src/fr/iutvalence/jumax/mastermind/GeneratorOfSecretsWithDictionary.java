package fr.iutvalence.jumax.mastermind;

import java.io.BufferedReader;
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
public class GeneratorOfSecretsWithDictionary extends GeneratorOfSecrets 
{
	@Override
	public Color[] getSecret(int size) {
		
		StringBuilder secretFileName = new StringBuilder();
		secretFileName.append("secret.txt");
		
		ArrayList<Color[]> secretsCollection = new ArrayList<Color[]>();
		
		try
		{
			BufferedReader entry = new BufferedReader(new FileReader(secretFileName.toString())) ;
			try
			{
				String readText = entry.readLine() ;
				
				
				if (readText != null)
				{
					StringTokenizer secretString = new StringTokenizer (readText, "/") ;
					
					int secretNumber = secretString.countTokens();
					
					
					for (int index = 0; index < secretNumber; index++)
					{
						Color[] currentSecret = new Color[Grid.COLUMNS_NB];
						StringTokenizer colorString = new StringTokenizer (secretString.nextToken(), ",") ;
						
						for (int position = 0; position < Grid.COLUMNS_NB; position++)
						{
							currentSecret[position]=Color.valueOf(colorString.nextToken());
						}
						secretsCollection.add(currentSecret);						
					}
				}		
			} catch (IOException e)
			{
				e.printStackTrace();
			}		
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Collections.shuffle(secretsCollection);
		return secretsCollection.get(0);
	}
	
}
