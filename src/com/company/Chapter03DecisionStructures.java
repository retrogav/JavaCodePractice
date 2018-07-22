/**
 * -----------------------------------------------------------------------------------
 * Starting Out with Java 6th edition by Gaddis, Tony.
 * Chapter 3: Decision Structures
 * ----------------------------------------------------------------------------------- *
 */

package com.company;

// Imports JOptionPane for dialog boxes

import javax.swing.JOptionPane;

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
                        JOptionPane.showMessageDialog(null, "Your grade is B.");
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
            JOptionPane.showMessageDialog(null, "Your grade is B.");
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
        if(isValid && yearsOnJob == 2)
        {
            System.out.println("It is valid.");
        }

        // The ! operator performs a logical NOT operation.
        isValid = false;
        if(!(isValid))
        {
            System.out.println("It is not valid.");
        }

        if (x >= 20 && x <= 40)
            System.out.println(x + " is in the acceptable range.");






        System.exit(0);
    }
}

