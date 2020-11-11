import java.util.Scanner;

/**
 * Lab03a 
 * Instructions for Lab03a are in INSTRUCTIONS.md file located in the root directory of lab03a
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab02
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab02/
 * 
 * @author Mohammed Sohail
 * @version 11/11/2020
 */ 

public class Lab03a {
    public static void main(String[] args) throws Exception {

        // Initialize scanner instance
        Scanner scan = new Scanner(System.in);
        
        int numberOfEven;
        int numberOfOdd;
        int n;
        int sum;

        // Initializing the variables
        numberOfEven = 0;
        numberOfOdd = 0;
        n = 0;
        sum = 0;

        // Prompt for Value "n"
        // INSTRUCTIONS: Add statements before the loop to read the integer value n from the user.
        System.out.println("Enter value");
        n = scan.nextInt();

        // Close the scanner
        scan.close();

        // Loop from 0 to 50
        for ( int x = 0; x <= 50; x++ )
        {
            // INSTRUCTIONS: insert an if statement into the body of the loop so that:
            // INSTRUCTIONS: whenever x is not between 12 and 25 inclusive, it prints the message "out of range 12-25"  next to the value of x.
            if (x < 12 || x > 25) {
                System.out.println("x: " + x + " Out of range 12-25");
            }

            // INSTRUCTIONS: count the number of even and the number of odd values, that x takes. Report the result after the loop.
            if(x % 2 == 0) {
                numberOfEven += 1;
            }
            else {
                numberOfOdd += 1;
            }

            // INSTRUCTIONS: if x is multiple of 5 print the message "Hi Five", else if it is divisible by 2 print the message "Hi Two",
            // INSTRUCTIONS: else if it is divisible by 3 or 7 print the message "Hi ThreeOrSeven", else  print the message "Hi Others!". 
            if (x % 5 == 0) {
                System.out.println("Hi Five");
            }
            else if (x % 2 == 0) {
                System.out.println("Hi Two");
            }
            else if (x % 3 == 0 || x % 7 == 0) {
                System.out.println("Hi ThreeOrSeven");
            }
            else {
                System.out.println("Hi Others!");
            }

            // INSTRUCTIONS: sum only the values of x between 1 and n inclusive.
            if (x <= n) {
                sum += x;
            }
            
        }

        // Print out number of even and number of odd inputs
        System.out.println("Number of even inputs: " + numberOfEven);
        System.out.println("Number of odd inputs: " + numberOfOdd);
        
        // Print out sum
        System.out.println("Calculated sum: " + sum);

        // INSTRUCTIONS: After the loop, add a statement that compares the sum you computed inside the loop,
        // INSTRUCTIONS: with the result of the formula, n(n+1)/2, and print out a message saying whether they are the same or not!
        // INSTRUCTIONS: Test with various values of n.

        int resultOfFormula = (n*(n+1))/2;

        System.out.println("Result of formula: " + resultOfFormula);

        if (sum == resultOfFormula) {
            System.out.println("The sum of formula and sum calculated is SAME!");
        }
        else {
            System.out.println("The sum of formula and sum calculated is DIFFERENT!");
        }

    }
}
