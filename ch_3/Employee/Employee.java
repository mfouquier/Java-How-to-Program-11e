package Employee;

public class Employee {
//Instance Variables 
	private String firstName;
	private String lastName;
	private double monthlySalary;

//Constructor method to initialize the instance variables
	public Employee (String firstName, String lastName, double monthlySalary) {
	this.firstName = firstName;
	this.lastName = lastName;
	if (monthlySalary > 0) {
		this.monthlySalary = monthlySalary;
		}
	}
	
//SET methods for all Instance Variables
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary > 0.00) {
			this.monthlySalary = monthlySalary;
		}
	}
//GET methods for all Instance Variables
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
//Calculate Yearly Salary
	public double getYearlySalary() {
		double yearlySalary = monthlySalary * 12;
		return yearlySalary;
	}	
//Calculate a raise 
	public void raiseSalary(double raiseAmount) {
		if (raiseAmount > 0) {
			monthlySalary = monthlySalary + (monthlySalary * raiseAmount);
		}
	}
	
	
}
