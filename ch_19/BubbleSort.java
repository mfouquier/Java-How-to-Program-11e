import java.security.SecureRandom;
import java.util.*;

public class BubbleSort {
	//method to sort the array
	public static void bubbles(int [] data) {
		int temp = 0;//temp variable to hold a larger integer
		for(int i = 0; i < data.length -1; i++) {//will sort through the length of the list
			for(int x = 0; x < data.length - 1 - i; x++) {//inner loop will not sort already sorted items length - 1 - i
				if (data[x] > data[x + 1]) {//compares two integers that are side by side in the array
					temp = data[x];//if larger the item is moved to the temp variable
					data[x] =  data[x + 1];//the smaller number is moved to the right in the array
					data[x + 1] = temp;//the larger number is moved from temp to the left in the array
				}
			}
		}
	}
	public static void main(String[] args) {
		SecureRandom randomInt = new SecureRandom();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer for the size of the Array: ");
		int size = input.nextInt();
		//create array the size of user input
		int[] data = new int[size];
		//loop through the array and fill each index with random value 1 - 100
		for (int i = 0; i < data.length; i++) {
      	  int filler = 1 + randomInt.nextInt(101);
      	  data[i] += filler;
		}
		System.out.printf("Unsorted Array: %s%n%n", Arrays.toString(data));
		bubbles(data);
		System.out.printf("Sorted Array: %s%n%n", Arrays.toString(data));
	}

}
