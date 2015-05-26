package fr.iutvalence.jumax.mastermind.view.gui;


import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GameGrid extends JPanel
{
	public GameGrid() {
		this.setBorder(BorderFactory.createEmptyBorder(0,20,0,70));
		this.setLayout(new GridLayout(10,4));
		for (int position=0; position<40; position++) {
			JButton button = new JButton();
			this.add(button);
		}
	}
	
}
