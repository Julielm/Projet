package fr.iutvalence.jumax.mastermind.view.gui;

import javax.swing.JFrame;

public class RunnableGame implements Runnable
{
	private JFrame frame;

	@Override
	public void run()
	{
		this.frame =new GameWindow();
		this.frame.setVisible(true);
		
	}
	
}
