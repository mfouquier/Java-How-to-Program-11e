package Date;

public class DateTest {

	public static void main(String[] args) {
//Create an object of the Date class
		Date date1 = new Date(10, 22, 1978);
		Date date2 = new Date(12, 31, 2020);
		Date date3 = new Date(13, 33, 88888);
		date1.displayDate();
		date2.displayDate();
		date3.displayDate();
	}

}
