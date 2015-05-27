package fr.iutvalence.jumax.mastermind.view.gui;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultPanel extends JPanel 
{
	public ResultPanel() {
		this.setLayout(new GridLayout(1, 4));
		for (int position=0; position<4; position++) {
			JLabel label = new JLabel();
			this.add(label);
		}
		
//		this.setBorder(BorderFactory.createEmptyBorder(0,20,0,50));
//		this.setLayout(new GridLayout(10,4));
//		for (int position=0; position<40; position++) {
//			JButton button = new JButton();
//			this.add(button);
//		}
	}
}
