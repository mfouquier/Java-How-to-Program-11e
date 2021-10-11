import java.security.SecureRandom;//Import the Secure Random class

public class Sets
{
	public static void main(String[] args) {
		SecureRandom randomSet = new SecureRandom();//create a random variable
		
		int evens = 2 + 2 *randomSet.nextInt(5);//random number 0-4 * 2 + 2
		int odds = 3 + 2 * randomSet.nextInt(5);//random number 0-4 * 2 + 3
		int fours = 6 + 4 * randomSet.nextInt(5);//random number 0-4 * 4 + 6
		
		System.out.println(evens);//Randomly prints 2,4,6,8,10
		System.out.println(odds);//Randomly prints 3,5,7,9,11
		System.out.println(fours);//Randomy prints 6,10,14,18,22
	}
}

