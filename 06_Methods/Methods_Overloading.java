public class Methods_Overloading {
    // Example of overloading a method (here the method "add")
    // Overloading means defining multiple methods with the same name but different parameters
    // The compiler determines which method to call based on the number and type of arguments

    // This method returns the sum of two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // This method returns the sum of three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Example of calling overloaded methods
    public static void main(String[] args) {
        double result1 = add(2.5, 3.7); // result1 = 6.2
        int result2 = add(1, 2, 3); // result2 = 6
    }
}
