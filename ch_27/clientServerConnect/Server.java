package com.project9;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Server extends JFrame {
	private JTextField enterField;
	private JPanel panel;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	private JLabel connectionStatus;
	File dir = new File("C:\\Users\\mfouq\\Desktop\\Florida Tech\\CIS 5200\\Project 9 Best");
	
	public Server() {
		super("Server");
		//Add display Area
		panel = new JPanel(null);
		connectionStatus = new JLabel("");
		connectionStatus.setBounds(80, 50, 165, 25);
		panel.add(connectionStatus);
		
		add(panel, BorderLayout.CENTER);
		
		setSize(300, 175);
		setVisible(true);
	}
	
	public void runServer() throws ClassNotFoundException {
		try 
		{	
			server = new ServerSocket(12345, 100);
			
			while(true) 
			{
				try 
				{
					waitForConnection();
					getStreams();
					processConnection();
				}
				catch(EOFException eofException) 
				{
					System.out.println("\nServer Terminated Connection.");
				}
				finally {
					closeConnection();
				}
			}
		}
			catch(IOException ioException) {
				ioException.printStackTrace();
			}
	}
	
	private void waitForConnection() throws IOException {
		connectionStatus.setText("Waiting for connection...");
		connection = server.accept();
		connectionStatus.setText("Connected to " + connection.getInetAddress().getHostName());
	}
	
	private void getStreams() throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		
		input = new ObjectInputStream(connection.getInputStream());
	}
	
	private void processConnection() throws IOException, ClassNotFoundException {
		int counter = 0;
		while(counter < 3) {
			try {
				authentication();
				if(authentication()) {
					output.flush();
					break;
				}
				else {
					counter++;
				}
			}catch(IOException io){
				io.printStackTrace();
			}
		}
		try {
			fileExists();
		}catch(IOException io){
			io.printStackTrace();
		}
	}

	private void closeConnection () {
		try {
			output.close(); // close output stream
			input.close(); // close input stream				
			connection.close(); // close socket
		} catch (IOException ioException) {
			ioException.printStackTrace();
			}
		}

		private void fileExists () throws IOException, ClassNotFoundException {
			String fileName = (String) input.readObject();
			File[] dir_contents = dir.listFiles();
				for (int i = 0; i < dir_contents.length; i++) {
					if (dir_contents[i].getName() == fileName ) {
						output.writeObject("File Exists");
						output.flush();
					} else {
						output.writeObject("File Not Found");
						output.flush();
					}
			}
		}

		private boolean authentication () throws IOException, ClassNotFoundException {
			String username = (String) input.readObject();
			String password = (String) input.readObject();
			String fileContents = username + ", " + password;

			Scanner scan = new Scanner(new FileInputStream("C:\\Users\\mfouq\\Desktop\\Florida Tech\\CIS 5200\\Project 9 Best\\Password File"));
			boolean flag = false;
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				if (line.indexOf(fileContents) != -1) {
					flag = true;
				}
			}
			if (flag) {
				output.writeObject("Login Successful. Username and Password are in the file");
				output.flush();
				return true;
			} else {
				output.writeObject("Login Failed. Username and Password not found in the file");
				output.flush();
			}
			return false;
		}
	}
