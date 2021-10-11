import java.util.Scanner;
import java.util.ArrayList;

public class exer_7_14 {

	public static void main(String[] args) {
		//Print out various products using different variable arguments lengths
		System.out.printf("The product is: %d%n", product(0));
		System.out.printf("The product is: %d%n", product(2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2));
		System.out.printf("The product is: %d%n", product(1,2,3,4,5,6));
		System.out.printf("The product is: %d%n", product(2, 4, 5, 10));
		
	}
	//Method product takes a variable length argument indicated by the ... 
	public static int product(int... numbers) {
		//set variable total to 1
		int total = 1;
		//iterate through the supplied arguments and multiply by total
		for (int number : numbers) {
			total *= number;
		}
		return total;
	}
	
}
