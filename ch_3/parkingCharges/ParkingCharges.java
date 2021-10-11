package parkingCharges;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ParkingCharges {
	//Instance Variables
	private double hoursParked;
	private double firstThree = 2.00;
	private double threeTo24 = .50;
	private double maxCharge = 10.00;
	private String date;
	
	
	//Constructor
	public ParkingCharges(double hoursParked, String date) {
		this.hoursParked = hoursParked;
		this.date = date;
	}
	
	//SET methods 
	public void setHoursParked(double hoursParked) {
		this.hoursParked = hoursParked;
	}
	public void setDate(String date) {
		this.date = date;
	}
	//GET methods
	public double getHoursParked() {
		return hoursParked;
	}
	public String getDate() {
		return date;
	}
	
	//Charges based on the date 1 - 31
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	public static Date today = new Date();
	public static double currentCharges = 0.00;
	public static double yesterdayCharges = 0.00;
	
	//Calculate the Charges 
	public double calculateCharges() {
		double parkingCharges = 0.00;
		if (hoursParked <= 3.00) {
			parkingCharges += (Math.ceil(hoursParked)*firstThree);
				if(date.contentEquals((String)formatter.format(today))) {
					currentCharges += parkingCharges;}
				else if (date != formatter.format(today)) {
					yesterdayCharges += parkingCharges;
				}
		}
		else if(hoursParked > 3.00 && hoursParked <= 24.00) {
			double convertedHours = (Math.ceil(hoursParked)-3);
			parkingCharges += convertedHours * threeTo24 + 6.00;
			if(date.contentEquals((String)formatter.format(today))) {
				currentCharges += parkingCharges;}
			else if (date != formatter.format(today)) {
				yesterdayCharges += parkingCharges;
			}
		}
		else
			parkingCharges += maxCharge;

		return parkingCharges;
				
		}
	}
	
