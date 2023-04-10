public class Methods {
    // Methods are blocks of code that perform a specific task and can be reused in different parts of a program.
    // The syntax of a method is:
    // [access modifier] [static] return_type method_name ([parameters]) {
    //   // method body
    //   [return statement]
    // }

    // Example of a method that returns the sum of two integers
    public static int add(int a, int b) {
        // The parameters are the variables that are passed to the method when it is called
        // The return type is the type of value that the method returns to the caller
        // The return statement is used to end the method execution and return a value
        return a + b;
    }

    // Example of a method that prints a greeting message
    public static void greet(String name) {
        // The void keyword means that the method does not return any value
        System.out.println("Hello, " + name + "!");
    }

    // Example of calling a method
    public static void main(String[] args) {
        // To call a method, use the method name followed by parentheses and arguments if any
        // The arguments are the actual values that are passed to the method when it is called
        int result = add(3, 5); // result = 8
        greet("Alice"); // prints "Hello, Alice!"
    }
}
