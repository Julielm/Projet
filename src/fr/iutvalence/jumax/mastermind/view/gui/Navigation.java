package fr.iutvalence.jumax.mastermind.view.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Navigation extends JFrame
{
	private JPanel container= new JPanel();

	public Navigation() {
		this.setTitle("Mastermind");
	    this.setSize(500, 500);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    
	    container.setLayout(new BorderLayout());

	    JLabel title=new JLabel("Mastermind");
		JPanel menu= new JPanel();
	    container.add(title, BorderLayout.NORTH);
	    container.add(menu, BorderLayout.CENTER);
	    
	    JButton play = new JButton("Play");
	    JButton scores = new JButton("Scores");
	    menu.add(play);
	    menu.add(scores);
	    this.getContentPane().add(container);
	    this.setVisible(true);
	}
}
