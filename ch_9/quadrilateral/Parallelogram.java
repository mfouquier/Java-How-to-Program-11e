package quadrilateral;
//Extends Trapezoid
public class Parallelogram extends Trapezoid {
	//Constructor - calls the super class constructor
	public Parallelogram(double x1, double y1, double x2, double y2, double x3, 
			double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		//Parallelogram opposite sides must be equal lengths - checks for equal length
		if(b.getY() - a.getY() != c.getY() - d.getY())
			throw new IllegalArgumentException("The lengths of the sides must be equal.");
		if(d.getX() - a.getX() != c.getX() - b.getX())
			throw new IllegalArgumentException("The lengths of the sides must be equal.");
	}
	//Overrides the area formula of Trapezoid 
	@Override
	public double area() {
		double area = getBase1() * getHeight();
		return area;
	}
	//Returns height and area of parallelogram
	@Override
	public String toString() {
		return String.format("%s %n%s %.2f%n%s %.2f%n", "Parallelogram - ",  
				"Height ", getHeight(), "Area ", area());
	}
}
