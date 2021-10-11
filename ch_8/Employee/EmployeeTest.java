package Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee stan = new Employee("Stan", "Lee", 10000);
		Employee tony = new Employee("Tony", "Stark", -10.00);
		
//Prints out the two employees first and last names and monthly salary
		System.out.printf("%nEmployee %s %s makes %.2f per month.%n", 
				stan.getFirstName(), stan.getLastName(), stan.getMonthlySalary());
		System.out.printf("%nEmployee %s %s makes %.2f per month.%n", 
				tony.getFirstName(), tony.getLastName(), tony.getMonthlySalary());
		
//Calls the raiseSalary method to add to the monthly salary and prints the new amount
		stan.raiseSalary(0.10);
		tony.raiseSalary(0.10);
		System.out.printf("%nEmployee %s %s makes %.2f per month.%n", 
				stan.getFirstName(), stan.getLastName(), stan.getMonthlySalary());
		System.out.printf("%nEmployee %s %s makes %.2f per month.%n", 
				tony.getFirstName(), tony.getLastName(), tony.getMonthlySalary());
	}

}
