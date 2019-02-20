/**
 * -----------------------------------------------------------------------------------
 * Starting Out with Java 6th edition by Gaddis, Tony.
 * Chapter 3: Decision Structures
 * ----------------------------------------------------------------------------------- *
 */

package com.company;

// Imports JOptionPane for dialog boxes
import javax.swing.JOptionPane;

import java.util.Scanner;

// Class header
public class Chapter03DecisionStructures {

    // Method header
    public static void main(String args[]) {

        // Relational Operators (in order of precedence)
        // All the relational operators are binary with two operands.
        //
        // > Greater than
        // < Less than
        // >= Greater than or equal to
        // <= Less than or equal to
        // == Equal to
        // != Not equal to


        // An example of the if statement
        // Conditionally executes a single statement. The braces to form a block are not needed.
        int score1;
        String input;
        //input = JOptionPane.showInputDialog("Enter score:");
        //score1 = Integer.parseInt(input);
        score1 = 79;

        //System.out.println("Your score is " + score1);

        if (score1 >= 75)
            System.out.println("Well done, you have received a distinction.");

        // Checkpoint 3.7
        // Write an if statement that displays “Goodbye” if the variable myCharacter contains the character 'D'.
        char mycharacter = 'd';
        if (mycharacter == 'd')
            System.out.println("Goodbye");

        // Checkpoint 3.9
        // Write an if-else statement that assigns 1 to x when y is equal to 100. Otherwise, it should assign 0 to x.
        int y = 100;
        int x;
        if (y == 100)
            x = 1;
        else
            x = 0;


        // The if-else statement
        // Multiple statements being executed requires a block defined by braces.
        double number1 = 10;
        double number2 = 0;
        double quotient;

        if (number2 == 0) {
            System.out.println("Division by zero not possible.");
            System.out.println("Please run the program again.");
        } else {
            quotient = number1 / number2;
            System.out.println("The quotient of " + number1);
            System.out.println("divided by " + number2);
            System.out.println("is " + quotient);
        }

        // Nested if statements
        //
        int testScore; // Numeric test score
        testScore = 80;

        // Display the grade.
        if (testScore < 60) {
            JOptionPane.showMessageDialog(null, "Your grade is F.");
        } else {
            if (testScore < 70) {
                JOptionPane.showMessageDialog(null, "Your grade is D.");
            } else {
                if (testScore < 80) {
                    JOptionPane.showMessageDialog(null, "Your grade is C.");
                } else {
                    if (testScore < 90) {
                        //JOptionPane.showMessageDialog(null, "Your grade is B.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Your grade is A.");
                    }
                }
            }
        }

        // The if-else-if statement. It makes certain nested decision logic simpler to write.
        // This example shows the above code re-written.
        // The last else clause, which does not have an if statement following it, is referred to as the
        // trailing else. The trailing else is optional, but in most cases you will use it. It can be used to catch
        // code errors, as shown below (if the testScore is greater than 100).
        //
        int testScore2; // Numeric test score
        //String input;
        //input = JOptionPane.showInputDialog("Enter your numeric " + "test score and I will tell you the grade: ");
        //testScore = Integer.parseInt(input);
        testScore2 = 85;

        if (testScore2 < 60)
            JOptionPane.showMessageDialog(null, "Your grade is F.");
        else if (testScore2 < 70)
            JOptionPane.showMessageDialog(null, "Your grade is D.");
        else if (testScore2 < 80)
            JOptionPane.showMessageDialog(null, "Your grade is C.");
        else if (testScore2 < 90)
            //JOptionPane.showMessageDialog(null, "Your grade is B.");
            ;
        else if (testScore2 <= 100)
            JOptionPane.showMessageDialog(null, "Your grade is A.");
        else {
            JOptionPane.showMessageDialog(null, "Invalid score.");
        }

        // Logical operators
        // &&   AND
        // ||   OR
        // !    NOT

        double salary = 30000;
        int yearsOnJob = 2;
        if (salary >= 3000 && yearsOnJob >= 2) {
            System.out.println("You qualify for the loan");
        } else {
            System.out.println("You do not qualify for the loan");
        }

        // You can also use logical operators with boolean variables.
        boolean isValid = true;
        if (isValid && yearsOnJob == 2) {
            System.out.println("It is valid.");
        }

        // The ! operator performs a logical NOT operation.
        isValid = false;
        if (!(isValid)) {
            System.out.println("It is not valid.");
        }

        // Checking numeric Ranges with logical operators
        // It is best to use the && operator when checking if a number is inside a range
        x = 25;
        if (x >= 20 && x <= 40)
            System.out.println(x + " is in the acceptable range.");

        // It is best to use the || operator when checking if a number is outside a range
        x = 18;
        if (x < 20 || x > 40)
            System.out.println(x + " is outside the acceptable range.");

        // To compare the contents of two string objects correctly, you should use the String class’s
        // equals method. This method does a case sensitive comparision.
        String name1 = "Mark";
        String name2 = "Mary";
        if (name1.equals(name2))
            System.out.println("The strings " + name1 + " and " + name2 + " are equal.");
        else
            System.out.println("The strings " + name1 + " and " + name2 + " are not equal.");

        // Comparing a string object with a string literal
        if (name1.equals("Mark")) {
            System.out.println("The string " + name1 + " equals \"Mark\".");
        }

        // With the ! operator
        if (!name2.equals("Mark"))
            System.out.println("The string " + name2 + " does not equal \"Mark\".");

        // The compareTo method. It is a case sensitive comparison.
        // It works by comparing the strings, beginning with the first, or leftmost, characters.
        // If one of the strings is shorter than the other, Java can only compare the corresponding characters.
        if (name1.compareTo(name2) == 0)
            System.out.println("The strings " + name1 + " and " + name2 + " are equal.");

        if (name1.compareTo(name2) < 0)
            System.out.println("The string " + name1 + " is less than " + name2);

        if (name1.compareTo(name2) > 0)
            System.out.println("The string " + name1 + " is greater than " + name2);

        //  The equalsIgnoreCase and compareToIgnoreCase methods ignore case.
        if (name1.equalsIgnoreCase("mark")) {
            System.out.println("The strings " + name1 + " and \"mark\" are equal (case ignored).");
        }
        if (name1.compareToIgnoreCase(name2) < 0) {
            System.out.println("The string " + name1 + " is less than " + name2 + " (case ignored).");
        }

        // Checkpoint 3.21
        // Assume the variables name1 and name2 reference two different String objects, containing different strings.
        // Write code that displays the strings referenced by these variables in alphabetical order.
        name1 = "Blue";
        name2 = "Green";

        if (name1.compareTo(name2) <= 0) {
            System.out.println(name1);
            System.out.println(name2);
        } else {
            System.out.println(name2);
            System.out.println(name1);
        }


        // The switch statement
        // The testExpression is a variable or an expression that gives a char, byte, short, int, or string value.
        // The break statement is used to make the program exit out of the switch statement. If break is not used,
        // the program will continue to execute all of the lines from the matching case statement until the end
        // of the block.
        //input = "spring";
        input = "winter";
        // Translate the season to Spanish.
        switch (input) {
            case "spring":
                System.out.println("la primavera");
                break;
            case "summer":
                System.out.println("el verano");
                break;
            case "autumn":
            case "fall":
                System.out.println("el otono");
                break;
            case "winter":
                System.out.println("el invierno");
                break;
            default:
                System.out.println("Please enter one of these words:\n"
                        + "spring, summer, autumn, fall, or winter.");
        }

        // Checkpoint 3.24
        //input = JOptionPane.showInputDialog("Enter a number: ");
        //int userNum = Integer.parseInt(input);
        int userNum;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter one of the numbers " +
                "1, 2, or 3: ");
        userNum = keyboard.nextInt();

        switch (userNum){
            case 1:
                System.out.println("The variable userNum is one.");
                break;
            case 2:
                System.out.println("The variable userNum is two.");
                break;
            case 3:
                System.out.println("The variable userNum is three.");
                break;
            default:
                System.out.println("The variable is not in the range of 1, 2 or 3.");
        }

        // Checkpoint 3.25
        // Rewrite the following if-else-if statement as a switch statement
        char selection = 'C';


        if (selection == 'A')
            System.out.println("You selected A.");
        else if (selection == 'B')
            System.out.println("You selected B.");
        else if (selection == 'C')
            System.out.println("You selected C.");
        else if (selection == 'D')
            System.out.println("You selected D.");
        else
            System.out.println("Not good with letters, eh?");






        double temp1 = 72.5, temp2 = 83.7;
        System.out.printf("The temperatures are %f and %f degrees.\n", temp1, temp2);

        int dogs = 2;
        int cats = 4;
        System.out.printf("We have %d dogs and %d cats.\n", dogs, cats);








        System.exit(0);
    }
}

