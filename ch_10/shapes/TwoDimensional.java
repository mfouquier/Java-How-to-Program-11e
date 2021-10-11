package com.ch10_14;

public abstract class TwoDimensional extends Shape {
//Instance variables to set the dimensions of a 2D shape
	private double dimension1;
	private double dimension2;
//Constructor 	
	public TwoDimensional(double dimension1 , double dimension2) {
		//super(x, y);
		this.dimension1 = dimension2;
		this.dimension2 = dimension2;
	}
//SET and GET methods for the dimensions of a 2D shape	
	public double getDimension1() {return dimension1;}
	public void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}
	public double getDimension2() {return dimension2;}
	public void setDimension2(double dimension2) {
		this.dimension2 = dimension2;
	}
//Abstract method to get the area of a 2D shape	
	public abstract double getArea();

}
