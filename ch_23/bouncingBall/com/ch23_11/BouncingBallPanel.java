package com.ch23_11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

import com.sun.tools.javac.Main;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.LinkedList;
import java.security.*;



public class BouncingBallPanel extends JPanel implements MouseListener {
	private int ballCount = 0;
	//public Ball [] balls = new Ball [20];
	public List<Ball> balls = new LinkedList<Ball>();
	SecureRandom generator = new SecureRandom();
	public BouncingBallPanel mainPanel;

	@Override
	public void mouseClicked(MouseEvent e) { 
		Ball ball = new Ball(
				e.getX(), 
				e.getY(),
				10 + generator.nextInt(40),
				new Color (generator.nextInt(256), generator.nextInt(256), generator.nextInt(256)),
				generator.nextInt(10) - 5,
				generator.nextInt(10) - 5,
				this.mainPanel
				);
			balls.add(ball);
		 	++ballCount;
		 				
/*			ExecutorService executor = Executors.newCachedThreadPool();
			executor.execute(ball);
				
			executor.shutdown();*/
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);	
		for (Ball b : balls) 
			b.draw(g);
	}
	
	
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {}
	@Override
	public void mouseReleased(MouseEvent arg0) {}
}	
	
	

