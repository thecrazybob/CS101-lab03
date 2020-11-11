import java.util.Scanner;
import java.nio.file.*;
import java.io.*;

/**
 * Lab03c 
 * Instructions for Lab03c are in INSTRUCTIONS.md file located in the root directory of lab03c
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab03
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab03/
 * 
 * @author Mohammed Sohail
 * @version 11/11/2020
 */ 

public class Lab03c {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);
        
        // constants
        final String NEWLINE = System.getProperty("line.separator");
        final String START_HTML = "<html>";
        final String CLOSE_HTML = "</html>";
        final String START_HEAD = "<head>";
        final String CLOSE_HEAD = "</head>";
        final String START_TITLE = "<title>";
        final String CLOSE_TITLE = "</title>";
        final String START_BODY = "<body>";
        final String CLOSE_BODY = "</body>";
        final String HR = "<hr>";
        final String START_H1 = "<h1>";
        final String CLOSE_H1 = "</h1>";
        final String START_P = "<p>";
        final String CLOSE_P = "</p>";

        // variables
        String name;
        int age;
        double salary;
        String comments;
        double tax_rate;
        double net_salary;

        // HTML code for the profile picture (img tag)
        String profile_picture_html;

        // Is there a profile picture available?
        boolean profile_picture_available;

        // program code

        // Prompt for Values - COMMENT THESE OUT FOR HTML OUTPUT
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
        
        // Close scanner instance
        scan.close();

        // LAB03c STARTS HERE

        // Modify tax_rate based on salary
        if (salary < 1000) {
            tax_rate = 5;
        }
        else if (salary > 5000) {
            tax_rate = 25;
        }
        else {
            tax_rate = 15;
        }

        // INSTRUCTIONS: Consider the salary value entered by the user to be the gross salary.
        // INSTRUCTIONS: Compute the employee's net salary by subtracting a fixed amount of $100 and then take off 15% tax from what is left.
        // INSTRUCTIONS: On the webpage, display the net salary value (together with the tax rate between brackets) instead of the gross salary.
        net_salary = (salary - 100) * (1-(tax_rate/100));

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

        profile_picture_html = "<img src=\"taz.jpg\">";
        profile_picture_available = Files.exists(Paths.get("taz.jpg"));

        if (!profile_picture_available) {
            profile_picture_html = "";
        }

        System.setOut(  new PrintStream( "magic.htm" ) );
        // LAB03c ends here

        // Print out HTML result
        System.out.println("<!DOCTYPE html>"
        + START_HTML
        + NEWLINE
        + START_HEAD
        + NEWLINE
        + START_TITLE + name + "'s Home Page" + CLOSE_TITLE
        + NEWLINE
        + CLOSE_HEAD
        + NEWLINE
        + START_BODY
        + NEWLINE
        + HR
        + NEWLINE
        + profile_picture_html
        + NEWLINE
        + START_H1 + name + CLOSE_H1
        + NEWLINE
        + START_P + "Age: " + age + CLOSE_P
        + NEWLINE
        + START_P + "Net Salary: " + net_salary + " (" + tax_rate + "% tax)" + CLOSE_P
        + NEWLINE
        + START_P + "Comments: " + comments + CLOSE_P
        + NEWLINE
        + HR
        + NEWLINE
        + CLOSE_BODY
        + NEWLINE
        + CLOSE_HTML
        + NEWLINE
        );

        System.out.close();
        System.setOut( originalStdOut );
        System.out.println( "Webpage created.");

    }
}
