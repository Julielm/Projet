package fr.iutvalence.jumax.mastermind.view.gui;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.plaf.SplitPaneUI;

public class TryPanel extends JPanel
{
	private ResultPanel resultPanel;
	private GamePanel gamePanel;
	public TryPanel() {
		this.resultPanel=new ResultPanel();
		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, this.resultPanel, new Label());
		split.setDividerLocation(80);
		this.gamePanel=new GamePanel();
		JSplitPane split2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, split, this.gamePanel);
		split2.setDividerLocation(70);
		this.add(split2);
	}
	
	public ResultPanel getResultPanel() {
		return this.resultPanel;
	}
	
	public GamePanel getGamePanel() {
		return this.gamePanel;
	}
}
