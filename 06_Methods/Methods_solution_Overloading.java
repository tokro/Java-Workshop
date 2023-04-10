public class Methods_solution_Overloading {
    // 1. Declare a method called calculate that takes two int parameters called a and b
    // and returns their sum as an int
    public static int calculate(int a, int b) {
        return a + b;
    }

    // 2. Overload the calculate method by declaring a new method called calculate
    // that takes three int parameters called a, b, and c, and returns their sum as an int
    public static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Overload the calculate method again by declaring a new method called calculate
    // that takes two double parameters called a and b, and returns their sum as a double
    public static double calculate(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // 4. Call the first calculate method with two int arguments and output the result to the console
        int x = 3;
        int y = 7;
        int z = calculate(x, y);
        System.out.println("The sum of " + x + " and " + y + " is " + z);

        // 5. Call the second calculate method with three int arguments and output the result to the console
        int a = 2;
        int b = 4;
        int c = 6;
        int d = calculate(a, b, c);
        System.out.println("The sum of " + a + ", " + b + ", and " + c + " is " + d);

        // 6. Call the third calculate method with two double arguments and output the result to the console
        double p = 2.5;
        double q = 4.5;
        double r = calculate(p, q);
        System.out.println("The sum of " + p + " and " + q + " is " + r);
    }
}
