import java.util.Scanner;//imports Scanner class

public class SquareAstericks {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter an integer: ");
	    int x = input.nextInt();//assigns user input to variable x
	    
	  //Squares will call method squareOfAstericks and use input as parameter
	    String squares = squareOfAsterisks(x); 
	}
	
	public static String squareOfAsterisks(int numOfAsterisks) {
	    //String variable set to * 
		String square = "*";
	    int y = 1;//counter for while loop
	    //will loop until y = the user input integer
	    while (y <= numOfAsterisks){
	        //will print the number of asterisks entered by user
	    	for (int i = 1; i <= numOfAsterisks; i++){
	            System.out.print("*");
	    }
	    	//prints a new line thus creating the square - y++ increments while counter
	        System.out.println();
	        y++;
	    }
	   return square;
	}
}

