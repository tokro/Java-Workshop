public class Methods_RecursionIteration {
    // Example of recursion and iteration in methods
    // Recursion means calling the same method from within itself until a base case is reached
    // Iteration means using loops to repeat a block of code until a condition is met

    // This method returns the factorial of a positive integer using recursion
    public static int factorial(int n) {
        // The base case is when n is 0 or 1, then the factorial is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // The recursive case is when n is greater than 1, then the factorial is n * factorial(n-1)
        else {
            return n * factorial(n - 1);
        }
    }

    // This method returns the factorial of a positive integer using iteration
    public static int factorialIter(int n) {
        // Initialize a variable to store the result and set it to 1
        int result = 1;

        // Use a for loop to multiply the result by each number from 1 to n
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        // Return the final result
        return result;
    }

    // Example of calling recursive and iterative methods
    public static void main(String[] args) {
        int result3 = factorial(5); // result3 = 120
        int result4 = factorialIter(5); // result4 = 120
    }
}
