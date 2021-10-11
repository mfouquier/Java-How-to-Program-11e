import java.util.*;

public class Coordinate implements Comparable<Coordinate> {
	double x;
	double y;
	double z;
	
	public Coordinate(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}


	public double getZ() {
		return z;
	}


	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public int compareTo(Coordinate c) {
		return (int)((x*x+y*y+z*z)-(c.x*c.x+c.y*c.y+c.z*c.z));
	}
	
	@Override
	public String toString() {
		return "Coordinate [" + x + ", " + y + ", " + z+ "]";
	}
	
}