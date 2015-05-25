package fr.iutvalence.jumax.mastermind.view.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Navigation extends JFrame
{

	public Navigation() {
		this.setTitle("Mastermind");
	    this.setSize(500, 500);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    	    
	    JLabel title=new JLabel("Mastermind");
	    title.setHorizontalAlignment(SwingConstants.CENTER);
	    title.setFont(new Font("MV Boli", Font.PLAIN, 45));
	    this.getContentPane().add(title, BorderLayout.NORTH);
	    
		JPanel menu= new JPanel();
		menu.setBorder(UIManager.getBorder("Button.border"));
		this.getContentPane().add(menu, BorderLayout.CENTER);
		menu.setLayout(null);
		
		JButton play = new JButton("PLAY");
		play.setBounds(66, 38, 364, 155);
		play.setFont(new Font("Shruti", Font.PLAIN, 24));
		
		menu.add(play);
		
		JButton scores = new JButton("SCORES");
		scores.setBounds(66, 213, 364, 155);
		scores.setFont(new Font("Shruti", Font.PLAIN, 24));
		
		menu.add(scores);
	
	    this.setVisible(true);
	    
	   
	}
}
