package fr.iutvalence.jumax.mastermind.view.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RunnableGame implements Runnable
{
	private JFrame frame;

	@Override
	public void run()
	{
		String name = JOptionPane.showInputDialog(null, "Input your name ", "Mastermind",JOptionPane.QUESTION_MESSAGE);
		if (name!=null) {
			this.frame =new GameWindow();
			this.frame.setVisible(true);
		}	
	}
	
}
