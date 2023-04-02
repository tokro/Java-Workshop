public class Operators_solution {
    public static void main(String[] args) {
        // Binary arithmetic operators are +, -, *, / and %
        // Unary arithmetic operators are ++ and --

        // 1. Declare two int variables a and b and assign them any values
        int a = 10;
        int b = 5;

        // 2. Output the values of the variables a and b
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 3. Calculate the sum of a and b and store it in a new variable called sum
        int sum = a + b;

        // 4. Calculate the difference between a and b and store it in a new variable called diff
        int diff = a - b;

        // 5. Calculate the product of a and b and store it in a new variable called prod
        int prod = a * b;

        // 6. Calculate the quotient of a and b and store it in a new variable named quot
        int quot = a / b;

        // 7. Calculate the remainder of a divided by b and store it in a new variable called mod
        int mod = a % b;

        // 8. increase the value of a by 1 with the ++ operator and store it in a new variable named inc
        int inc = ++a;

        // 9. Decrement the value of b by 1 with the -- operator and store it in a new variable named dec
        int dec = --b;

        // 10. Output the values of all calculated variables with System.out.println
        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + diff);
        System.out.println("Multiplication = " + prod);
        System.out.println("Division = " + quot);
        System.out.println("Modulo = " + mod);
        System.out.println("Increment = " + inc);
        System.out.println("Decrement = " + dec);
    }
}
