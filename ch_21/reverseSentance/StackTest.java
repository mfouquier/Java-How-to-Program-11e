package com.reverseSentance;
import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a line of text. ");
		String sentance = input.nextLine();
		//Split the sentence at the spaces
		String words[] = sentance.split(" ");
		//print out the sentence as individual words to show it split correctly
		System.out.printf("%n%s%n", "The words of the sentance split apart: ");
		for (String word : words)
			{System.out.println(word);}
		
		//create a new Stack object
		ReverseSentanceStack<String> stack = new ReverseSentanceStack();
		System.out.println();
		//iterate through the words array and add each word to the stack
		for (String word : words)
			stack.push(word);
		//print the stack - the sentence will be in reverse order
		stack.print();

	}

}
