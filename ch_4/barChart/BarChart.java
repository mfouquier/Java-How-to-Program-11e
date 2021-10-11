package barChart;
import java.util.Scanner;
public class BarChart {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
			System.out.print("Enter a number between 1 and 30: ");
			int a = input.nextInt(); 
			System.out.print("Enter a number between 1 and 30: ");
			int b = input.nextInt(); 
			System.out.print("Enter a number between 1 and 30: ");
			int c = input.nextInt(); 
			System.out.print("Enter a number between 1 and 30: ");
			int d = input.nextInt(); 
			System.out.print("Enter a number between 1 and 30: ");
			int e = input.nextInt(); 
			
			while (a > 0) {
				System.out.print("*");
				a--;
			}
			System.out.println();
			while (b > 0) {
				System.out.print("*");
				b--;
			}
			System.out.println();
			while (c > 0) {
				System.out.print("*");
				c--;
			}
			System.out.println();
			while (d > 0) {
				System.out.print("*");
				d--;
			}
			System.out.println();
			while (e > 0) {
				System.out.print("*");
				e--;
			}
			System.out.println();
		

	}

}
