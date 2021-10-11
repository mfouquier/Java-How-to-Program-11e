package com.ch23_11;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

class Ball implements Runnable {
	public int x, y, diameter;
	public Color color;
	public int deltaX, deltaY;
	BouncingBallPanel panel;
	SecureRandom generator = new SecureRandom();

	
	public Ball(int x, int y, int diameter, Color color, int deltaX, int deltaY, BouncingBallPanel panel) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.color = color;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.panel = panel;
        
    }

	public void draw(Graphics g) {
         g.setColor(color);
         g.fillOval(x, y, diameter, diameter);
     }
	    
	public void move() {
		if (x > 400 || x < 0) {
	        deltaX *= -1;
	    }
	
	    if (y > 400 || y < 0 ) {
	        deltaY *= -1;
	    }
	
	    this.x += deltaX;
	    this.y += deltaY;
	
	}
	
	public void run() {  
	       while(true) {
	          for(Ball b : panel.balls)
	        	  b.move();        
	      try {
	        Thread.sleep(generator.nextInt(10 + generator.nextInt(100)));
	        } catch (InterruptedException e) {
	        	e.printStackTrace();
	        }
	     panel.repaint();
	       }
	}
	
/*	public void run() {  
	       while(true) {
	        move();        
	      try {
	        Thread.sleep(generator.nextInt(10 + generator.nextInt(100)));
	        } catch (InterruptedException e) {
	        	e.printStackTrace();
	        }
	     
	       }
	}*/
}

