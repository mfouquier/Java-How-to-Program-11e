package com.ch10_14;

public abstract class ThreeDimensional extends Shape{
//Instance variables to set the dimensions of a 3D shape
	private double dimension1;
	private double dimension2;
	private double dimension3;
//Constructor 	
	public ThreeDimensional(double dimension1 , double dimension2, double dimension3) {
		//super(x, y);
		this.dimension1 = dimension2;
		this.dimension2 = dimension2;
		this.dimension3 = dimension3;
		}
//SET and GET methods for the dimensions of a 3D shape	
	public double getDimension1() {return dimension1;}
	public void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}
	public double getDimension2() {return dimension2;}
	public void setDimension2(double dimension2) {
		this.dimension2 = dimension2;
	}
	public double getDimension3() {return dimension3;}
	public void setDimension3(double dimension3) {
		this.dimension3 = dimension3;
	}
	
//Abstract method to get the area of a 3D shape	
	public abstract double getArea();
//Abstract method to get the volume of a 3D shape
	public abstract double getVolume();
}
