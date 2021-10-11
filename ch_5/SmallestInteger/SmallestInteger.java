package SmallestInteger;

import java.util.Scanner;

public class SmallestInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//create a new Scanner variable
		
		System.out.print("Enter 5 numbers. Input number: ");
		int x = input.nextInt();//assign input to x
		
		for(int i = 1; i <= 4; i++) {//increment i by 1 until it is <= 4
			System.out.print("Input number: ");//requests input
			int y = input.nextInt();//sets input to y
			
			if (y < x ) {//compares y to x 
				x = y;//if y is less than the current value of x it replaces it
			} 	
		}
		
		System.out.printf("Smallest Integer is: %d", x);//prints the lowest value

	}

}
