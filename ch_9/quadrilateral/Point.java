package quadrilateral;

public class Point {
	//Instance variables for x and y coordinates
	double x;
	double y;
	//Constructor
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//GET Methods
	public double getX() {return x;}
	public double getY() {return y;}
	//toString to return the x and y coordinates of a point
	public String toString() {
		return String.format("%s %.2f, %.2f", "X and Y coordinates: ", getX(), getY());
	}
}
