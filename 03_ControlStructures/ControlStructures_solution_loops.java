public class ControlStructures_solution_loops {
    public static void main(String[] args) {
        // Loops are statements that execute a block of code multiple times
        // The main loops are while, do-while and for

        // 1. Declare an int variable named n and assign it any value
        int n = 5;

        // 2. Use a while loop to print the numbers from 1 to n
        //    Print each number in a new line with System.out.println
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        // 3. Use a do-while loop to print the numbers from n to 1
        //    Print each number in a new line with System.out.println
        int j = n;
        do {
            System.out.println(j);
            j--;
        } while (j >= 1);

        // 4. Use a for loop to calculate the sum of the numbers from 1 to n
        //    Store the result in a new variable named sum
        int sum = 0;
        for (int k = 1; k <= n; k++) {
            sum = sum + k;
        }

        // 5. Print the value of sum with System.out.println
        System.out.println("The sum of the numbers from 1 to " + n + " is " + sum);
    }
}
