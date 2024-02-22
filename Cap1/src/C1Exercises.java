public class C1Exercises {
    public static void exercise011(){
        System.out.println("Welcome to Java!");
        System.out.println("Learning Java Now!");
        System.out.println("Programming is fun!");
    }
    public static void exercise012(){
        for (int i = 0 ; i < 5 ; i ++){
            System.out.println("I love Java");
        }
    }

    public static void exercise013(){
        System.out.println("    J    A    V     V    A");
        System.out.println("    J   A A    V   V    A A");
        System.out.println("J   J  AAAAA    V V    AAAAA");
        System.out.println(" J J  A     A    V    A     A");
    }

    public static void exercise014(){
        System.out.println("a    a^2    a^3");
        System.out.println("1    1      1");
        System.out.println("2    4      8");
        System.out.println("3    9      27");
        System.out.println("4    16     64");
    }

    public static void exercise015(){
        System.out.print("((7.5 * 6.5) - (4.5 * 3)) / (47.5 - 5.5) = ");
        System.out.println(((7.5 * 6.5) - (4.5 * 3)) / (47.5 - 5.5));
    }

    public static void exercise016(){
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 1; i < 11; i++){
            sb.append(i);
            sb.append(" + ");
            sum += i;
        }
        System.out.println(sb + " = " + sum);
    }

    public static void exercise017(){
        System.out.print(" 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 ) = " );
        System.out.println(4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));
        System.out.print(" 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = " );
        System.out.println(4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));
    }

    public static void exercise018(){
        System.out.println("Perimeter = " + 2 * 6.5 * 3.14159);
        System.out.println("Area = " + 6.5 * 6.5 * 3.14159);
    }

    public static void exercise019(){
        System.out.println("Average speed in miles per hour = " + (15 * 1.6) / (50.0 / 60 + 30 / 3600));

    }

    public static void exercise0110(){
        int currentPopulation = 312032486;
        int secondsInYear = 365 * 24 * 60 * 60;
        float births = (float) (secondsInYear / 7.0);
        float deaths = (float) (secondsInYear / 13.0);
        float immigrants = (float) (secondsInYear / 45.0);
        int population = 0;
        for (int i = 1; i < 6; i++) {
            population = (int) (currentPopulation + births - deaths + immigrants);
            System.out.println("Year " + i + " population: " + population);
            currentPopulation = (int) population;
        }
    }

    public static void exercise0111(){
        float average = 24.0f / 1.6f / (1 + 40.0f / 60 + 35.0f / 3600);
        System.out.println("Average speed in kilometers per hour: " + average);
    }

    public static void exercise0112(){
        // algebra solve 2 x 2 linear equations
        // 3.4x + 50.2y = 44.5
        // 2.1x + .55y = 5.9
        float x = (44.5f * .55f - 50.2f * 5.9f) / (3.4f * .55f - 50.2f * 2.1f);
        float y = (3.4f * 5.9f - 44.5f * 2.1f) / (3.4f * .55f - 50.2f * 2.1f);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        System.out.println("Exercise 1.1");
        exercise011();
        System.out.println("Exercise 1.2");
        exercise012();
        System.out.println("Exercise 1.3");
        exercise013();
        System.out.println("Exercise 1.4");
        exercise014();
        System.out.println("Exercise 1.5");
        exercise015();
        System.out.println("Exercise 1.6");
        exercise016();
        System.out.println("Exercise 1.7");
        exercise017();
        System.out.println("Exercise 1.8");
        exercise018();
        System.out.println("Exercise 1.9");
        exercise019();
        System.out.println("Exercise 1.10");
        exercise0110();
        System.out.println("Exercise 1.11");
        exercise0111();
        System.out.println("Exercise 1.12");
        exercise0112();
    }
}
