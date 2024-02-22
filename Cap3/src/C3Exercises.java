import java.util.Scanner;

public class C3Exercises {

    public static void exercise1(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

        if (discriminant > 0) {
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            System.out.println("The equation has one root " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }

    public  static void exercise2(){
        //(Game: multiply three numbers) The program in Listing 3.1, AdditionQuiz.java,
        //generates two integers and prompts the user to enter the product of these two integers
        // Revise the program to generate three single-digit integers and prompt the user
        //to enter the multiplication of these three integers.
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " * " + number2 + " * " + number3 + "? ");
        int answer = input.nextInt();

        System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + answer + " is " +
                (number1 * number2 * number3 == answer));
    }

    public static void exercise3(){
        //(Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
        //Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
        //the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
        //that “The equation has no solution.”

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c, d, e and f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double determinant = a * d - b * c;

        if (determinant == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;
            System.out.println("x is " + x + " and y is " + y);
        }
    }

    public static void exercise4(){
        int randomInt = (int)(Math.random() * 12) + 1;

        switch (randomInt){
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
        }
    }

    public static void exercise5(){
        Scanner input = new Scanner(System.in);
        System.out.println("Sunday: 0, Monday: 1, Tuesday: 2, Wednesday: 3, Thursday: 4, Friday: 5, Saturday: 6");
        System.out.println("Enter today's day: ");
        int today = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        int futureDay = (today + elapsed) % 7;

        switch (today){
            case 0: System.out.print("Today is Sunday and the future day is "); break;
            case 1: System.out.print("Today is Monday and the future day is "); break;
            case 2: System.out.print("Today is Tuesday and the future day is "); break;
            case 3: System.out.print("Today is Wednesday and the future day is "); break;
            case 4: System.out.print("Today is Thursday and the future day is "); break;
            case 5: System.out.print("Today is Friday and the future day is "); break;
            case 6: System.out.print("Today is Saturday and the future day is "); break;
        }

        switch (futureDay){
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
        }
    }

    public static void exercise6(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in feet and inches: ");
        System.out.println("Feet: ");
        double feet = input.nextDouble();
        System.out.println("Inches: ");
        double inches = input.nextDouble();

        double height = (feet * 12) + inches;
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;

        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

        System.out.println("BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

    public static void exercise7(){
        //(Financial application: monetary units) Modify Listing 2.10, ComputeChange.
        //java, to display the nonzero denominations only, using singular words for single
        //units such as 1 dollar and 1 penny, and plural words for more than one unit such as
        //2 dollars and 3 pennies.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        if (numberOfOneDollars > 1) {
            System.out.println(" " + numberOfOneDollars + " dollars");
        } else if (numberOfOneDollars == 1) {
            System.out.println(" " + numberOfOneDollars + " dollar");
        }
        if (numberOfQuarters > 1) {
            System.out.println(" " + numberOfQuarters + " quarters ");
        } else if (numberOfQuarters == 1) {
            System.out.println(" " + numberOfQuarters + " quarter ");
        }
        if (numberOfDimes > 1) {
            System.out.println(" " + numberOfDimes + " dimes");
        } else if (numberOfDimes == 1) {
            System.out.println(" " + numberOfDimes + " dime");
        }
        if (numberOfNickels > 1) {
            System.out.println(" " + numberOfNickels + " nickels");
        } else if (numberOfNickels == 1) {
            System.out.println(" " + numberOfNickels + " nickel");
        }
        if (numberOfPennies > 1) {
            System.out.println(" " + numberOfPennies + " pennies");
        } else if (numberOfPennies == 1) {
            System.out.println(" " + numberOfPennies + " penny");
        }
    }

    public static void exercise8(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 > number3) {
            int temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("The sorted numbers are " + number1 + " " + number2 + " " + number3);
    }

    public static void exercise9(){
        //(Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
        //consists of 10 digits: d1d2d3d4d5d6d7d8d9d10 . The last digit, d10 , is a checksum,
        //which is calculated from the other 9 digits using the following formula:
        //(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
        //d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
        //If the checksum is 10, the last digit is denoted as X according to the ISBN-10
        //convention. Write a program that prompts the user to enter the first 9 digits and
        //displays the 10-digit ISBN (including leading zeros). Your program should read
        //the input as an integer

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        int d1 = isbn / 100000000;  // First digit
        int remainingDigits = isbn % 100000000;

        int d2 = remainingDigits / 10000000;  // Second digit
        remainingDigits %= 10000000;

        int d3 = remainingDigits / 1000000;  // Third digit
        remainingDigits %= 1000000;

        int d4 = remainingDigits / 100000;  // Fourth digit
        remainingDigits %= 100000;

        int d5 = remainingDigits / 10000;  // Fifth digit
        remainingDigits %= 10000;

        int d6 = remainingDigits / 1000;  // Sixth digit
        remainingDigits %= 1000;

        int d7 = remainingDigits / 100;  // Seventh digit
        remainingDigits %= 100;

        int d8 = remainingDigits / 10;  // Eighth digit
        remainingDigits %= 10;

        int d9 = remainingDigits;  // Ninth digit

        int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
        if (d10 == 10) {
            System.out.println("X");
        } else {
            System.out.println(d10);
        }
    }

    public static void exercise10(){
        //(Game: multiplication quiz) Listing 3.4, SubtractionQuiz.java, randomly generates a
        //subtraction question. Revise the program to randomly generate a multiplication
        //question with two integers less than 100.

        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " * " + number2 + "? ");
        int answer = input.nextInt();

        System.out.println(number1 + " * " + number2 + " = " + answer + " is " + (number1 * number2 == answer));

    }

    public static void main(String[] args) {
        System.out.println("Exercise 1");
        exercise1();
        System.out.println("Exercise 2");
        exercise2();
        System.out.println("Exercise 3");
        exercise3();
        System.out.println("Exercise 4");
        exercise4();
        System.out.println("Exercise 5");
        exercise5();
        System.out.println("Exercise 6");
        exercise6();
        System.out.println("Exercise 7");
        exercise7();
        System.out.println("Exercise 8");
        exercise8();
        System.out.println("Exercise 9");
        exercise9();

    }
}