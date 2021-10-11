package com.project9;

import javax.swing.JFrame;

public class ClientTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Client application; // declare client application

	      // if no command line args
	      if (args.length == 0)
	         application = new Client("127.0.0.1"); // connect to localhost
	      else
	         application = new Client(args[0]); // use args to connect

		application.setSize(500,220);
		application.setVisible(true);
	    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    application.runClient(); // run client application

	}

}
