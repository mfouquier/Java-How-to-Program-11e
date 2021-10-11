package lineOfCode;

//a Extend class Employee
public class PieceWorker extends Employee{

//c call superclass Employee constructor
	public PieceWorker(String first, String last, int ssn) {
		super(first, last, ssn);
	}
//b call super class Employee toString from the sub class toString
	@Override
	public String toString() {
		return String.format("%s%n%s", "Calling super class's toString method:", super.toString());
	}
}
