import java.util.Scanner;

/**
 * Lab03b 
 * @author Mohammed Sohail
 * @version 01/11/2020
 */ 

public class App {
    public static void main(String[] args) throws Exception {
        
        // Constants
        final int FLOWER_PER_SQR_MTR = 17;   // Flowers that can be planted per square meter 

        // Variables
        double  a, b, c;            // Coordinates
        double semiPerimeter;       // Semi-perimeter of the triangle
        double gardenArea;          // Heron's formula
        double numOfFlowers;           // Plants that can be planted
        
        // Initialize scanner instance
        Scanner scan = new Scanner( System.in);

        // Prompt for Values
        System.out.println("Enter Value 1");
        a = scan.nextDouble();
        System.out.println("Enter Value 2");
        b = scan.nextDouble();
        System.out.println("Enter Value 3");
        c = scan.nextDouble();

        // Close Scanner Instance
        scan.close();

        // LAB03b STARTS HERE!
        // use the triangle inequality theorem:
        // "any side of a triangle is always shorter than the sum of the other two sides". Print a warning message and stop if the values are invalid.
        if (a >= (b + c) || b >= (a + c) || c >= (a + b)) {
            System.out.println("Warning! The values given do not conform to triangle inequality theorem. Please try again with valid values.");
        }
        else {

        // Calculate semiperimeter
        semiPerimeter = (a+b+c)/2;

        // Print out calculated values
        System.out.println("Value 1: " + a);
        System.out.println("Value 2: " + b);
        System.out.println("Value 3: " + c);
        System.out.println("semiPerimeter: " + semiPerimeter);

        // Calculate Garden Area
        gardenArea= Math.sqrt(
            (semiPerimeter * (semiPerimeter-a) * (semiPerimeter-b) * (semiPerimeter-c))
            );

        System.out.println("semiPerimeter-a: " + (semiPerimeter-a));
        System.out.println("semiPerimeter-b: " + (semiPerimeter-b));
        System.out.println("semiPerimeter-c: " + (semiPerimeter-c));
        System.out.println("gardenArea: " + gardenArea);
        
        numOfFlowers = Math.floor(gardenArea * FLOWER_PER_SQR_MTR);
        
        // Print out Garden Area and Number of Flowers
        System.out.println("Area: " + gardenArea);
        System.out.println("Numbers of flowers that can be planted: " + numOfFlowers);
        }
    }
}
