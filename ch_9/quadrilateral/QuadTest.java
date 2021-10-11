package quadrilateral;

public class QuadTest {

	public static void main(String[] args) {
		Quadrilateral quad = new Quadrilateral(2, 2, 2.5, 4, 3.5, 4, 4, 2);
		System.out.print(quad);
		System.out.println();
		Trapezoid trap = new Trapezoid(2, 2, 2.5, 4, 3.5, 4, 4, 2);
		System.out.print(trap);
		System.out.println();
		Parallelogram para = new Parallelogram(2, 2, 2.5, 4, 4.5, 4, 4, 2);
		System.out.print(para);
		System.out.println();
		Rectangle rec = new Rectangle(2, 2, 2, 4, 8, 4, 8, 2);
		System.out.print(rec);
		System.out.println();
		Square sq = new Square(2, 2, 2.5, 4, 4.5, 4, 4, 2);
		System.out.print(sq);

	}

}
