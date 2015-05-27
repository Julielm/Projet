package fr.iutvalence.jumax.mastermind.view.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultPanel extends JPanel 
{
	private JLabel[] labels;
	
	public ResultPanel() {
		this.labels = new JLabel[4];
		this.setLayout(new GridLayout(1, 4));
		for (int position=0; position<4; position++) {
			JLabel label = new JLabel();
			this.labels[position]=label;
			this.add(label);
		}
	}
	
	public void updateResult(int goodColorGoodPlace, int goodColor) {
		for(int position=0; position<goodColorGoodPlace; position++){
			this.labels[position].setBackground(Color.RED);
		}
		int position=goodColorGoodPlace;
		while(position<goodColorGoodPlace+goodColor) {
			this.labels[position].setBackground(Color.WHITE);
			position++;
		}
	}
}
