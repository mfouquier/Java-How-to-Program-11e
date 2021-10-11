package com.ch10_14;

public class Sphere extends ThreeDimensional {
//Instance variable for radius
	private double radius;
//Constructor	
	public Sphere (double radius) {
		super(radius, radius, radius);
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
		return "Sphere";
	}
/**Overrides abstract method getArea from abstract class ThreeDimensional
 * and is specific for the area of a Sphere*/	
	@Override
	public double getArea() {
		return 4 * (Math.pow(getRadius(), 2) * Math.PI);
	}
/**Overrides abstract method getVolume from abstract class ThreeDimensional
* and is specific for the area of a Sphere*/
	@Override
	public double getVolume() {
		return 4 / 3 * (Math.pow(getRadius(), 3) * Math.PI);
	}
//I was using a toString method in each class but opted to use the downcasting to print so commented out
//toString to return the name and area
/*	@Override
	public String toString() {
		return String.format("%s%s is: %.1f%n%s%.1f%n", super.toString(), getName(), getArea(), "Volume ", getVolume());
	}*/
}
