package com.sortedList;
import java.util.NoSuchElementException;


public class SortedList<E extends Comparable<E>> {
	class Node<E>{
		 E data;
		 Node<E> next;
		
		Node(E object){this(object, null);}
		
		Node(E object, Node<E> node){
			data = object;
			next = node;
		}
		E getData() {return data;}
		Node<E> getNext() {return next;}
	}
	
	private Node<E> first;
	private Node<E> last;
	private String name;
	
	
	public SortedList(){this("list");}
	
	public SortedList(String listName) {
		name = listName;
		first = last = null;
	}
	//Add data to the front of the list
	public void addFront(E item) {
		Node<E> node = new Node<E>(item, first);
		if(isEmpty())
			first = last = node;//it would be the first node so it would be first and last
		else {
			first = node;//creates a new node and puts it in the 1st position
		}
	}
	//Add data to the end of the list
	public void addBack(E data) {
		Node<E> node = new Node<E>(data);
		if(isEmpty())
			first = last = node;
		else {
			last = last.next = node;//the last node's next node will be the new node - at the end
		}
	}
	
	//Remove node from the front
	public E removeFront() throws NoSuchElementException {
		if(isEmpty())
			throw new NoSuchElementException(name + " is Empty.");
		
		E removedItem = first.data;//var to hold the first node's data
		if(first == last)
			first = last = null;//set to null if first and last are the same - one item in list
		else {
			first = first.next;//the new first node will be the old first's next node
		}
		return removedItem;//return the data that was removed
	}
	
	//Remove node from the back
	public E removeBack() throws NoSuchElementException {
		if (isEmpty())
			throw new NoSuchElementException(name + " is Empty.");
		
		E removedItem = last.data;
		
		if (first == last)
			first = last = null;
		else {
	//create a node to traverse the list to find the second to last node
			Node<E> current = first;
	//while loop will find the second to last node and set Node current to that node
			while(current.next != last) {
				current = current.next;
			}
	//the second to last node is set to be the last node and the next node is set to Null
			last = current;
			current.next = null;
		}
		return removedItem;
	}
	
	public void insertSort(E item) {
		Node<E> node = new Node<E>(item);
		if(isEmpty())
			first = last = node;
		if(item.compareTo(first.data) < 0) {
			first = first.next;
			first = new Node<E>(item,first);
		}
		else if (item.compareTo(last.data) >= 0) {
				last = last.next = new Node<E>(item);
			}
		else {
			Node<E> current = first;
			Node<E> previous = null;
			
			while(current != null && current.data.compareTo(item) < 0) {
				previous = current;
				current = current.next;
			}
			previous.next = new Node<E>(item, current);
		}
		
	}
	
	//determine if the list is empty
	private boolean isEmpty() {return first == null;}
	
	//Print method to traverse list and print the contents
	public void print() {
		if(isEmpty()) {
			System.out.printf("%s is Empty%n", name);
			return;
		}
		System.out.printf("%s: %n", name);
		Node<E> current = first;//node to traverse the list
		
		while(current != null) {
			System.out.printf("%d ", current.data);
			current = current.next;
		}
		System.out.println();
	}
}
