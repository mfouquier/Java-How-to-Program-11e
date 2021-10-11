package Exercise_2_16;
//Import the Scanner module from java.util
import java.util.Scanner;

public class ComparingIntegers {

	public static void main(String[] args) {
		//Create a new Scanner variable that takes input from the keyboard
		Scanner input = new Scanner(System.in);
		
		//Prints out text requesting input - takes input and saves as variable
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();
		
		/*Conditional statements that compare two numbers and prints text based 
		on what condition is met*/
		if (number1 > number2) {
			System.out.printf("%d%s%n", number1, " is larger.");
		}
		
		if (number2 > number1) {
			System.out.printf("%d%s%n", number2, " is larger." );
		}
		
		if (number1 == number2) {
			System.out.println("These numbers are equal.");
		}
	}

}
