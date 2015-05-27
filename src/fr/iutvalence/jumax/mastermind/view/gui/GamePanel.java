package fr.iutvalence.jumax.mastermind.view.gui;


import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import fr.iutvalence.jumax.mastermind.controller.Controller;

public class GamePanel extends JPanel
{
	/**
	 * Serial ID for the game panel.
	 */
	private static final long serialVersionUID = 1L;

	public GamePanel() {
		this.setLayout(new GridLayout(1, 4));
		for (int position=0; position<4; position++) {
			JButton button = new JButton();
			button.addActionListener(new ColorListener());
			this.add(button);
		}
	}
	
}
