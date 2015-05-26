package fr.iutvalence.jumax.mastermind.view.gui;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GuessGrid extends JPanel 
{
	public GuessGrid() {
		this.setBorder(BorderFactory.createEmptyBorder(0,20,0,50));
		this.setLayout(new GridLayout(10,4));
		for (int position=0; position<40; position++) {
			JButton button = new JButton();
			this.add(button);
		}
	}
}
