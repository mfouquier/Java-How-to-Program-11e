package rectangle;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		this(1, 1);
	}
	public Rectangle(double length, double width) {
		this.setLength(length);
		this.setWidth(width);
	}
	
	//Set Methods for Length and Width
	public void setLength(double length) {
		if (length <= 0.0 || length >= 20.0) 
			throw new IllegalArgumentException("Enter number between 1 and 20");
		this.length = length;
	}
	public void setWidth(double width) {
		if (width <= 0.0 || width >= 20.0)
			throw new IllegalArgumentException("Enter number between 1 and 20");
		this.width = width;
	}
	
	//Get Methods for Length and Width
	public double getLength() {return length;}
	public double getWidth() {return width;}
	
	//Calculate the Perimeter of a Rectangle
	public double calculatePerimeter() {
		return (getWidth() * 2) + (getLength() * 2);
	}
	//Calculate the Area of a Rectangle
	public double calculateArea() {
		return (getLength() * getWidth());
	}
	public String toString() {
		return String.format("Rectangle%nWidth: %.1f%nLength: %.1f%n", getWidth(), getLength());
	}
}
