package fr.iutvalence.jumax.mastermind.view.gui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GameWindow extends JFrame
{
	public GameWindow() {
		this.setSize(800, 700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title=new JLabel("Mastermind");
	    title.setHorizontalAlignment(SwingConstants.CENTER);
	    title.setFont(new Font("MV Boli", Font.PLAIN, 40));
	    this.getContentPane().add(title, BorderLayout.NORTH);
	    
	    JPanel panel = new JPanel();
	    this.getContentPane().add(panel, BorderLayout.CENTER);
	    panel.setLayout(new BorderLayout(0, 0));
	    
	    JPanel lineCreation = new JPanel();
	    panel.add(lineCreation, BorderLayout.EAST);
	    
	    JButton validate = new JButton("Validate the line");
	    lineCreation.add(validate);
	    
	    JButton initialize = new JButton("Initialize the line");
	    lineCreation.add(initialize);
	    
	    this.setVisible(true);
	}
}
