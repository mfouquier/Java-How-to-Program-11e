import java.util.Scanner;

public class RecursivePower {
	public static int power(int base, int exponent) {
		if (exponent == 1) {
			return base;
		}
		else {
			return base * power(base, exponent - 1);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter base integer: ");
		int base = input.nextInt();
		System.out.print("Enter exponent: ");
		int exponent = input.nextInt();
		
		System.out.printf("%d to the %d power is: %d%n",base, exponent, power(base, exponent));
    	
	}

}
