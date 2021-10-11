import java.util.Arrays;

public class exer_7_11 {

	public static void main(String[] args) {
		//a. Set 10 elements of integer array counts to zero
		// By default all elements set to zero
		int[] counts = new int[10];
		//Print all elements of counts to verify zero
		for(int i = 0; i < counts.length; i++) {
			System.out.printf("    %d", counts[i]);
		}
		System.out.println();
		
		//b. Add one to each of the 15 elements of array bonus
		int [] bonus = new int[15];
		//use the fill method of Class Arrays
		Arrays.fill(bonus, 1);
		for(int i : bonus) {
			System.out.printf("    %d", i);
		}
		//Fill with iteration - commented out in order to use above fill method
		/*for (int i = 0; i < bonus.length; i++) {
			bonus[i] += 1;
			System.out.printf("    %d", bonus[i]);
		}*/
		System.out.println();
		
		//c. Display the five values of bestScores in column format
		int[] bestScores = {500, 2000, 40, 900, 1200};
		System.out.printf("%s%n", "Best Scores");
		for(int i = 0; i < bestScores.length; i++) {
			System.out.printf("%5d%n", bestScores[i]);
		}
	}

}
