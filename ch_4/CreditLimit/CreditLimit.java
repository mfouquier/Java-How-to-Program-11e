package CreditLimit;

public class CreditLimit {
	private int accountNumber;
	private int balance;
	private int monthlyCharges;
	private int monthlyCredits;
	private int creditLimit;
	
//Constructor method to initialize the instance variables
	public CreditLimit(int accountNumber, int balance, int monthlyCharges,
			int monthlyCredits, int creditLimit) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.monthlyCharges = monthlyCharges;
		this.monthlyCredits = monthlyCredits;
		this.creditLimit = creditLimit;
	}

//Set methods for all of the instance Variables
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setMonthlyCharges(int monthlyCharges) {
		this.monthlyCharges = monthlyCharges;
	}
	public void setMonthlyCredits(int monthlyCredits) {
		this.monthlyCredits = monthlyCredits;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
//Get methods for all the instance variables
	public int getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public int getMonthlyCharges() {
		return monthlyCharges;
	}
	public int getMonthlyCredits() {
		return monthlyCredits;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
//Calculate new balance based on monthly credits and charges
	public void calculateBalance() {
		balance -= monthlyCredits;
		balance += monthlyCharges;
		System.out.printf("Your current balance is $%d%n", balance);
	}
//Check if balance exceeds credit limit
	public void creditCheck() {
		if (balance > creditLimit) {
			System.out.println("Credit Limit Exceeded");
		}
		else {
			System.out.printf("Your current balance is $%d and your "
					+ "credit limit is $%d%n", balance, creditLimit);
		}
	}
}
