import java.security.SecureRandom;
//Takes a while to roll 36,000,000 times 

public class DiceRolling {
	//set variable for SecureRandom
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public static void main(String[] args) {
		//Create an Array that contains 36,000,000 elements
		int [] diceTotal = new int[36_000_000];
		for (int i = 0; i < 36_000_000; i++) {//iterate through all elements 
			int die1 = 1 + randomNumbers.nextInt(6);//roll die generate number 1 - 6
			int die2 = 1 + randomNumbers.nextInt(6);
			int total = die1 + die2;// Add the total of the die rolls
			diceTotal[i] = total;//Add the total to the index position of i in Array diceTotal
		}
		
		int [] frequency = new int[13];//create an Array to hold 13 elements
		
		for (int total = 0; total < diceTotal.length; total++) {//iterates through all 60,000,000 elements of diceTotal
			++frequency[diceTotal[total]];//Gets the value of diceTotal in each index position - the value returned 
		}								  //will then increment the corresponding index of frequency by one
		
		System.out.printf("%s%10s%n", "Dice Roll", "Frequency" );//sets the headers
		for (int roll = 2; roll < frequency.length; roll++) {//starting at index 2 of frequency we only want 2 - 12
			System.out.printf("%5d%12d%n", roll, frequency[roll]);//prints the dice roll and the frequency of that roll
		}
		
	}
}
