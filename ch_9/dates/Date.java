
public class Date {
	private static int [] dayMax = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int year;
	private int month;
	private int day;
//Constructor to create an object of class Date
	public Date(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
//Get methods to return object information
	public int getYear() {return year;}
	public int getMonth() {return month;}
	public int getDay() {return day;}
//Set method for year
	public void setYear(int year) {
		if (year < 0)
			year = 2000;
		if (year < 100)
			year += 2000;
		adjustFebMaxDay(year);
		
		this.year = year;
	}
//Set method for month	
	public void setMonth(int month) {
		if(month > 0 && month <= 12)
			this.month = month;
		else {
			this.month = 1;
			throw new IllegalArgumentException("month (" + month + ") must be 1-12");
		}
	}
//Set method for the day	
	public void setDay(int day) {
		if(day >= 1 && day <= dayMax[month - 1])
			this.day = day;
		else {
			this.day = 1;
			throw new IllegalArgumentException("day (" + day + ") out of range for the specified"
					+ "month and year");
			
		}
	}
//Method to check for a leap year and change the value in maxDay array if necessary
	private void adjustFebMaxDay(int year) {
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
			dayMax[1] = 29;
		else
			dayMax[1] = 28;
	}
//method to copy an object of Date	
	public Date(Date object) {
		this(object.year, object.month, object.day);
	}
//method to determine if two strings are equal
	public boolean equals(Date input) {
		if (this.toString().equals(input.toString()))
			return true;
		else
			return false;
	}
//method to add days to the input date	
	public Date plus(int addDays) {
		Date dateObject = new Date(this);//copies object that called plus method
		
		for (int i = 1; i <= addDays; i++) {//adds a day if +1 is less than max day
			if (getDay() + 1 <= dayMax[this.month - 1])
				setDay(++day);
			else if (getDay() + 1 > dayMax[this.month - 1] && getMonth() == 12) {//determine if it's time for a New Year
				setDay(1);
				setMonth(1);
				setYear(++year);
			}
			else if (getDay() + 1 > dayMax[this.month - 1]) {//Increment the month when the max is hit
				setDay(1);
				setMonth(++month);
			   }
		}
		return dateObject;
	}
	
//String methods to print out the various date formats
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
	public String toStringEuro() {
		return String.format("%d/%d/%d", day, month, year);
	}
	public String toStringLong() {
		String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December"};
		return String.format("%s %d, %d", months[month - 1], day, year);
	}
}
