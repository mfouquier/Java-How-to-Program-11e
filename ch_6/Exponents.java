import java.util.Scanner;

public class Exponents {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);//creates Scanner variable
			System.out.print("Enter a base non-zero integer: ");
			int base = input.nextInt();//assigns input to variable base
			
			System.out.print("Enter a non-zero exponent integer: ");
			int exponent = input.nextInt();//assigns input to variable exponent
	
			//Power will call method integerPower with the parameters from user input
			int power = integerPower(base, exponent); 
			//Prints out the value returned from method integerPower
			System.out.printf("%d to the power of %d is: %d", base, exponent, power);
		}
		//Method to take user input and raise the integer by the power entered
		public static int integerPower(int base, int exponent) {
			//variable to store the result 
			int powerResult = 1; 
			/*For loop will multiply the base by itself as many times as exponent 
			 *dictates resulting in raising the base exponentially*/
			for (int i=1; i<= exponent; i++)
				powerResult *= base;
	        	return powerResult;   
			}
	}
