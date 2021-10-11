import java.util.Scanner;

public class TwoByThree {

	public static void main(String[] args) {
		int [][] t = new int[2][3]; //a. 2x3 integer array t
									//b. t has 2 rows
									//c. t has 3 columns
									//d. t has 6 elements
		
		System.out.println("Elements of Row 1");//e. Show all the elements of Row 1
		for (int column = 0; column < t[0].length; column++) {
				System.out.printf("%d ", t[0][column]); 
			}
		System.out.println();
		
		System.out.println("Elements of Column 2");//f.Show all elements of Column 2
		for (int row = 0; row < t.length; row++) {
			System.out.printf("%d%n", t[row][2]);
		}
		System.out.println(); 
		
		t[0][1] = 0;//g. Set t row 0 column 1 to zero
		
		//h. Set all elements of t to zero individually
		t[0][0] = 0;
		t[0][1] = 0;
		t[0][2] = 0;
		t[1][0] = 0;
		t[1][1] = 0;
		t[1][2] = 0;
		
		//i. Nested for statement to set all elements to zero
		System.out.println("Set all elements of t to zero");
		for (int row = 0; row < t.length; row++) {
			for (int column = 0; column < t[row].length; column++) {
				t[row][column] = 0;
				System.out.printf("%d    ", t[row][column]);
			}
			System.out.println();
		}
		//j. Set elements of t with input from the user
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Set elements of t with user input");
		for (int row = 0; row < t.length; row++) {
			for (int column = 0; column < t[row].length; column++) {
				System.out.print("Enter an integer: ");//iterates through the columns
				t[row][column] = input.nextInt();//user input placed in row and column according to counters
			}
		}
		System.out.println("\nVerify that t input reflects user input");//Verifies user input not part of the question
		for (int row = 0; row < t.length; row++) {
			for (int column = 0; column < t[row].length; column++) {
				System.out.printf("%d    ", t[row][column]);
			}
		
		}
		
		//k. Determine the smallest value of t
		System.out.println();
		int number = t[0][0];//sets the initial low value to the first element
		
		for(int row = 0; row < t.length; row++) {
			for(int column = 0; column < t[row].length; column++) {
				if (t[row][column] < number) {//compares the column values and replaces with the lowest
					number = t[row][column];
				}
			}
		}
		System.out.printf("\nThe smallest integer in t is: %d%n", number);
		
		//l. Display the elements of Row 1 of t in a single printf statement
		System.out.printf("\nElements of Row 1 of t: %n%d   %d   %d%n", t[0][0], t[0][1], t[0][2]);
		
		//m. Total elements of column 3 without iteration
		int sum = t[0][2] + t[1][2];
		System.out.printf("\nThe sum of column 3 is: %d\n", sum);
		
		//n. Display contents of t in tabular format 
		System.out.printf("%n%17s %d %6s %d %6s %d%n", "Column", 1, "Column", 2, "Column", 3);//sets headers
		for (int row = 0; row < t.length; row++) {
			System.out.printf("%s %d", "Row", row + 1);//prints Row labels
			for (int column = 0; column < t[row].length; column++) {
				System.out.printf("%10d", t[row][column]);//prints column elements
			}
		System.out.println();
		}
		
}
}

