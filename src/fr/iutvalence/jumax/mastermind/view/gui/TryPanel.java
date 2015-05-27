package fr.iutvalence.jumax.mastermind.view.gui;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.plaf.SplitPaneUI;

public class TryPanel extends JPanel
{
	public TryPanel() {
		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new ResultPanel(), new Label());
		split.setDividerLocation(80);

		JSplitPane split2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, split, new GamePanel());
		split2.setDividerLocation(70);
		this.add(split2);
		
	}
}
