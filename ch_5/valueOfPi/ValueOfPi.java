package valueOfPi;

public class ValueOfPi {

	public static void main(String[] args) {
		double pi = 0;
		double oddNumber = 1;
		
		for (int i = 0; i <= 200000; i++) {
			if (i % 2 == 0) {
				pi += 4 / oddNumber;
			}
			else { 
				pi -= 4 / oddNumber;
			}	
			oddNumber += 2;
			System.out.printf("%.5f\t%.5f\t%.5f\t%.5f\t%.5f\t%.5f\t%.5f\t%.5f\t%.5f\t%.5f\t%n", 
					pi, pi, pi, pi, pi, pi, pi, pi, pi, pi);
		}
	}
}
