package ch8.hugeInteger;
import java.util.Scanner;
public class HugeIntegerTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer no more than 40 digits: ");
		String userInput = input.nextLine();
		
		HugeInteger h1 = new HugeInteger();
		HugeInteger h2 = new HugeInteger(userInput);
		h1.parse("1539");
		
		System.out.printf("h1: %s%n", h1);
		System.out.printf("h2: %s%n%n", h2);
		System.out.printf("The sum of h1 and h2 is:%n%s%n%n", HugeInteger.add(h1, h2));
		System.out.printf("h1: %s%n", h1);
		System.out.printf("h2: %s%n%n", h2);
		System.out.printf("The difference of h1 and h2 is:%n%s%n%n", HugeInteger.subtract(h1, h2));
		System.out.printf("h1 equal to h2: %b%n", HugeInteger.isEqualTo(h1,h2));
		System.out.printf("h1 is NOT equal to h2: %b%n", HugeInteger.isNotEqualTo(h1, h2));
		System.out.printf("h1 is GREATER than h2: %b%n", HugeInteger.isGreaterThan(h1, h2));
		System.out.printf("h1 is LESS than h2: %b%n", HugeInteger.isLessThan(h1, h2));
		System.out.printf("h1 is GREATER than or EQUAL to h2: %b%n", HugeInteger.isGreaterThanOrEqualTo(h1, h2));
		System.out.printf("h1 is ZERO: %s%n", HugeInteger.isZero(h1));
		System.out.printf("h1: %s%n", h1);
		System.out.printf("h2: %s%n%n", h2);
	}
}
