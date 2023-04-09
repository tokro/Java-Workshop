import java.util.Scanner;

public class InputOutput_solution {
    public static void main(String[] args) {
        // Create a program that asks the user for their name and two numbers
        // and prints the sum and product of the numbers

        // 1. Import the Scanner class

        // 2. Create a Scanner object
        Scanner input = new Scanner(System.in);

        // 3. Ask the user for their name
        System.out.println("What is your name?");

        // 4. Read the user's name using the nextLine() method
        String name = input.nextLine();

        // 5. Ask the user for two numbers and read the user's numbers using the nextInt() method
        System.out.println("Enter two numbers:");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // 6. Calculate the sum and product of the numbers
        int sum = num1 + num2;
        int product = num1 * num2;

        // 7. Print the results using the user's name and numbers
        System.out.println("Hello, " + name + ". You entered " + num1 + " and " + num2 + ".");
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The product of the numbers is: " + product);

        // 8. Close the scanner object
        input.close();
    }
}
