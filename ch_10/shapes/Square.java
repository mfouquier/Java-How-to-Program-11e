package com.ch10_14;

public class Square extends TwoDimensional {
//Instance variables to define the sides of the square
	private double side1; 
	private double side2;
//Constructor
	public Square(double side1, double side2) {
		super(side1, side2);
		this.side1 = side1;
		this.side2 = side2;
	}
//SET and GET methods for sides 1 and 2 of the square	
	public double getSide1() {return side1;}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {return side2;}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
//Overrides abstract method getName from abstract class Shape	
	@Override
	public String getName() {
		return "Square";
	}
/**Overrides abstract method getArea from abstract class TwoDimensional
	and is specific for the area of a Square*/
	@Override
	public double getArea() {
		return getSide1() * getSide2();
	}
//I was using a toString method in each class but opted to use the downcasting to print so commented out
//toString to return the name and area
	/*@Override
	public String toString() {
		return String.format("%s%s is: %.1f%n", super.toString(), getName(), getArea());
	}*/
}
