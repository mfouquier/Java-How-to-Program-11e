package com.sortedList;
import java.security.SecureRandom;
import java.util.Arrays;

public class SortedListTest {

	public static void main(String[] args) {
	SecureRandom randomNumbers = new SecureRandom();
	SortedList list1 = new SortedList();
	
	for(int i = 0; i < 26; i++) {
		int fill = randomNumbers.nextInt(100);
		list1.insertSort(fill);
	}
	
	list1.print();
	
	}

}
