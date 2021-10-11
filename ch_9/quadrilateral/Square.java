package quadrilateral;
//Extends Rectangle super class
public class Square extends Rectangle {
	//Constructor with super constructor
	public Square(double x1, double y1, double x2, double y2, double x3, 
			double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		//checks for equal lenght - all sides must be equal in a square
		if(b.getY() - a.getY() != c.getX() - b.getX() && c.getY() - d.getY() != d.getX() - a.getX())
			throw new IllegalArgumentException("The sides must be equal.");
	}
	//Overrides the area method of super class
	@Override
	public double area() {
		double area = getWidth() * getWidth();
		return area;
	}
	//returns the width and area 
	@Override
	public String toString() {
		return String.format("%s %n%s %.2f%n%s %.2f%n", "Square - ",  
				"Length of Sides ",getWidth(), "Area ", area());
	}
}
