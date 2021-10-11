package CreditLimit;

public class CreditLimitTest {

	public static void main(String[] args) {
//Create an account starting at all 0's and a limit of 500
		CreditLimit account1 = new CreditLimit(1, 0, 0, 0, 500);
//Test account 1 - add $25 in charges and $15 in credits then print balance
		account1.setMonthlyCharges(550);
		account1.setMonthlyCredits(50);
		account1.calculateBalance();
		account1.creditCheck();
	}

}
