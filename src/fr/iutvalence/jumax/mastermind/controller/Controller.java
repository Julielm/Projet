package fr.iutvalence.jumax.mastermind.controller;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.iutvalence.jumax.mastermind.model.Color;
import fr.iutvalence.jumax.mastermind.model.GeneratorOfRandomSecrets;
import fr.iutvalence.jumax.mastermind.model.Grid;
import fr.iutvalence.jumax.mastermind.model.Oracle;
import fr.iutvalence.jumax.mastermind.view.gui.Navigation;
import fr.iutvalence.jumax.mastermind.view.gui.RunnableGame;

public class Controller
{
	public Controller() {
		JFrame menu = new Navigation(this);
	}

	public void initGame()
	{
		SwingUtilities.invokeLater(new RunnableGame());
		Color[] secret = new GeneratorOfRandomSecrets().getSecret(Grid.COLUMNS_NB);
		Oracle oracle = new Oracle(secret.clone());
		Grid grid = new Grid();
	
		
	}
	
}
