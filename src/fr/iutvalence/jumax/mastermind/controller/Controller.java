package fr.iutvalence.jumax.mastermind.controller;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

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
		
	}
	
}
