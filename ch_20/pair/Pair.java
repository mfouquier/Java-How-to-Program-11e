package com.ch20_8;
import java.util.*;


public class Pair<F extends Number,S extends Number> {
	F firstElement;
	S secondElement;
//Default Constructor	
	public Pair() {
		firstElement = null;
		secondElement = null;
	}
//Two argument constructor
	public Pair(F first, S second) {
		this.firstElement = first;
		this.secondElement = second;
	}
//SET and GET methods for type parameters F and S	
	public F getFirst(){return firstElement;}
	public void setFirst(F first) {
		this.firstElement = first;
	}
	public S getSecond() {return secondElement;}
	public void setSecond(S second) {
		this.secondElement = second;
	}
//toString method	
	@Override
	public String toString() {
		return String.format("(F:%s S:%s)", getFirst(), getSecond());
	}
	
	public static void main(String[] args) {
//Create a Comparator object
		Comparator<Pair<Integer, Integer>> pairCompare = new Comparator<Pair<Integer, Integer>>() {
			@Override
			public int compare(Pair<Integer, Integer> pair1, Pair<Integer, Integer> pair2) {
// distance formula -> d=√((x)²+(y)²) d1 - d2
		        double dist1 = Math.sqrt(pair1.getFirst() * pair1.getFirst()
		                    + pair1.getSecond() * pair1.getSecond());
		        double dist2 = Math.sqrt(pair2.getFirst() * pair2.getFirst()
		                    + pair2.getSecond() * pair2.getSecond());
// checking if first pair has less distance from origin than second
		        if (dist1 < dist2) {
		              return -1; // pair1 should come first
		        }
		        if (dist1 > dist2) {
		              return 1; // pair2 should come first
		        }
		        return 0; // equal pair
			}
		};
//Create an ArrayList to hold the generic objects
		ArrayList <Pair<Integer, Integer>> pairArray = new ArrayList <Pair<Integer, Integer>>();
//variable to hold random values
		Random random = new Random();
//Loop 5 times and create five generic Pair objects and add values to List		
		for(int i = 0; i < 5; i++) {
			Pair<Integer, Integer> p = new Pair<Integer, Integer>(random.nextInt(20), random.nextInt(20));
			pairArray.add(p);
		}
//Print ArrayList before sorting		
		System.out.println("List before sorting:");
		System.out.println(pairArray);
		
		System.out.println();
//Sort ArrayList according to the formula in the Comparator object pairCompare	
		Collections.sort(pairArray, pairCompare);
		System.out.printf("List after sorting: %n%s", pairArray);
	}
}
