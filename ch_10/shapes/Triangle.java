package com.ch10_14;

public class Triangle extends TwoDimensional {
//Instance variables to define the base and height of the triangle
	private double base; 
	private double height;
//Constructor
	public Triangle(double base, double height) {
		super(base, height);
		this.base = base;
		this.height = height;
		}
//SET and GET methods for base and height of the triangle	
	public double getBase() {return base;}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {return height;}
	public void setHeight(double height) {
		this.height = height;
	}
//Overrides abstract method getName from abstract class Shape	
	@Override
	public String getName() {
		return "Triangle";
	}
/**Overrides abstract method getArea from abstract class TwoDimensional
	and is specific for the area of a Triangle*/
	@Override
	public double getArea() {
		return (getBase() * getHeight()) / 2;
	}
//I was using a toString method in each class but opted to use the downcasting to print so commented out
//toString to return the name and area
/*	@Override
	public String toString() {
		return String.format("%s%s is: %.1f%n", super.toString(), getName(), getArea());
	}*/
}
