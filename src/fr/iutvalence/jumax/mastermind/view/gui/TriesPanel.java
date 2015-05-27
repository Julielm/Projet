package fr.iutvalence.jumax.mastermind.view.gui;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class TriesPanel extends JPanel
{
	private TryPanel[] triesPanel;
	
	public TriesPanel() {
		this.triesPanel = new TryPanel[10];
		this.setLayout(new GridLayout(10, 1));
		for (int line=0; line<10; line++) {
			TryPanel panel = new TryPanel();
			triesPanel[line]=panel;
			this.add(panel);
		}
	}
	
	public TryPanel[] getTriesPanel() {
		return this.triesPanel;
	}
}
