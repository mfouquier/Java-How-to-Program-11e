package savingsAccount;

public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		int [] months = new int [12];
		
		System.out.println(saver1);
		System.out.println(saver2);
		//Interest Rate at 4%
		SavingsAccount.modifyInterestRate(.04);
		
		System.out.printf("%s%10s%n", "Month", "Balance");
		for (int month = 0; month < months.length; month++) {
			System.out.printf("%4d %5s%.2f%n", 1 + month, "$", saver1.calculateMonthlyInterest());
		}
		System.out.printf("Saver 1 balance $%.2f%n", saver1.getSavingsBalance());
		
		System.out.println();
		System.out.printf("%s%10s%n", "Month", "Balance");
		for (int month =0; month < months.length; month++) {
			System.out.printf("%4d %5s%.2f%n", 1 + month, "$", saver2.calculateMonthlyInterest());
		}
		System.out.printf("Saver 2 balance $%.2f%n", saver2.getSavingsBalance());
		
		//Interest Rate at 5%
		System.out.println();
		SavingsAccount.modifyInterestRate(.05);
		
		System.out.printf("%s%10s%n", "Month", "Balance");
		for (int month = 0; month < months.length; month++) {
			System.out.printf("%4d %5s%.2f%n", 1 + month, "$", saver1.calculateMonthlyInterest());
		}
		System.out.printf("Saver 1 balance $%.2f%n", saver1.getSavingsBalance());
		
		System.out.println();
		System.out.printf("%s%10s%n", "Month", "Balance");
		for (int month =0; month < months.length; month++) {
			System.out.printf("%4d %5s%.2f%n", 1 + month, "$", saver2.calculateMonthlyInterest());
		}
		System.out.printf("Saver 2 balance $%.2f%n", saver2.getSavingsBalance());
	}

}
