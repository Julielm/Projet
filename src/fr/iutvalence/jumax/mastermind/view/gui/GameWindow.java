package fr.iutvalence.jumax.mastermind.view.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GameWindow extends JFrame
{
	private TriesPanel triesPanel;
	
	public GameWindow() {
		this.setTitle("Mastermind");
		this.setSize(800, 700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title=new JLabel("Mastermind");
	    title.setHorizontalAlignment(SwingConstants.CENTER);
	    title.setFont(new Font("MV Boli", Font.PLAIN, 40));
	    this.getContentPane().add(title, BorderLayout.NORTH);
	    
	    JPanel grids = new JPanel();
	    this.getContentPane().add(grids, BorderLayout.CENTER);
	    grids.setLayout(new BorderLayout(0, 0));
	    grids.add(new TriesPanel(), BorderLayout.CENTER);
//	    grids.add(new GameGrid(), BorderLayout.CENTER);
//	    grids.add(new ResultPanel(), BorderLayout.WEST);
	   
	    Box b1 = Box.createHorizontalBox();
	    JButton validate = new JButton("Validate the line");
	    b1.add(validate);
	   
	    Box b2 = Box.createHorizontalBox();
	    JButton initialize = new JButton("Initialize the line");
	    b2.add(initialize);
	    
	    Box b3 = Box.createVerticalBox();
	    b3.add(b1);
	    b3.add(b2);
	    this.getContentPane().add(b3, BorderLayout.EAST);
	    
	    this.setVisible(true);
	}
	
	public TriesPanel getTriesPanel() {
		return this.triesPanel;
	}
}
