package com.ch27_11;
import java.awt.*;
import javax.swing.*;


public class GridFiveTest {

	public static void main(String[] args) {

		//Create a new frame for the 5x5 grid and set closing action
		JFrame grid = new JFrame("Drawing 5x5 grid");
		grid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create GridFive object
		GridFive panel = new GridFive();
		
		panel.setBackground(Color.WHITE);//Set background color
		grid.add(panel);//add gridFive panel to the frame
		grid.setSize(400, 430);//set size of the panel
		grid.setVisible(true);//make it visible

	}
}
