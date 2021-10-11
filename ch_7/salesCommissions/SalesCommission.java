package salesCommissions;

public class SalesCommission {
	private String department;
	private int [] sales; //array for sales
	private int [] calculatedSalary;
	
	//constructor
	public SalesCommission(String department, int[] sales) {
		this.department = department;
		this.sales = sales;
	}
	
	//GET and SET department methods
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	
	
	public void setCalculatedSalary() { 
		for (int i = 0; i < sales.length; i++) {
			System.out.printf("Salesman %2d: $%3d%n", i + 1, (int)(sales[i] * .09) + 200);
		}
	}

	public void outputCommissions() {
		System.out.println("Commission plus Salary distribution");
		int x = 0;
		int [] frequency = new int[9];
		for (int sale = 0; sale < sales.length; sale++)
			x += (int)((sales[sale] * .09) + 200 )/ 100;
				if (x < 10) { 
					++frequency[x];
				}
				else {++frequency[8];}
		for (int count = 0; count < frequency.length; count++) {
			if (count == 8) {
				System.out.print("$1000 and over: ");
			}
			else {
				System.out.printf("$%d-$%d: ", count * 100 + 200, count * 100 + 299);
			}
			for (int stars = 0; stars < frequency[count]; stars++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		
	}
}