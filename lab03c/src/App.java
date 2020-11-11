import java.util.Scanner;
import java.nio.file.*;
import java.io.*;

/**
 * Lab03c 
 * @author Mohammed Sohail
 * @version 01/11/2020
 */ 

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        // Variables
        String name;
        int age;
        double salary;
        String comments;

        // Prompt for Values - COMMENT THESE OUT FOR HTML OUTPUT
        Scanner scan = new Scanner(System.in);
        PrintStream originalStdOut = System.out;
        
        System.out.println("Please type the name of the employee: ");
        name = scan.nextLine();
        System.out.println("Please type the age of the employee: ");
        age = scan.nextInt();
        System.out.println("Please type the salary of the employee: ");
        salary = scan.nextInt();
        System.out.println("Please type comments about the employee: ");
        scan.nextLine();
        comments = scan.nextLine();
        
        scan.close();

        // LAB03c STARTS HERE

        // INSTRUCTIONS: Rather than have a constant 15% tax rate for all, the government decides to take only 5% from employees earning below $1000 gross, but to take 25% from those earning more than $5000. Implement this.
        double taxRate = 15;

        if (salary < 1000) {
            taxRate = 5;
        }
        else if (salary > 5000) {
            taxRate = 25;
        }

        // INSTRUCTIONS: Consider the salary value entered by the user to be the gross salary.
        // INSTRUCTIONS: Compute the employee's net salary by subtracting a fixed amount of $100 and then take off 15% tax from what is left.
        // INSTRUCTIONS: On the webpage, display the net salary value (together with the tax rate between brackets) instead of the gross salary.
        double netSalary = (salary - 100) * (1-(taxRate/100));

        // INSTRUCTIONS: Check that the user has entered a positive value for the age.
        // INSTRUCTIONS: Print an error message and stop if they haven't. Do the same for salary, but make sure it is also less than a maximum, say $10000 for example.
        if (age <= 0) {
            System.out.println("The value provided for age is invalid");
            System.exit(1);
        }
        if (salary <= 0) {
            System.out.println("The value provided for salary is invalid");
            System.exit(1);
        }
        if (salary >= 10000) {
            System.out.println("The value provided for salary is more than the maxsimum limit");
            System.exit(1);
        }

        String profilePictureHTML = "<img src=\"taz.jpg\">";
        boolean profilePicture = Files.exists(Paths.get("taz.jpg"));

        if (!profilePicture) {
            profilePictureHTML = "";
        }

        System.setOut( new PrintStream( "magic.htm" ) );
        // LAB03c ends here

        String newLine = System.getProperty("line.separator");

        // Print out HTML result
        System.out.println("<!DOCTYPE html>"
        +"<html>"
        + newLine
        +"<head>"
        + newLine
        +"<title>" + name + "'s Home Page</title>"
        + newLine
        +"</head>"
        + newLine
        +"<body>"
        + newLine
        +"<hr>"
        + newLine
        + profilePictureHTML
        + newLine
        +"<h1>" + name + "</h1>"
        + newLine
        +"<p>Age: " + age + "</p>"
        + newLine
        +"<p>Net Salary: " + netSalary + " (" + taxRate + "% tax)</p>"
        + newLine
        +"<p>Comments: " + comments + "</p>"
        + newLine
        +"<hr>"
        + newLine
        +"</body>"
        + newLine
        +"</html>"
        + newLine
        );

        System.out.close();
        System.setOut( originalStdOut);
        System.out.println( "Webpage created.");

    }
}
