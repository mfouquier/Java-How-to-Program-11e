
import java.util.*;
import java.security.SecureRandom;

public class Liquids {

    public static void main(String[] args) {
        // make an array that holds 15 different integers representing ounces
        int[] myOunces = { 258, 58, 209, 91, 79, 182, 172, 27, 7, 29, 128, 198, 312, 424, 333 };

        // ask the user whether to use fixed array or a new one of random size

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter 1 for fixed 15-element array, 2 for random array: ");
        int selection = keyboard.nextInt();
        if (selection == 2) {
            System.out.print("Enter # of elements in array: ");
            // save the value entered by the user and make an integer array of that size
            int size = keyboard.nextInt();
            // assign that new space to the array named myOunces (declared above)
            int[] userArray = new int[size];
            // fill all locations in the array with a random value between 1 and 511.
            SecureRandom random = new SecureRandom();

            for (int counter = 0; counter < userArray.length; counter++) {
                int filler = 1 + random.nextInt(511);
                userArray[counter] += filler;
            }
            // print random array with ounces values
            System.out.println();
            System.out.println("Printing random ounce values");
            System.out.println("------------------------------");
            // call the printArrayValues() method to print the values in the array
            printArrayValues(userArray);

            // print the values in the array, as quart/ounce combinations
            System.out.println();
            System.out.println("Printing original ounces in quart/ounce format");
            System.out.println("-----------------------------------------------");
            // call the printOunces() method to print values in quart/ounce format
            printLiquids(userArray);

            // add all ounces and print the sum
            System.out.println();
            System.out.println("Ounces in this array total more than " + sumQuarts(userArray) + " quarts");
            System.out.println();

            // Ask user for minimum quarts to look for
            System.out.print("Enter number of quarts to print list over that amount: ");
            int overAmt = keyboard.nextInt();
            System.out.println();

            // find all ounces that exceed entered quarts, return that array, and print it
            int[] over = overGivenQuarts(overAmt, userArray);

            // print the values in the array, as gallon/ounce combinations
            System.out.println("Printing Amounts Over " + overAmt + " Quarts");
            System.out.println("--------------------------------");
            // call the printOunces() method to print the over array values in quart-ounce
            // format
            printLiquids(overGivenQuarts(overAmt, userArray));
            // call method to fill in gallons array
            int[] blocks = buildGallonsArray(userArray);

            // print the blocks array
            System.out.println();
            System.out.println("Printing blocks (1 gallon increments) ...");
            System.out.println();
            System.out.println("   <1   <2   <3   <4");
            System.out.println("   ---  ---  ---  ---");
            // print the blocks array contents, using printArrayValues
            for (int block : blocks)
                System.out.printf("%4d ", block);
        } else {
            // print original array with ounces values
            System.out.println("Printing original ounce values");
            System.out.println("------------------------------");
            // call the printArrayValues() method to print the values in the array
            printArrayValues(myOunces);

            // print the values in the array, as quart/ounce combinations
            System.out.println();
            System.out.println("Printing original ounces in quart/ounce format");
            System.out.println("-----------------------------------------------");
            // call the printOunces() method to print values in quart/ounce format
            printLiquids(myOunces);

            // add all ounces and print the sum
            System.out.println();
            System.out.println("Ounces in this array total more than " + sumQuarts(myOunces) + " quarts");
            System.out.println();

            // Ask user for minimum quarts to look for
            System.out.print("Enter number of quarts to print list over that amount: ");
            int overAmt = keyboard.nextInt();
            System.out.println();

            // find all ounces that exceed entered quarts, return that array, and print it
            int[] over = overGivenQuarts(overAmt, myOunces);

            // print the values in the array, as gallon/ounce combinations
            System.out.println("Printing Amounts Over " + overAmt + " Quarts");
            System.out.println("--------------------------------");
            // call the printOunces() method to print the over array values in quart-ounce
            // format
            printLiquids(overGivenQuarts(overAmt, myOunces));
            // call method to fill in gallons array
            int[] blocks = buildGallonsArray(myOunces);

            // print the blocks array
            System.out.println();
            System.out.println("Printing blocks (1 gallon increments) ...");
            System.out.println();
            System.out.println("   <1   <2   <3   <4");
            System.out.println("   ---  ---  ---  ---");
            // print the blocks array contents, using printArrayValues
            for (int block : blocks)
                System.out.printf("%4d ", block);
        }
    }

    // Place all new methods below main(); in the sequence specified in the
    // assignment description.

    public static void printArrayValues(int[] array) {
        for (int num = 0; num < array.length; num++) {
            System.out.printf("%d ", array[num]);
            if ((num + 1) % 5 == 0) {
                System.out.println();
            }
        }

    }

    public static void printLiquids(int[] array) {
        for (int num = 0; num < array.length; num++) {
            int quarts = array[num] / 32;
            double ounces = (double) array[num] / 32 - quarts;
            System.out.printf("[%2d] %5d ounces = %5d qt., %5.2f oz.%n", num, array[num], quarts, ounces);
        }
    }

    public static int sumQuarts(int[] array) {
        int total = 0;
        for (int num : array)
            total += num;
        int quarts = total / 32;
        return quarts;
    }

    public static int[] overGivenQuarts(int input, int[] array) {
        int[] overArray = new int[array.length];
        int arraySize = 0;
        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] / 32 >= input) {
                overArray[counter] += array[counter];
                arraySize++;
            }
        }

        int[] newArray = new int[arraySize];
        int i = 0;
        for (int counter = 0; counter < overArray.length; counter++) {
            if (overArray[counter] != 0) {
                newArray[i] += overArray[counter];
                i++;
            }
        }
        return newArray;
    }

    public static int[] buildGallonsArray(int[] array) {
        int[] frequency = new int[4];
        for (int num : array)
            ++frequency[num / 128];
        return frequency;
    }

}
