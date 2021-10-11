package savingsAccount;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class SavingsAccount {
	private static double annualInterestRate = 0.0;
	private double savingsBalance;
	
	//Overloaded constructors - Set balance to zero if no input given
	public SavingsAccount() {
		this(0);
	}
	public SavingsAccount(double savings) {
		this.setSavingsBalance(savings);
	}
	//Set Method for Savings Balance
	public void setSavingsBalance(double savings) {
		this.savingsBalance = savings;
	}
	//Get Method for Savings Balance
	public double getSavingsBalance() {
		return savingsBalance;
	}
	//Calculate Monthly Interest
	public double calculateMonthlyInterest() {
		return savingsBalance += (getSavingsBalance() * annualInterestRate) / 12;
	}
	//Change the Interest Rate
	public static void modifyInterestRate(double rate) {
		annualInterestRate= rate;
	}
	//To String Method 
	public String toString() {
		return String.format("Balance Amount: %s%n", NumberFormat.getCurrencyInstance().format(getSavingsBalance()));
	}
	
}
