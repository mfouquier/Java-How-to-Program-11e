package com.ch27_11;

import java.awt.*;
import javax.swing.*;

public class GridFive extends JPanel {
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		
		g.setColor(Color.GREEN);
		//create the outer box
		g.drawLine(5, 30, 380, 30);
		g.drawLine(5, 30, 5, 380);
		g.drawLine(380, 30, 380, 380);
		g.drawLine(5, 380, 380, 380);
		
		//create the horizontal grid lines
		g.drawLine(5, 100, 380, 100);
		g.drawLine(5, 170, 380, 170);
		g.drawLine(5, 240, 380, 240);
		g.drawLine(5, 310, 380, 310);
		
		
		//create the vertical grid lines
		g.drawLine(80, 30, 80, 380);
		g.drawLine(155, 30, 155, 380);
		g.drawLine(230, 30, 230, 380);
		g.drawLine(305, 30, 305, 380);
		
	}
}
