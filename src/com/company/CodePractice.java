
//  -----------------------------------------------------------------------------------
//  Starting Out with Java 6th edition by Gaddis, Tony.
//  Chapter 2: Java Fundamentals
//  -----------------------------------------------------------------------------------

package com.company;

// This statement tells the Java compiler where in the Java library to find the Scanner class,
// and makes it available to your program
import java.util.Scanner;

// Imports JOptionPane for dialog boxes
import javax.swing.JOptionPane;

/**
 * This class is a listing of code that was made when reading Starting Out with Java 6th edition.
 */

// Class header.
// Class names and variable names are examples of identifiers.
// It is standard practice to capitalize the first letter of a class name, as well as the first letter of each
// subsequent word it contains. This helps differentiate the names of variables from the names of classes.
public class CodePractice {

    /**
     * The main method is the program's starting point.
     */

    // method header
    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = 30;
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);

        int x = 10;
        if (x < 20) {
            System.out.println("This is an if statement");
        }

        //
        // Chapter 2: Java Fundamentals
        //

        System.out.println("Hello World!");

        // showing the difference in print and println methods
        System.out.print("Programming is ");
        System.out.println("great fun!");

        // demo of using common escape characters
        System.out.print("These are our top sellers:\n");
        System.out.print("\tComputer games\n\tCoffee\n");
        System.out.println("\tAspirin");

        // variable declaration
        int value;

        // assignment statement
        value = 5;

        System.out.print("The value is ");
        System.out.println(value);

        // + operator.
        // When used with strings, it is called the string concatenation operator
        System.out.println("This is " + "one string.");

        int number;
        number = 5;
        // concatenate the contents of a variable to a string
        System.out.println("The value is " + number);

        // breaking the argument up into smaller string literals
        System.out.println("Enter a value that is " +
                "greater than zero and less " +
                "than 10.");

        int sum;
        sum = 249;
        System.out.println("The sum of the three " +
                "numbers is " + sum);

        // Primitive data types for numerical data.
        // These data types are called "primitive" because you cannot use them to create objects. Recall from
        // Chapter 1’s discussion on object-oriented programming that an object has attributes and methods. With
        // the primitive data types, you can only create variables, and a variable can only be used to hold a
        // single value. Such variables do not have attributes or methods.
        byte inches;                // 1 byte Integers in the range of −128 to +127
        int speed;                  // 2 bytes Integers in the range of −32,768 to +32,767
        short month;                // 4 bytes Integers in the range of −2,147,483,648 to +2,147,483,647
        long quantity;              // 8 bytes Integers in the range of −9,223,372,036,854,775,808 to
        // +9,223,372,036,854,775,807
        float salesCommission;      // 4 bytes Floating-point numbers in the range of +-3.4 × 10^−38 to +-3.4 × 10^38,
        // with 7 digits of accuracy
        double distance;            // 8 bytes Floating-point numbers in the range of +-1.7 × 10^−308 to +-1.7 × 10^308,
        // with 15 digits of accuracy

        // the integer data types
        byte miles;
        int checking;
        short minutes;
        long days;

        miles = 125;
        checking = -20;
        minutes = 120;
        days = 189000;

        System.out.println("We have made a journey of " + miles +
                " miles.");
        System.out.println("It took us " + minutes + " minutes.");
        System.out.println("Our account balance is $" + checking);
        System.out.println("About " + days + " days ago Columbus " +
                "stood on this spot.");

        // you can declare several variables of the same type by separating their names with commas
        int length, width, area;

        // floating point data types
        double price, tax, total;
        price = 29.75;
        tax = 1.76;
        total = 31.51;
        System.out.println("The price of the item " +
                "is " + price);
        System.out.println("The tax is " + tax);
        System.out.println("The total is " + total);


        // Java assumes floating-point literals to be of the double data type.
        // This code will not work -
        // float newNumber;
        // newNumber = 23.0;

        // force the literal to be a float using F
        float newNumber;
        newNumber = 23.0F;


        // floating point literals expressed in E notation for scientific notation values
        double distanceSpace, mass;
        distanceSpace = 1.495979E11;
        mass = 1.989E30;
        System.out.println("The sun is " + distanceSpace +
                " meters away.");
        System.out.println("The sun's mass is " + mass +
                " kilograms.");

        // boolean data type
        boolean bool;
        bool = true;
        System.out.println(bool);
        bool = false;
        System.out.println(bool);

        // char data type
        // character literals are enclosed using single quotation marks
        char letter;
        letter = 'A';
        System.out.println(letter);
        letter = 'B';
        System.out.println(letter);

        // Unicode. This code shows the close relationship between integers and numbers.
        char newLetter;
        newLetter = 65;
        System.out.println(newLetter);
        newLetter = 66;
        System.out.println(newLetter);

        // Variable assignment and initialization

        // declaration
        int unitsSold;

        // assignment
        unitsSold = 12;

        // can assign values to variables as part of the declaration statement. This is known as initialization.
        int newMonth = 2, newDays = 28;

        // variable flightNum is initialized to 89 and departure is initialized to 10.
        // The travelTime and distance variables remain uninitialized.
        int flightNum = 89, travelTime, departure = 10, newDistance;

        // Operators for manipulating numerical data.
        // Generally, there are three types of operators - unary, binary, and ternary.

        // unary operator
        number = -number;

        int total2 = 0, cost = 0, tax2 = 0, rate = 0, salePrice = 0, original = 0, remainder = 0;

        // binary operators
        total2 = cost + tax2;       // + Addition
        cost = total2 - tax2;       // − Subtraction
        tax2 = cost * rate;         // * Multiplication
        salePrice = original / 2;   // / Division
        remainder = value % 3;      // % Modulus

        // integer division
        // even thou number3 is declared as a double, the operands are integers. The fractional part of the result
        // will be truncated
        double number3;
        number3 = 5 / 2;
        System.out.println("The result of integer division is " + number3);

        // in order to return to a floating-point value, one of the operands must be of a floating-point data type
        double number4;
        number4 = 5.0 / 2;
        System.out.println("The result of integer division is " + number4);

        // Example of a percentage discount
        //
        double regularPrice = 59.0;
        double discount;
        double salePrice2;
        // Calculate the amount of a 20% discount.
        discount = regularPrice * 0.2;
        // Calculate the sale price by subtracting
        // the discount from the regular price.
        salePrice2 = regularPrice - discount;
        // Display the results.
        System.out.println("Regular price: $" + regularPrice);
        System.out.println("Discount amount $" + discount);
        System.out.println("Sale price: $" + salePrice2);

        // The Math class
        // The Java API provides a class named Math, which contains numerous methods that are useful for performing
        // complex mathematical operations.

        // In Java, raising a number to a power requires the Math.pow method. The method takes two double arguments.
        double result = Math.pow(4.0, 2.0);
        System.out.println("4 to the power of 2 is " + result);
        System.out.println(Math.pow(2.0, 2.0));

        //The Math.sqrt method. Takes a double argument
        System.out.println(Math.sqrt(25.0));

        //combined assignment operator
        x = x + 1;

        // conversion between primitive Data Types
        int y;
        double z = 2.5;
        // Example of a narrowing conversion, incompatible due to possible loss of data -
        // x = z;

        // widening conversion ok
        double m;
        int n = 2;
        m = n;

        // Cast operators are unary operators that appear as a data type name enclosed in a set of parentheses.
        // The operator precedes the value being converted. The contents of the variable are not changed. It only
        // returns the value stored in the variable.
        // It lets you manually convert a value, even if it means that a narrowing conversion will take place.
        int pies = 10, people = 4;
        double piesPerPerson;
        piesPerPerson = (double) pies / people;
        System.out.println("piesPerPerson is " + piesPerPerson);

        // Named constants. Constants are normally written all in capitals to make them easily distinguishable
        // from regular variable names. An initialization value must be given when declaring a variable with the
        // final modifier
        final double INTEREST_RATE = 0.069;

        // Math.PI named constant
        float radius = 3.2F;
        float area2 = (float) (Math.PI * radius * radius);
        System.out.println(area2);

        // The string class. When initialising, it becomes a class type variable. This compares to primitive
        // type variables used above.
        // The S in String is written in an uppercase letter. By convention, the first character
        // of a class name is always written in an uppercase letter.
        String greeting = "Good morning, ";
        String name = "Herman";
        System.out.println(greeting + name);

        int stringSize;
        stringSize = name.length();
        System.out.println(name + " has " + stringSize +
                " characters.");

        String message = "Java is Great Fun!";
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.charAt(2));
        System.out.println(message.length());

        /*
        This is a multi-line comment.
        That goes over more than one line.
         */

        // Reading keyboard input.
        //
        // The data type of the variable is Scanner.
        // The keyboard variable is a class type variable.
        int number2;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        //number2 = keyboard.nextInt();

        // code Listing 2-29 from the textbook
        // demonstrates more of the Scanner class methods
        String name2; // To hold a name
        int hours;
        double payRate;
        double grossPay;
        // Create a Scanner object to read input.
        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("What is your name? ");
        //name2 = keyboard2.nextLine();
        System.out.print("How many hours did you work this week? ");
        //hours = keyboard2.nextInt();
        System.out.print("What is your hourly pay rate? ");
        //payRate = keyboard2.nextDouble();
        //grossPay = hours * payRate;
        //System.out.println("Hello, " + name2);
        //System.out.println("Your gross pay is $" + grossPay);

        // Reading a single character.
        // Uses the string class’s charAt method to extract the first character of the string.
        String input;
        char answer;
        // Create a Scanner object for keyboard input.
        Scanner keyboard3 = new Scanner(System.in);
        System.out.println("Are you having fun? (Y=yes, N=no) ");
        //input = keyboard3.nextLine();   // Get a line of input.
        //answer = input.charAt(0);       // Get the first character.
        //System.out.println("You entered \"" + answer + "\"");

        // The nextLine method can take previous input (the newline character from the nextDouble method) which can
        // cause problems. As this will cause the prompt to be skipped. The below code includes a line to consume the
        // newline character to address this behaviour.
        String name3;
        int age;
        double income;
        // Create a Scanner object to read input.
        Scanner keyboard4 = new Scanner(System.in);
        System.out.println("What is your age? ");
        //age = keyboard4.nextInt();
        System.out.print("What is your annual income? ");
        //income = keyboard4.nextDouble();
        // Consume the remaining newline. It is not assigned to any variable as we do not need to keep the method's
        // return value.
        //keyboard4.nextLine();
        System.out.print("What is your name? ");
        //name3 = keyboard4.nextLine();
        //System.out.println("Hello, " + name3 + ". Your age is " +
        //       age + " and your income is $" + income);

        // Dialog boxes
        //


        String name4;
        // If the cancel button is clicked, then name will reference the special value "null".
        // This is different to pressing ok with no data entered. name will reference "" in that case.
        name4 = JOptionPane.showInputDialog("Enter your name.");

        JOptionPane.showMessageDialog(null, "Hello World");

        System.exit(0);






    }


}
