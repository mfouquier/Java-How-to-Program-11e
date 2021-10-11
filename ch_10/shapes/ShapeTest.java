package com.ch10_14;

public class ShapeTest {

	public static void main(String[] args) {
//create objects of each class
		Square square = new Square(4,4);
		Circle circle = new Circle(3);
		Triangle triangle = new Triangle(2,3);
		Sphere sphere = new Sphere(4);
		Cube cube = new Cube(5,5,5);
		Tetrahedron tetrahedron = new Tetrahedron(3,3,3);

//create a 6 element Shape Array
		Shape[] shapes = new Shape[6];

//initialize Array with objects
		shapes[0] = square;
		shapes[1] = circle;
		shapes[2] = triangle;
		shapes[3] = sphere;
		shapes[4] = cube;
		shapes[5] = tetrahedron;
		
		System.out.printf("Shapes printed based on Downcasted reference:%n%n");
		
		for(Shape currentShape : shapes) {
			System.out.print(currentShape);//prints the Shape toString
	//Prints only 2D shapes and their area		
			if (currentShape instanceof TwoDimensional) {
				TwoDimensional shape = (TwoDimensional) currentShape;
				System.out.printf("%s is: %.1f%n%n", shape.getName(), shape.getArea());
			}
	//Prints only 3D shapes and their area and volume		
			if (currentShape instanceof ThreeDimensional) {
				ThreeDimensional shape = (ThreeDimensional) currentShape;
				System.out.printf("%s is: %.1f%nThe volume is: %.1f%n%n", shape.getName(), shape.getArea(), shape.getVolume());
				}
			
			
			
			}
		}
	}

