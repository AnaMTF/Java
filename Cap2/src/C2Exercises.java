import java.util.Scanner;
public class C2Exercises {

    public static void exercise1(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of miles as double: ");
        double miles = input.nextDouble();

        double kilometers = miles * 1.6;
    }

    public static void exercise2(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the sides and height of the Equilateral triangle: ");
        double side = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        double volume = area * side;

        System.out.println("The area of the Equilateral triangle is " + area);
        System.out.println("The volume of the Equilateral triangle is " + volume);
    }

    public static void exercise3(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of meters: ");
        double meters = input.nextDouble();

        double feet = meters * 3.2786;

        System.out.println(meters + " meters is " + feet + " feet");
    }

    public static void exercise4(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number in square meters: ");
        double squareMeters = input.nextDouble();

        double ping = squareMeters * 0.3025;

        System.out.println(squareMeters + " square meters is " + ping + " pings");
    }

    public static void exercise5(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }

    public static void exercise6(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of the digits is " + sum);
    }

    public static void exercise7(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }

    public  static void exercise8(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the current time zone offset to GMT: ");
        int offset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + offset) % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }

    public static void exercise9(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - v0) / t;

        System.out.println("The average acceleration is %.4f" + a);
    }

    public static void exercise10(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        double kilograms = input.nextDouble();

        System.out.println("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.println("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        double energy = kilograms * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is " + energy);
    }

    public static void exercise11(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        int population = 312032486 + (years * 365 * 24 * 60 * 60 / 7) - (years * 365 * 24 * 60 * 60 / 13) + (years * 365 * 24 * 60 * 60 / 45);

        System.out.println("The population in " + years + " years is " + population);
    }

    public static void exercise12(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is " + length);
    }

    public static void exercise13(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();

        double monthlyInterestRate = 0.05 / 12;
        double total = 0;

        for (int i = 0; i < 6; i++){
            total = (total + savingAmount) * (1 + monthlyInterestRate);
        }

        System.out.println("After the sixth month, the account value is " + total);
    }

    public static void exercise14(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight in pounds: ");
        double pounds = input.nextDouble();

        System.out.println("Enter the height in inches: ");
        double inches = input.nextDouble();

        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;

        double bmi = kilograms / Math.pow(meters, 2);

        System.out.println("BMI is " + bmi);
    }

    public static void exercise15(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the two points is " + distance);
    }

    public static void exercise16(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double side = input.nextDouble();

        double area = (3 * Math.sqrt(3)) / 2 * Math.pow(side, 2);

        System.out.println("The area of the hexagon is " + area);
    }

    public static void exercise17(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();

        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);

        System.out.println("The wind chill index is " + windChill);
    }

    public static void exercise18(){
        Scanner input = new Scanner(System.in);

        System.out.println("  a     b      Middle Point");
        System.out.println("(0, 0)  (2, 1)  (1.0, 0.5)");
        System.out.println("(10, 30)  (40, 50)  (25.0, 40.0)");
        System.out.println("(1, 4)  (4, 2)  (2.5, 3.0)");
        System.out.println("(2, 7)  (6, 3)  (4.0, 5.0)");

        // I don't know what to do with this exercise
    }

    public static void exercise19(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points separated by spaces: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        System.out.println("The area of the triangle is " + Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2));
    }

    public static void exercise20(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the balance and the annual interest rate: ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        double interest = balance * (annualInterestRate / 1200);
        System.out.println("The interest is " + interest);
    }

    public static void exercise21(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter the annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

        System.out.println("Accumulated value is " + futureInvestmentValue);
    }

    public static void exercise22(){
        Scanner input = new Scanner(System.in);

        //rewrite computechange to fix the possible lloss of accuracy when converting a double value to an int value
        System.out.print("Enter an amount in double, for example 11.56: ");
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
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
    }
    public static void exercise23(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.println("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double cost = (distance / milesPerGallon) * pricePerGallon;

        System.out.println("The cost of driving is " + cost);
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
        System.out.println("Exercise 19");
        exercise19();
        System.out.println("Exercise 20");
        exercise20();
        System.out.println("Exercise 21");
        exercise21();
        System.out.println("Exercise 22");
        exercise22();
        System.out.println("Exercise 23");
        exercise23();
    }
}
