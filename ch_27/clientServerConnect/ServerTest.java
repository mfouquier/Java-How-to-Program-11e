package com.project9;

import javax.swing.JFrame;

public class ServerTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Server application = new Server(); // create server
		
	    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    application.runServer(); // run server application

	}
}
