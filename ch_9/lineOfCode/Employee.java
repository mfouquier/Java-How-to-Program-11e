package lineOfCode;

public class Employee {
	private final String first;
	private final String last;
	private final int ssn;
	
	public Employee(String first, String last, int ssn) {
		this.first = first;
		this.last = last;
		this.ssn = ssn;
	}
	
	@Override
	public String toString() {
		return String.format("%s", "Employee toString");
	}
}
