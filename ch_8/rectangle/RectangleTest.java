package rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 4);
		Rectangle r2 = new Rectangle(2,5);
		Rectangle r3 = new Rectangle(6,19);
		
		System.out.println(r1);
		System.out.printf("Area: %.1f%n", r3.calculateArea());
		System.out.printf("Perimeter: %.1f%n", r2.calculatePerimeter());
	}

}
