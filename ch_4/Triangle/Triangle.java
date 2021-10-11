package Triangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the first side of the triangle - a: ");//Prompt
		int a = input.nextInt(); 
		System.out.print("Input the second side of the triangle - b: ");//Prompt
		int b = input.nextInt();
		System.out.print("Input the third side of the triangle - c: ");//Prompt
		int c = input.nextInt();
		
		if (a > 0 && b > 0 && c > 0) {
			System.out.print("These numbers could represent a triangle!");
		}
		else {
			System.out.print("These numbers could NOT represent a triangle. Enter a value"
					+ " greter than 0. \n\t Basic rules: \n"
					+ "\t a + b > c \n"
					+ "\t b + c > a \n"
					+ "\t a + c > b");
		}
		

	}

}
