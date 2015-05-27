package fr.iutvalence.jumax.mastermind.view.gui;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.JFrame;

import fr.iutvalence.jumax.mastermind.controller.Controller;

public class ActionLaunch extends AbstractAction
{
	private JFrame frame;
	private Controller controller;
	
	public ActionLaunch(Navigation navigation, Controller controller)
	{
		this.frame=navigation;
		this.controller=controller;
		this.frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		this.controller.initGame();
		this.frame.dispose();
		
	}

	
}
