package fr.iutvalence.jumax.mastermind.view.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;

public class ColorListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (((JButton) e.getSource()).getBackground()==Color.BLACK)
			((JButton) e.getSource()).setBackground(Color.BLUE);
		else {
			if (((JButton) e.getSource()).getBackground()==Color.BLUE)
				((JButton) e.getSource()).setBackground(Color.GRAY);
			else {
				if (((JButton) e.getSource()).getBackground()==Color.GRAY)
					((JButton) e.getSource()).setBackground(Color.GREEN);
				else {
					if (((JButton) e.getSource()).getBackground()==Color.GREEN)
						((JButton) e.getSource()).setBackground(Color.ORANGE);
					else {
						if (((JButton) e.getSource()).getBackground()==Color.ORANGE)
							((JButton) e.getSource()).setBackground(Color.PINK);
						else {
							if (((JButton) e.getSource()).getBackground()==Color.PINK)
								((JButton) e.getSource()).setBackground(Color.RED);
							else {
								if (((JButton) e.getSource()).getBackground()==Color.RED)
									((JButton) e.getSource()).setBackground(Color.YELLOW);
								else 
									((JButton) e.getSource()).setBackground(Color.BLACK);				
							}
						}
					}
				}
			}
		}
		
	}


}
