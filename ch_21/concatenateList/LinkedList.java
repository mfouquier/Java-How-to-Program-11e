package com.concatenateList;

public class LinkedList {
	private class Node {//creates the node 
		private char data;
		private Node next;
		
		public Node(char data) {//Node constructor
			this.data = data;
			next = null;
		}
	}
	
	Node first;//creates a node first to start at the beginning
	Node last;//creates a node last to start at the end
	
	public void addLast(char item) {
		Node newNode = new Node(item);//new node object
		if(isEmpty()) 
			first = last = newNode;//if list is empty the new node is entered and is the first and last
		else {
			last.next = newNode;//add the new node after the last node
			last = newNode;//sets the last node equal to the new node
		}
	}

	public static void concatenate(Node list1, Node list2) {//combines list 1 and 2 into list 1
		Node start = list1;
		Node second = list2;
		Node previous = null;
		
		while(start != null) {
			previous = start;
			start = start.next;
		}
		previous.next = second;
	}
	
	private boolean isEmpty() {return first == null;}
	
	public void print() {
		if (isEmpty()) {
	         System.out.printf("Empty List%n");
	         return;
	      } 
		Node current = first;//set node current to the first position
		
			while(current != null) {//while current is not null - traverse the list
				System.out.printf("%s ", current.data);//prints the data in the current list
		        current = current.next;//sets current to the next index in the list - traverse the list
		}
			System.out.println();
	}
}
