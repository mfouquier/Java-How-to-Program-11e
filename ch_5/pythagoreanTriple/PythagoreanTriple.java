package pythagoreanTriple;

public class PythagoreanTriple {

	public static void main(String[] args) {
		
		
		for(int a = 1; a <= 500; a++) {
			for (int b = a; b <= 500; b++) {
				for (int c = b; c <= 500; c++) {
					
					if ((a * a + b * b) == (c * c)){
						System.out.printf("%d %d %d%n", a, b, c);
					}
				}
			}
		}
	}
}