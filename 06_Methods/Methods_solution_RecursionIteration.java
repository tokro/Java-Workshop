public class Methods_solution_RecursionIteration {
    // 1. Declare a method called sumIterative that takes an int parameter n
    // and returns the sum of all numbers from 1 to n using iteration
    public static int sumIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // 2. Declare a method called sumRecursive that takes an int parameter n
    // and returns the sum of all numbers from 1 to n using recursion
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursive(n - 1);
        }
    }
    public static void main(String[] args) {
        // 3. Call the sumIterative method with an argument of 5 and output the result to the console
        int sumIter = sumIterative(5);
        System.out.println("The sum of numbers from 1 to 5 using iteration is " + sumIter);

        // 4. Call the sumRecursive method with an argument of 5 and output the result to the console
        int sumRec = sumRecursive(5);
        System.out.println("The sum of numbers from 1 to 5 using recursion is " + sumRec);
    }
}
