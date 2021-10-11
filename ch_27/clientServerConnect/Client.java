package com.project9;

import java.awt.*;
import java.awt.event.*;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.*;

public class Client extends JFrame implements ActionListener, KeyListener {
	private JTextField usernameText, fileNameText;
	private JPasswordField passwordText;
	private JLabel userLabel, passLabel, fileLabel, loginMessage;
	private JPanel panel;
	private JButton login;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String username = null;
	private String password = null;
	private String file= null;
	private String chatServer;
	private Socket client;
	
	
	public Client(String host) {
		super("Client");
		
		chatServer = host;
//Create all the Text boxes, Labels, and Button
		usernameText = new JTextField(20);
		usernameText.setBounds(100, 20, 165, 25);
		passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 50, 165, 25);
		fileNameText = new JTextField(20);
		fileNameText.setBounds(100, 80, 165, 25);
		fileNameText.setEditable(false);
		userLabel = new JLabel("Username");
		userLabel.setBounds(10, 20, 80, 25);
		passLabel = new JLabel("Password");
		passLabel.setBounds(10, 50, 80, 25);
		fileLabel = new JLabel("File Name");
		fileLabel.setBounds(10, 80, 80, 25);
		login = new JButton("Login");
		login.setBounds(100, 110, 80, 25);
		loginMessage = new JLabel("");
		loginMessage.setBounds(10, 140, 500, 25);
//Add all Text boxes, Labels, and Button to the Panel		
		panel = new JPanel(null);
		panel.add(userLabel);
		panel.add(usernameText);
		usernameText.addKeyListener(this);
		panel.add(passLabel);
		panel.add(passwordText);
		passwordText.addKeyListener(this);
		panel.add(fileLabel);
		panel.add(fileNameText);
		fileNameText.addKeyListener(this);
		panel.add(login);
		login.addActionListener(this);
		panel.add(loginMessage);
		add(panel);//add panel to Frame
	}

	public void actionPerformed(ActionEvent event){
		try {
			if (event.getSource() == login)
				this.checkFields();
		}catch(IOException io){
			io.printStackTrace();
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyPressed(KeyEvent e) {
		try {
			if (e.getKeyCode() == KeyEvent.VK_ENTER)
				checkFields();
		}catch(IOException io) {
			io.printStackTrace();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {}

	private void checkFields() throws IOException{
		username = usernameText.getText();
		password = new String(passwordText.getPassword());

		if((username == null) || (username.equals(""))) {
			loginMessage.setText("Enter a Username");
			return;
		}
		else if((password == null) || (password.equals(""))) {
			loginMessage.setText("Enter Password");
			return;
		}
		else{
			//loginMessage.setText(username + password);
			output.writeObject(username);
			output.writeObject(password);
			output.flush(); 
		}
	}

	
	public void runClient() throws ClassNotFoundException {
		try // connect to server, get streams, process connection
	      {
	         connectToServer(); // create a Socket to make connection
	         getStreams(); // get the input and output streams
	         processConnection(); // process connection
	      }
	      catch (EOFException eofException)
	      {
	        loginMessage.setText("\nClient terminated connection");
	      }
	      catch (IOException ioException)
	      {
	         ioException.printStackTrace();
	      }
	      finally
	      {
	         closeConnection(); // close connection
	      }
	   }

	   // connect to server
	   private void connectToServer() throws IOException
	   {
	      loginMessage.setText("Attempting connection\n");
	      // create Socket to make connection to server
	      client = new Socket(InetAddress.getByName(chatServer), 12345);
	   }

	   // get streams to send and receive data
	   private void getStreams() throws IOException
	   {
	      // set up output stream for objects
	      output = new ObjectOutputStream(client.getOutputStream());
	      output.flush(); // flush output buffer to send header information

	      // set up input stream for objects
	      input = new ObjectInputStream(client.getInputStream());
	   }

	   // process connection with server
	   private void processConnection() throws IOException, ClassNotFoundException
	   {	
		   int counter = 0;
		   while(counter < 3) {
			   	try {
					checkFields();
					loginMessage.setText((String) input.readObject());
					if(loginMessage.getText().contains("Successful")) {
						setTextFieldEditable(true);
						break;
					}
					else
						counter++;
				}catch(IOException io){
			   		io.printStackTrace();
				}
		   }
		   try {
			   sendFile();
			   loginMessage.setText((String) input.readObject());
		   }catch(IOException io) {
			   io.printStackTrace();
		   }
	   }
	   // close streams and socket
	   private void closeConnection()
	   {
	      try
	      {
	         output.close(); // close output stream
	         input.close(); // close input stream
	         client.close(); // close socket
	      }
	      catch (IOException ioException)
	      {
	         ioException.printStackTrace();
	      }
	   }
	   
	   private void sendFile() throws IOException {
		   output.writeObject(fileNameText.getText());
		   output.flush();
	   }
	   
	   private void setTextFieldEditable(final boolean editable) 
	   {
	      SwingUtilities.invokeLater(
	         new Runnable() 
	         {
	            public void run() // sets enterField's editability
	            {
	               fileNameText.setEditable(editable);
	            }
	         } 
	      ); 
	   } 
}
