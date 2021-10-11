package com.reverseSentance;

import java.util.NoSuchElementException;

public class ReverseSentanceStack<E> {
	private List<E> stackList;
	
	//constructor
	public ReverseSentanceStack() {stackList = new List<E>("stack");}
	//add object to stack
	public void push(E object) {stackList.insertAtFront(object);}
	//remove object from stack
	public E pop(E object) throws NoSuchElementException {
		return stackList.removeFromFront();
	}
	//determine if stack is empty
	public boolean isEmpty() {return stackList.isEmpty();}
	//print stack contents
	public void print() {stackList.print();}
}
