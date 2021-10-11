import java.util.*;

public class Patterns {
	public static final char STAR = '*';
	private static int gridDimension;
	private static int edgeSize;

	public static void main(String[] args) {
		setSizes();
		char[][] array1 = new char[gridDimension][gridDimension];

		System.out.println("Running verticalEdge()");
		verticalEdge(array1);
		clear(array1);
		System.out.println("Running horizontalEdge()");
		horizontalEdge(array1);
		clear(array1);
		System.out.println("Running outerBox()");
		outerBox(array1);
		clear(array1);
		System.out.println("Running innerBox()");
		innerBox(array1);
		clear(array1);
		System.out.println("Running upperTriangle()");
		upperTriangle(array1);
		clear(array1);
		System.out.println("Running lowerTriangle()");
		lowerTriangle(array1);
		clear(array1);
		System.out.println("Running hourglass()");
		hourglass(array1);
		clear(array1);

	}

	// METHOD TO SET THE GRID DIMENSIONS AND EDGE SIZE
	static void setSizes() {
		// create do while loops to get the correct input
		// initioalize scanner
		// int gridDimension = 0;
		// int edgeSize = 0;
		Scanner keybd = new Scanner(System.in);
		do {
			System.out.print("Enter grid dimension (even between 6 and 16): ");
			gridDimension = keybd.nextInt();
			if (gridDimension >= 6)
				if (gridDimension <= 16)
					if (gridDimension % 2 == 0) {
						break;
					}
		} while (gridDimension > 0);
		do {
			System.out.print("Enter edge size (between 1 and dimension/2-1) ");
			edgeSize = keybd.nextInt();
			if (edgeSize >= 1)
				if (edgeSize <= gridDimension / 2 - 1) {
					break;
				}
		} while (edgeSize >= 0);
	}

	// METHOD TO PRINT THE ARRAY IN A NEAT FORMAT
	static void print(char[][] array) {
		for (int i = 1; i <= gridDimension * 2; i++)
			System.out.printf("%s", "-");
		for (int row = 0; row < array.length; row++) {
			System.out.println();
			for (int column = 0; column < array[row].length; column++)
				System.out.printf("%2s", array[row][column]);
		}
		System.out.println();
		for (int i = 1; i <= gridDimension * 2; i++)
			System.out.printf("%s", "-");
		System.out.println();
	}

	// METHOD TO CLEAR THE ARRAY BY ADDING A SPACE TO ALL COLUMNS AND ROWS
	static void clear(char[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				array[row][column] = ' ';
			}
		}
	}

	static void verticalEdge(char[][] array) {
		int edge = edgeSize;
		// Nested loop that will print stars along the vertical edge until the input
		// edgeSize is reached
		for (int i = 1; i <= edge; i++)
			for (int row = 0; row < array.length; row++) {
				for (int column = i; column < array[row].length; column++) {
					array[row][i - 1] = STAR;
					array[row][array[row].length - i] = STAR;
				}
			}
		print(array);
	}

	static void horizontalEdge(char[][] array) {
		int edge = edgeSize;
		// Nested loop that will print stars along the horizontal edge until the input
		// edgeSize is reached
		for (int i = 1; i <= edge; i++) {
			for (int row = 0; row < array.length; row++) {
				for (int column = 0; column < array[row].length; column++) {
					array[i - 1][column] = STAR;
					array[array[row].length - i][column] = STAR;
				}
			}
		}
		print(array);
	}

	static void outerBox(char[][] array) {
		int edge = edgeSize;
		// Takes the code from verticalEdge to create the sides of the box
		for (int i = 1; i <= edge; i++)
			for (int row = 0; row < array.length; row++) {
				for (int column = i; column < array[row].length; column++) {
					array[row][i - 1] = STAR;
					array[row][array[row].length - i] = STAR;
				}
			}
		// Takes the code from horizontalEdge to create the top and bottom of the box
		for (int i = 1; i <= edge; i++) {
			for (int row = 0; row < array.length; row++) {
				for (int column = 0; column < array[row].length; column++) {
					array[i - 1][column] = STAR;
					array[array[row].length - i][column] = STAR;
				}
			}
		}
		print(array);

	}

	static void innerBox(char[][] array) {
		int edge = edgeSize;
		// Fill the Array with stars
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				array[row][column] = STAR;
			}
		}
		// Uses the for loops from outerBox() and replaces * with ' ' to create the
		// inner box
		for (int i = 1; i <= edge; i++)
			for (int row = 0; row < array.length; row++) {
				for (int column = i; column < array[row].length; column++) {
					array[row][i - 1] = ' ';
					array[row][array[row].length - i] = ' ';
				}
			}
		for (int i = 1; i <= edge; i++) {
			for (int row = 0; row < array.length; row++) {
				for (int column = 0; column < array[row].length; column++) {
					array[i - 1][column] = ' ';
					array[array[row].length - i][column] = ' ';
				}
			}
		}
		print(array);
	}

	static void upperTriangle(char[][] array) {
		int triangleSize = gridDimension / 2;

		for (int i = 1; i <= triangleSize; i++) {
			for (int row = 0; row < array.length; row++) {
				for (int column = 0; column < array[row].length; column++) {
					array[i - 1][column] = STAR;
					// array[1][column] = STAR;
					// array[2][column] = STAR;
				}
				for (int x = 0; x <= triangleSize; x++) {
					array[x + 1][x] = ' ';
					array[x + 1][array[row].length - 1] = ' ';
					/*
					 * array[2][0] = ' '; array[2][array[row].length-1] = ' '; array[2][1] = ' ';
					 * array[2][array[row].length-2] = ' ';
					 */
				}
			}
		}
		print(array);
	}

	static void lowerTriangle(char[][] array) {
		for (int i = 0; i <= array.length / 2; i++) {
			for (int row = 0; row < array.length; row++) {
				for (int column = 0; column < array[row].length; column++) {
					array[array.length - 1][column] = STAR;
					array[array.length - 2][column] = STAR;
					array[array.length - 3][column] = STAR;
					array[array.length - 2][0] = ' ';
					array[array.length - 2][array[row].length - 1] = ' ';
					array[array.length - 3][0] = ' ';
					array[array.length - 3][array[row].length - 1] = ' ';
					array[array.length - 3][1] = ' ';
					array[array.length - 3][array[row].length - 2] = ' ';
				}
			}
		}
		print(array);
	}

	static void hourglass(char[][] array) {
		for (int i = 0; i <= array.length / 2; i++) {
			for (int row = 0; row < array.length; row++) {
				for (int column = 0; column < array[row].length; column++) {
					array[0][column] = STAR;
					array[1][column] = STAR;
					array[2][column] = STAR;
					array[1][0] = ' ';
					array[1][array[row].length - 1] = ' ';
					array[2][0] = ' ';
					array[2][array[row].length - 1] = ' ';
					array[2][1] = ' ';
					array[2][array[row].length - 2] = ' ';
				}
			}
		}

		for (int i = 0; i <= array.length / 2; i++) {
			for (int row = 0; row < array.length; row++) {
				for (int column = 0; column < array[row].length; column++) {
					array[array.length - 1][column] = STAR;
					array[array.length - 2][column] = STAR;
					array[array.length - 3][column] = STAR;
					array[array.length - 2][0] = ' ';
					array[array.length - 2][array[row].length - 1] = ' ';
					array[array.length - 3][0] = ' ';
					array[array.length - 3][array[row].length - 1] = ' ';
					array[array.length - 3][1] = ' ';
					array[array.length - 3][array[row].length - 2] = ' ';
				}
			}
		}
		print(array);
	}
}
