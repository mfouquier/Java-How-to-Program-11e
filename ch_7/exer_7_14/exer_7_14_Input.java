import java.util.ArrayList;
import java.util.Scanner;
/*I am turning this in in case you had time to look at it for errors.
 * When I run it in command line using - java exer_7_14 it runs successfully every time I run the command.
 * In the Eclipse console it will run successfully the first time.
 * If I attempt to run again the console will not exit with ctrl-Z
 * However if I save the workspace and run it again it works.  
 * StackOverflow indicated it may be an issue with Scanner reaching EOF and not being able to run again.
 */
public class exer_7_14_Input {

	public static void main(String[] args) {
		//Calls method product
		product();
	}
	
	public static void product() {
		//Create ArrayList to hold user input - no set length 
		ArrayList<Integer> nums = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers - press <Ctrl> Z to quit");
		//while loop will add user input integers to ArrayList nums until the Ctrl-Z is pressed
		while(input.hasNext()) {
			nums.add(input.nextInt());
		}
		//Set variable total to 1
		int total = 1;
		//check to see that ArrayList contains at least one value
		if (nums.size() <= 0) {
			System.out.print("Enter at least 1 value");
		}
		//iterates through ArrayList and multiplies total by ArrayList index i
		else {
			for (int i : nums) {
				total *= i;
			}
		}
		//Prints out the product of all the user supplied integers
		System.out.printf("\nThe product is: %d", total);
	}
}
