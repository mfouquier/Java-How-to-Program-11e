package Factorial;

public class Factorial {

	public static void main(String[] args) {

		long factorial = 1; //sets the variable equal to 1
		
		for (int i = 1; i <= 20; i++) {//while i is <= 20 the loop will run incrementing by 1
			factorial *= i; /*multiplies the value of factorial and i then replaces
			 factorial with the product*/
		}
	System.out.printf("Factorial 1 to 20 is: %,d", factorial);//prints out the total of the factorial
	}

}
