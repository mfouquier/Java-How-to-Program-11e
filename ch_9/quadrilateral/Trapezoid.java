package quadrilateral;
//Extend super class Quadrilateral
public class Trapezoid extends Quadrilateral {
	//constructor for Trapezoid - calls the super constructor of Quadrilateral
	public Trapezoid(double x1, double y1, double x2, double y2, double x3, 
			double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	//GET methods - Area = (b1 + b2) * h / 2 
	//The height, upper and lower base must be calculated
	public double getHeight() {
		double height = Math.abs(b.getY() - a.getY());
		return height;
	}
	
	public double getBase1() {
		double base1 = Math.abs(d.getX() - a.getX());
		return base1;
	}
	
	public double getBase2() {
		double base2 = Math.abs(c.getX() - b.getX());
		return base2;
	}
	
	public double area() {
		double area = ((getBase1() + getBase2()) * getHeight() / 2);
		return area;
	}
	//Print out the height and area of the Trapezoid
	@Override
	public String toString() {
		return String.format("%s %n%s %.2f%n%s %.2f%n", "Trapezoid - ", 
				"Height ", getHeight(), "Area ", area());
	}
	
}
