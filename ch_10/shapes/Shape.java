package com.ch10_14;

public abstract class Shape {

//Constructor	
	public Shape() {	
}

//Abstract method to return the name of the shape	
	public abstract String getName();

//toString 
	@Override
	public String toString() {
		return String.format("Area of the ");
	}
}
