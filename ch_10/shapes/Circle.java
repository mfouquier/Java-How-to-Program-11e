package com.ch10_14;

public class Circle extends TwoDimensional {
//Instance variable for radius of the circle
	private double radius;
//Constructor	
	public Circle(double radius) {
		super(radius, radius);
		this.radius = radius;
	}
//SET and GET methods for Radius	
	public double getRadius() {return radius;}
	public void setRadius(double radius) {
		this.radius = radius;
	}
//Overrides abstract method getName from abstract class Shape	
	@Override
	public String getName() {
		return "Circle";
	}
/**Overrides abstract method getArea from abstract class TwoDimensional
   and is specific for the area of a Circle*/	
	@Override
	public double getArea() {
		return getRadius() * Math.PI;
	}
//I was using a toString method in each class but opted to use the downcasting to print so commented out
//toString to return the name and area
	/*@Override
	public String toString() {
		return String.format("%s%s is: %.1f%n", super.toString(), getName(), getArea());
	}*/
}
