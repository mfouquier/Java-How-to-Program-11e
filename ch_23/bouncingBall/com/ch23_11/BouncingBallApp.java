package com.ch23_11;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BouncingBallApp extends JFrame {
	
	public BouncingBallApp() {
		super("Bouncing Balls");
	}
	
	public static void main(String[] args) {
		BouncingBallApp app = new BouncingBallApp();
		BouncingBallPanel mainPanel = new BouncingBallPanel();
		app.add(mainPanel);
		app.addMouseListener(mainPanel);
		app.setSize(400,400);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
		Ball ball = new Ball(100, 100, 20, Color.BLUE, 5, 5, mainPanel);
		
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(ball);
		
		executor.shutdown();
	}
}