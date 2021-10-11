import java.util.Scanner;//imports Scanner class
import java.lang.Math;//imports Math class

public class Hypotenuse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side A of triangle: ");
		double a = input.nextInt();//takes input and assigns it to variable a
			
		System.out.print("Enter side B of triangle: ");
		double b = input.nextInt();//takes input and assigns it to variable b
		
		//Takes input and uses it as parameters to call method hypotenuse
		double triangle = hypotenuse(a,b);
		System.out.printf("The hypotenuse of the triangle is: %.2f ", triangle);
		}//prints the results of method hypotenuse assinged to variable triangle
		
		public static double hypotenuse(double a, double b) {
			//Squares a and b then adds them together   
			double cSquare = Math.pow(a, 2) + Math.pow(b, 2);
			//Square root of the result of c to obtain the hypotenuse value
			double c = Math.sqrt(cSquare);
			return c;
	 		}
	}
