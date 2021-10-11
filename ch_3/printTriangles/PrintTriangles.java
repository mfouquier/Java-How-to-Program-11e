package printTriangles;

public class PrintTriangles {

	public static void main(String[] args) {
	
		/*String triangle = "";
	for (int i = 1; i <= 10; i++) {
		triangle = triangle + "*";
		System.out.println(triangle);
		}*/
		
		int row, column, space;
		System.out.println("(a)");
		for (row = 1; row <= 10; row++) {
			for (column = 1; column <= row; column++) 
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("(b)");
		for (row = 10; row >= 1; row--) {
			for (column = 1; column <= row; column++) 
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("(c)");
		for (row = 10; row >= 1; row--) {
			for (space = 10; space >= row; space--)
				System.out.print(" ");
			for (column = 1; column <= row; column++)	
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println(("d"));
		for (row = 1; row <= 10; row++) {
			for (space = 10; space >= row; space--)
				System.out.print(" ");
			for (column = 1; column <= row; column++)
				System.out.print("*");
			System.out.println();
		}

	}

}
