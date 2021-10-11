package parkingCharges;


public class ParkingChargesTest {

	public static void main(String[] args) {
		
		ParkingCharges park1 = new ParkingCharges(2.1, "09/19/2020");
		ParkingCharges park2 = new ParkingCharges(4.5, "09/19/2020" );
		ParkingCharges park3 = new ParkingCharges(10.5, "09/18/2020" );
		ParkingCharges park4 = new ParkingCharges(1.5, "09/18/2020" );
		ParkingCharges park5 = new ParkingCharges(.5, "09/18/2020" );
		
		park3.calculateCharges();
		park4.calculateCharges();
		park5.calculateCharges();
		
		System.out.printf("Your current parking charges are %.2f%n", park1.calculateCharges());
		System.out.printf("Your current parking charges are %.2f%n", park2.calculateCharges());
		System.out.printf("Today's charges are: $%.2f%n", ParkingCharges.currentCharges);
		System.out.printf("Yesterday's charges are: $%.2f%n", ParkingCharges.yesterdayCharges);
		
	}

}
