package com.concatenateList;

public class ConcatenateTest {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
	
		list1.addLast('a');
		list1.addLast('b');
		list1.addLast('c');
		list1.addLast('d');
		
		list1.print();
		
		list2.addLast('w');
		list2.addLast('x');
		list2.addLast('y');
		list2.addLast('z');
		list2.print();
		
		list1.concatenate(list1.first, list2.first);
		
		list1.print();
	}

}
