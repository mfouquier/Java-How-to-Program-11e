package com.ch10_14;

public class Cube extends ThreeDimensional {
//Instance variables to define the sides of the cube
	private double side1; 
	private double side2;
	private double side3;
//Constructor
	public Cube(double side1, double side2, double side3) {
		super(side1, side2, side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
//SET and GET methods for sides 1, 2, 3 of the cube	
	public double getSide1() {return side1;}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {return side2;}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {return side3;}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
//Overrides abstract method getName from abstract class Shape	
	@Override
	public String getName() {
		return "Cube";
	}
/**Overrides abstract method getArea from abstract class ThreeDimensional
	and is specific for the area of a Cube*/
	@Override
	public double getArea() {
		return 6 * Math.pow(getSide1(), 2);
	}
/**Overrides abstract method getVolume from abstract class ThreeDimensional
* and is specific for the area of a Cube*/
	@Override
	public double getVolume() {
		return Math.pow(getSide1(), 3);
	}
//I was using a toString method in each class but opted to use the downcasting to print so commented out
//toString to return the name and area
/*	@Override
	public String toString() {
		return String.format("%s%s is: %.1f%n%s%.1f%n", super.toString(), getName(), getArea(), "Volume ", getVolume());
	}*/
}
