package Exercise_2_15;
//Import the Scanner module from java.util
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		//Create a new Scanner variable that takes input from the keyboard
		Scanner input = new Scanner(System.in);
		
		//Prints out text requesting input - takes input and saves as variable
		System.out.print("Enter the first integer: ");
		int number1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		int number2 = input.nextInt();
		
		//Takes the variables from user input and performs arithmetic operations
		int sum = number1 + number2;
		int product = number1 * number2;
		int difference =  number1 - number2;
		int quotient = number1 / number2;
		
		//Prints out text along with the results of the arithmetic operations
		System.out.printf("%s%d%n%s%d%n%s%d%n%s%d%n", "The sum is: ", sum,  "The product is: ", product, "The difference is: ",
				difference, "The quotient is: ", quotient);
	}

}
