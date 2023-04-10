public class Methods_solution {
    // 1. Declare a method called sum that takes two int parameters called a and b
    // and returns their sum as an int
    public static int sum(int a, int b) {
        return a + b;
    }

    // 2. Declare a method called multiply that takes two double parameters called a and b
    // and returns their product as a double
    public static double multiply(double a, double b) {
        return a * b;
    }

    // 3. Declare a method called greet that takes a String parameter called name
    // and an int parameter called age and outputs "Hello, <name>! You are <age> years old." to the console
    public static void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {
        // 4. Call the greet method with your name and age as arguments
        greet("Tom", 25);

        // 5. Call the sum method with two int arguments and output the result to the console
        int x = 3;
        int y = 7;
        int z = sum(x, y);
        System.out.println("The sum of " + x + " and " + y + " is " + z);

        // 6. Call the multiply method with two double arguments and output the result to the console
        double a = 2.5;
        double b = 4.5;
        double c = multiply(a, b);
        System.out.println("The product of " + a + " and " + b + " is " + c);
    }
}
