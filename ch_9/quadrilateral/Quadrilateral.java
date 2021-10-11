package quadrilateral;

public class Quadrilateral {
	//Create four points 
	Point a;
	Point b;
	Point c;
	Point d;
	//Constructor of eight doubles to create the 4 points (x,y) 
	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		//check that the coordinate is greater than 0
		if (x1 < 0 || x2 < 0 || x3 < 0 || x4 < 0 || y1 < 0 || y2 < 0 || y3 < 0 || y4 < 0) {
			throw new IllegalArgumentException("All coordinates must be greater than 0");
		}
		//Assign coordinates to a point
		this.a = new Point (x1, y1);
		this.b = new Point (x2, y2);
		this.c = new Point (x3, y3);
		this.d = new Point (x4, y4);
	}
	//SET Methods
	public void setPointA(double x1, double y1) {
		if(x1 < 0 || y1 < 0)
			throw new IllegalArgumentException("All coordinates must be greater than 0");
		this.a = new Point (x1, y1);
	}
	public void setY1(double x2, double y2) {
		if( x2 < 0 || y2 < 0)
			throw new IllegalArgumentException("All coordinates must be greater than 0");
		this.b = new Point(x2, y2);
	}
	public void setX2(double x3, double y3) {
		if(x3 < 0 || y3 < 0)
			throw new IllegalArgumentException("All coordinates must be greater than 0");
		this.c = new Point(x3, y3);
	}
	public void setY2(double x4, double y4) {
		if(x4 < 0 || y4 < 0)
			throw new IllegalArgumentException("All coordinates must be greater than 0");
		this.d = new Point(x4, y4);
	}
	//GET Methods
	public Point getA() {return a;}
	public Point getB() {return b;}
	public Point getC() {return c;}
	public Point getD() {return d;}
	
	//toString that will print out all four points with their x and y coordinates
	@Override
	public String toString() {
		return String.format("%s%n %s%n %s%n %s%n %s%n", 
				"The four points of your quadrilateral are:", a.toString(), b.toString(), c.toString(), d.toString());
	}
}

