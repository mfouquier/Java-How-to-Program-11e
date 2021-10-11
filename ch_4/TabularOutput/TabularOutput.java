package TabularOutput;

public class TabularOutput {

	public static void main(String[] args) {
		int n = 1; //Local variable
		int n10 = 0;
		int n100 = 0;
		int n1000 = 0;
		
		System.out.println("N\t10*N\t100*N\t1000*N \n");
		while (n <= 5) {//loop through until n = 5
			n10 = (n * 10);
			n100 = (n * 100);
			n1000 = (n * 1000);
			System.out.printf("%d \t %d \t%d \t%d \t %n", n, n10, n100, n1000);
			++n;
		}

	}

}
