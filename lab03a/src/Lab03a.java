import java.util.Scanner;

/**
 * Lab03a 
 * Instructions for Lab03a are in INSTRUCTIONS.md file located in the root directory of lab03a
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab03
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab03/
 * 
 * @author Mohammed Sohail
 * @version 11/11/2020
 */ 

public class Lab03a {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        
        // variables
        int number_of_even;
        int number_of_odd;
        int user_given_value_n;
        int sum;
        int result_of_formula;

        // program code

        // Initializing the variables
        number_of_even = 0;
        number_of_odd = 0;
        user_given_value_n = 0;
        sum = 0;

        // Prompt for Value "n"
        // INSTRUCTIONS: Add statements before the loop to read the integer value n from the user.
        System.out.println("Enter value");
        user_given_value_n = scan.nextInt();

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
                number_of_even += 1;
            }
            else {
                number_of_odd += 1;
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
            if (x <= user_given_value_n) {
                sum += x;
            }
            
        }

        // Print out number of even and number of odd inputs
        System.out.println("Number of even inputs: " + number_of_even);
        System.out.println("Number of odd inputs: " + number_of_odd);
        
        // Print out sum
        System.out.println("Calculated sum: " + sum);

        // INSTRUCTIONS: After the loop, add a statement that compares the sum you computed inside the loop,
        // INSTRUCTIONS: with the result of the formula, n(n+1)/2, and print out a message saying whether they are the same or not!
        // INSTRUCTIONS: Test with various values of n.

        // Calculate result of formula
        result_of_formula = (user_given_value_n*(user_given_value_n+1))/2;

        // Print out result of formula
        System.out.println("Result of formula: " + result_of_formula);

        // Print out customised messaged depending on result of formula
        if (sum == result_of_formula) {
            System.out.println("The sum of formula and sum calculated is SAME!");
        }
        else {
            System.out.println("The sum of formula and sum calculated is DIFFERENT!");
        }

    }
}
