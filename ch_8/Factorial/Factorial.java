package Factorial;

public class Factorial {

	public static void main(String[] args) {

		long factorial = 1;
		
		for (int i = 1; i <= 20; i++) {
			factorial *= i;
		}
	System.out.printf("Factorial 1 to 20 is: %,d", factorial);
	}

}
