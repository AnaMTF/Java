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

    public static void exercise11(){
        //(Find the number of days in a month) Write a program that prompts the user to enter
        //the month and year and displays the number of days in the month. For example, if
        //the user entered month 2 and year 2012, the program should display that February
        //2012 has 29 days. If the user entered month 3 and year 2015, the program should
        //display that March 2015 has 31 days.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month (1-12): ");
        int month = input.nextInt();
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month){
            case 1: System.out.println("January " + year + " has 31 days"); break;
            case 2: System.out.println("February " + year + " has " + (isLeapYear ? 29 : 28) + " days"); break;
            case 3: System.out.println("March " + year + " has 31 days"); break;
            case 4: System.out.println("April " + year + " has 30 days"); break;
            case 5: System.out.println("May " + year + " has 31 days"); break;
            case 6: System.out.println("June " + year + " has 30 days"); break;
            case 7: System.out.println("July " + year + " has 31 days"); break;
            case 8: System.out.println("August " + year + " has 31 days"); break;
            case 9: System.out.println("September " + year + " has 30 days"); break;
            case 10: System.out.println("October " + year + " has 31 days"); break;
            case 11: System.out.println("November " + year + " has 30 days"); break;
            case 12: System.out.println("December " + year + " has 31 days"); break;
        }
    }

    public static void exercise12(){
        //(Palindrome integer) Write a program that prompts the user to enter a three-digit
        //integer and determines whether it is a palindrome integer. An integer is palindrome
        //if it reads the same from right to left and from left to right. A negative integer is
        //treated the same as a positive integer.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit integer: ");
        int number = input.nextInt();

        int originalNumber = number;
        int lastDigit = number % 10;
        number /= 10;
        int middleDigit = number % 10;
        number /= 10;
        int firstDigit = number;

        if (firstDigit == lastDigit) {
            System.out.println(originalNumber + " is a palindrome");
        } else {
            System.out.println(originalNumber + " is not a palindrome");
        }
    }

    public static void exercise13(){
        //(Financial application: compute taxes) Listing 3.5, ComputeTax.java, gives the
        //source code to compute taxes for single filers. Complete this program to compute
        //taxes for all filing statuses

        ComputeTax computeTax = new ComputeTax();

    }

    public static void exercise14(){
        //Game: heads or tails) Write a program that lets the user guess whether the flip of
        //a coin results in heads or tails. The program randomly generates an integer 0 or 1,
        //which represents head or tail. The program prompts the user to enter a guess, and
        //reports whether the guess is correct or incorrect

        int coin = (int)(Math.random() * 2);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 0 for heads or 1 for tails: ");
        int guess = input.nextInt();

        if (coin == guess) {
            System.out.println("Correct guess");
        } else {
            System.out.println("Incorrect guess");
        }
    }

    public static void exercise15(){
        //(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three-digit
        //number. The program prompts the user to enter a three-digit number and determines
        //whether the user wins according to the following rules:
        //1. If the user input matches the lottery number in the exact order, the award is
        //$12,000.
        //2. If all digits in the user input match all digits in the lottery number, the award is
        //$5,000.
        //3. If one digit in the user input matches a digit in the lottery number, the award is
        //$2,000.

        int lottery = (int)(Math.random() * 1000);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery / 10 % 10;
        int lotteryDigit3 = lottery % 10;

        int guessDigit1 = guess / 100;
        int guessDigit2 = guess / 10 % 10;
        int guessDigit3 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery) {
            System.out.println("Exact match: you win $12,000");
        } else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3
                || guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1
                || guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2
                || guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1
                || guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2) {
            System.out.println("Match all digits: you win $5,000");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
                || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
                || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
            System.out.println("Match one digit: you win $2,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }

    public static void exercise16(){
        //(Random point) Write a program that displays a random coordinate in a rectangle.
        //The rectangle is centred at (0, 0) with width 50 and height 150

        int x = (int)(Math.random() * 50);
        int y = (int)(Math.random() * 150);

        System.out.println("Random point: (" + x + ", " + y + ")");
    }

    public static void exercise17(){
        //(Game: scissor, rock, paper) Write a program that plays the popular scissor–rock–
        //paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
        //wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
        //scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
        //2 and displays a message indicating whether the user or the computer wins, loses,
        //or draws.

        int computer = (int)(Math.random() * 3);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 0 for scissor, 1 for rock, 2 for paper: ");
        int user = input.nextInt();

        if (computer == user) {
            System.out.println("It is a draw");
        } else if (user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }
    }

    public static void exercise18(){
        //(Cost of shipping) A shipping company uses the following function to calculate the
        //cost (in dollars) of shipping based on the weight of the package (in pounds).
        //c(w) = d
        //2.5, if 0 6 w 6 = 2
        //4.5, if 2 6 w 6 = 4
        //7.5, if 4 6 w 6 = 10
        //10.5, if 10 6 w 6 = 20
        //Write a program that prompts the user to enter the weight of the package and
        //display the shipping cost. If the weight is greater than 20, display a message “the
        //package cannot be shipped.”

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of the package: ");
        double weight = input.nextDouble();

        if (weight > 20) {
            System.out.println("The package cannot be shipped");
        } else if (weight <= 2) {
            System.out.println("The shipping cost is $" + (weight * 2.5));
        } else if (weight <= 4) {
            System.out.println("The shipping cost is $" + (weight * 4.5));
        } else if (weight <= 10) {
            System.out.println("The shipping cost is $" + (weight * 7.5));
        } else {
            System.out.println("The shipping cost is $" + (weight * 10.5));
        }
    }

    public static void exercise19(){
        //Compute the perimeter of a triangle) Write a program that reads three edges for a
        //triangle and computes the perimeter if the input is valid. Otherwise, display that the
        //input is invalid. The input is valid if the sum of every pair of two edges is greater
        //than the remaining edge

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three edges for a triangle: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
            System.out.println("The perimeter is " + (edge1 + edge2 + edge3));
        } else {
            System.out.println("The input is invalid");
        }
    }

    public static void exercise20(){
        //(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to
        //compute the wind-chill temperature. The formula is valid for temperatures in the
        //range between -58°F and 41°F and wind speed greater than or equal to 2. Write
        //a program that prompts the user to enter a temperature and a wind speed. The program
        // displays the wind-chill temperature if the input is valid; otherwise, it displays
        //a message indicating whether the temperature and/or wind speed is invalid

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();

        if (temperature < -58 || temperature > 41 || speed < 2) {
            System.out.println("The temperature and/or wind speed is invalid");
        } else {
            double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);
            System.out.println("The wind chill index is " + windChill);
        }
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
        System.out.println("Exercise 10");
        exercise10();
        System.out.println("Exercise 11");
        exercise11();
        System.out.println("Exercise 12");
        exercise12();
        System.out.println("Exercise 13");
        exercise13();
        System.out.println("Exercise 14");
        exercise14();
        System.out.println("Exercise 15");
        exercise15();
        System.out.println("Exercise 16");
        exercise16();
        System.out.println("Exercise 17");
        exercise17();
        System.out.println("Exercise 18");
        exercise18();

    }
}
