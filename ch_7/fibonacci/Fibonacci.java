import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Request user input for the first method that returns integers
		System.out.print("Enter an integer between 3 and 47 for the Fibonacci Sequence: ");
		int x = input.nextInt();
		//Request user input for the second method that returns doubles
		System.out.print("Enter a number 3 and 1477 for the Fibonacci Sequence: ");
		int y = input.nextInt();
		
		//Call methods fiboInteger and fiboDouble with user input for argument
		fiboInteger(x);
		fiboDouble(y);
	}
	//Returns integer value - LARGEST VALUE THAT CAN BE RETURNED IS A SEQUENCE OF 47 - 1836311903
	public static void fiboInteger(int n) {
		int [] fibo = new int[n];//creates and Array of length n - user supplied integer
		fibo[0] = 0;//sets index 0 to 0
		fibo[1] = 1;//sets index 1 to 1
		
		for (int i = 2; i < fibo.length; i++) {//start at index 2 through length n
			fibo[i] = fibo[i - 2] + fibo[i - 1];//set index value of i to the sum of the preceeding two values
		}
		
		System.out.printf("  %d", fibo[n - 1]);//prints the last element of the array
		
		System.out.println();
	}
	//Returns double values - LARGEST VALUE THAT CAN BE RETURNED IS A SEQUENCE OF 1477 - 
	public static void fiboDouble(int n) {//
		double [] fibo = new double[n];
		fibo[0] = 0.0;
		fibo[1] = 1.0;
		
		for (int i = 2; i < fibo.length; i++) {//same as above method
			fibo[i] = fibo[i - 2] + fibo[i - 1];
		}
		
		System.out.printf("  %.1f", fibo[n - 1]);
		
/*LARGEST NUMBER BEFORE INFINITY IS RETURNED
 *1306989223763398700000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
 *0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
 *0000000000000000000000000000000000000000000000000000000000000000000000000000000000000.0
 */
	
	}
}
