package quadrilateral;
//Extends Parallelogram
public class Rectangle extends Parallelogram {
//Constructor with super class constructor
	public Rectangle(double x1, double y1, double x2, double y2, double x3, 
			double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	//calculates the width of a rectangle
	public double getWidth() {
		double width = b.getY() - a.getY();
		return width;
	}
	//Overrides the super class Area formula
	@Override
	public double area() {
		double area = getBase1() * getWidth();
		return area;
	}
	//Returns the Length, width, and area
	@Override
	public String toString() {
		return String.format("%s %n%s %.2f%n%s %.2f%n%s %.2f%n", "Rectangle - ",  
				"Length ", getBase1(),"Width", getWidth(), "Area ", area());
	}
}
