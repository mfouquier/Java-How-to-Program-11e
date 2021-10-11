package Exercise_2_28;
//Import the Scanner module from java.util
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		//Create a new Scanner variable that takes input from the keyboard
		Scanner input = new Scanner(System.in);
		
		//Prints out text requesting input - takes input and saves as variable
		System.out.print("Enter the radius of the circle as an interger: ");
		int radius = input.nextInt();
		
		//Variable for the value of Pi
		double pie = 3.14; 
		
		//variable to perform math operations to determine aspects of a circle
		double diameter = 2 * radius; 
		double circumference = 2 * (pie * radius);
		double area = pie * (radius * radius);
		
		//Prints out text along with the results of the math operations on the circle
		System.out.printf("%s%.2f%n%s%.2f%n%s%.2f%n", "The diameter is: ", diameter, "The circumference is: ", circumference,
				"The area is: ", area);

	}

}
