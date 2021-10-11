package Date;

public class Date {
//Instance Variables 	
	private int month;
	private int day; 
	private int year;

//Constructor that initializes the instance variables
	public Date(int month, int day, int year) {
		if (month > 0 && month <= 12) {
			this.month = month;
		}
		if (day > 0 && day <= 31) {
			this.day = day;
		}
		if (year > 0 && year < 9999) {
			this.year = year;
		}
	}
//SET methods for all the instance variables
	public void setMonth(int month) {
		if (month > 0 && month <= 12) {
			this.month = month;
		}
	}
	public void setDay(int day) {
		if (day > 0 && day <= 31) {
			this.day = day;
		}
	}
	public void setYear(int year) {
		if (year > 0 && year < 9999) {
			this.year = year;
		}
	}

//GET methods for all the instance variables
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	
//Method to display the date in MM/DD/YYYY format
	public void displayDate() {
		System.out.printf("%d%s%d%s%d%n%n", month, "/", day, "/", year);
	}
}
