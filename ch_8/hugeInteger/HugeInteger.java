package ch8.hugeInteger;
import java.util.Arrays;


public class HugeInteger
{
  private int[] intArray; // empty array
  //final int MAX = 40;
  private int numDigits;  // stores the number of digits in intArray

  public HugeInteger(String s) //constructor that takes a String parameter
  {
    intArray = new int[40];
    numDigits = 0;
    this.parse(s);
  }

  public HugeInteger( ) //empty constructor
  {
    intArray = new int[40];
    numDigits = 0;
   
  }
  
  public int getDigit(int i) {
	  return (i>=this.numDigits) ? 0:this.intArray[i];
  }
  
  public void parse(String s) { //parse will add each digit to intArray
	  numDigits = s.length();//numDigits updated to length of String s
	  if(numDigits > 40) { // checks input is less than 40 digits
		  throw new IllegalArgumentException("Input must be 40 characters or less.");
	  }
	  else if (s.contains("-")) { //checks that input is not negative
		  throw new IllegalArgumentException("Must be a positive value.");
	  }
		  else {
			  for (int i = intArray.length - 1; i >= 0; i--) {
				  intArray[i] = 0;
			  }
			  
			  for(int x = 0; x < numDigits; x++) {
				char digit = s.charAt(x); 
				int a = Character.getNumericValue(digit); 
				intArray[intArray.length - numDigits + x] = a;
			  } 
		  } 
	  }

	  

  public static HugeInteger add(HugeInteger hugeInt1, HugeInteger hugeInt2)
  {
	  int numDigits = hugeInt1.numDigits;
	  HugeInteger h3 = new HugeInteger();// Create hugeInt3
      int length = 0;
 //Checks the array lengths then assigns that value - 1  to length
      if (hugeInt1.intArray.length > hugeInt2.intArray.length) {
    	  length = hugeInt1.intArray.length;
      }
      else {
    	  length = hugeInt2.intArray.length - 1;
      }
 //Loop through array and adds each value 
      for(int i = length; i >= 0; i--) {
    	   h3.intArray[i] = hugeInt1.intArray[i] + hugeInt2.intArray[i];
  /*if the two ints sum is greater than or equal 10 and the index is greater than 1
  * the sum - 10 will be placed in h3 and the next index of array h1 will be incremented 
  by one.*/
    	   if(hugeInt1.intArray[i] + hugeInt2.intArray[i] >= 10 && i > hugeInt1.intArray.length - numDigits + 1) {
    		  h3.intArray[i] = hugeInt1.intArray[i] + hugeInt2.intArray[i] - 10;
    		  hugeInt1.intArray[i-1]++;
    	  }
  /*If the index is one the same will happen only index 0 will not be incremented 
   * by 1.*/
    	  else if (hugeInt1.intArray[i] + hugeInt2.intArray[i] >= 10 && i == hugeInt1.intArray.length - hugeInt1.numDigits + 1) {
    		  h3.intArray[i] = hugeInt1.intArray[i] + hugeInt2.intArray[i] - 10;
    	  }
  // If the sums of index one are >= 10 then the sums of index 0 will get +1 
    	  else if (hugeInt1.intArray[hugeInt1.intArray.length - hugeInt1.numDigits + 1] + hugeInt2.intArray[hugeInt1.intArray.length - hugeInt1.numDigits + 1] >= 10 && i == hugeInt1.intArray.length - hugeInt1.numDigits) {
    		  h3.intArray[i] = hugeInt1.intArray[i] + hugeInt2.intArray[i] + 1;
    	  }
  // If the sum is not >= 10 then the sum is simply added to h3
    	  else {
    		  h3.intArray[i] = hugeInt1.intArray[i] + hugeInt2.intArray[i];
    	  }
      }
     
      return h3;   
  }
  
  public static HugeInteger subtract(HugeInteger h1, HugeInteger h2)
  {
	  HugeInteger hugeInt1 = new HugeInteger(h1.toString());
	  HugeInteger hugeInt2 = new HugeInteger(h2.toString());
	  HugeInteger h3 = new HugeInteger();// Create hugeInt3
	  
	  int length = 0;
//Checks the array lengths then assigns that value - 1  to length	  
      if (hugeInt1.intArray.length > hugeInt2.intArray.length) {
    	  length = hugeInt1.intArray.length - 1;
      }
      else {
    	  length = hugeInt2.intArray.length - 1;
      }
      
 //Checks if h1 > h2 if so, method will be h1 - h2 Uses method isGreaterThan 
      if (isGreaterThan(hugeInt1, hugeInt2)) {
	      //Loop through the arrays to find the difference
    	  for(int i = length; i >= 0; i--) {
/*if h1 is less than h2 the 10 will be added to the int at index i then subtracted
 *and the next index of array h1 will be decremented by one.*/
    		  int num1 = hugeInt1.intArray[i];
    		  int num2 = hugeInt2.intArray[i];
    		  if(num1 < num2) {
	    		  h3.intArray[i] = (num1 + 10) - num2;	
	    		  num1 = hugeInt2.intArray[i-1]--;
	    	  }
	    	
	    	  else {
	    		  h3.intArray[i] = num1 - num2;
	    	  }
	      }
      }
      else {
    	  for(int i = length; i >= 0; i--) {
    		  int num1 = hugeInt2.intArray[i];
    		  int num2 = hugeInt1.intArray[i];
    		  if(num1 < num2) {
	    		  h3.intArray[i] = (num1 + 10) - num2;	
	    		  num1 = hugeInt2.intArray[i-1]--;
	    	  }
	    	  else {
	    		  h3.intArray[i] = num1 - num2;
	    	  }
	      }
      }
      return h3;   
  }

 
  public static boolean isEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
  {
      for (int i = 0; i < hugeInt1.intArray.length; i++) {
          if (hugeInt1.intArray[i] != hugeInt2.intArray[i])
              return false;
      }
      return true;
  }

  public static boolean isNotEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
  {	  
	  for (int i = 0; i < hugeInt1.intArray.length; i++) {
          if (hugeInt1.intArray[i] != hugeInt2.intArray[i])
              return true;
      }
      return false;

  }
  
  public static boolean isGreaterThan(HugeInteger hugeInt1, HugeInteger hugeInt2)
  {
	  for (int i = 0; i < hugeInt1.intArray.length; i++) {
          if (hugeInt1.intArray[i] > hugeInt2.intArray[i]) 
        	  return true;
          else if (hugeInt2.intArray[i] > hugeInt1.intArray[i])
        	  return false;
      }
      return false;

  }
  
  public static boolean isLessThan(HugeInteger hugeInt1, HugeInteger hugeInt2)
  {
	  for (int i = 0; i < hugeInt1.intArray.length; i++) {
          if (hugeInt1.intArray[i] > hugeInt2.intArray[i])
              return false;
          else if(hugeInt2.intArray[i] > hugeInt1.intArray[i])
        	  return true;
      }
      return false;
  }

  public static boolean isGreaterThanOrEqualTo(HugeInteger hugeInt1, HugeInteger hugeInt2)
  {
    for (int i = 0; i < hugeInt1.intArray.length; i++) {
          if (hugeInt1.intArray[i] < hugeInt2.intArray[i])
              return false;
      }
      return true;
  }

  public static boolean isZero(HugeInteger hugeInt1 )
  {
	  for (int i = 0; i < hugeInt1.intArray.length; i++) {
	          if (hugeInt1.intArray[i] > 0)
	              return false;
	      }
	      return true;
  }
  
  public int getInteger() {
	  int firstInteger = 0;
	  for (int i = 0; i < this.intArray.length; i++) {
		  if (this.intArray[i] > 0) {
			firstInteger = i;
		  	break;
		  }
	  }
	  return firstInteger;
  }
  @Override
  public String toString()
  {
	 String s = "";
     for (int i = this.getInteger(); i < this.intArray.length; i++)
    	 s += this.intArray[i];
	 return s;
  } 
}
