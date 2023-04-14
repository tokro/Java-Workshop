import java.util.Arrays;

public class Arrays_solution_twoDimensional {
    public static void main(String[] args) {
        // 1. Declare a two-dimensional array of integers with dimensions 3x3
        int[][] numbers = new int[3][3];

        // 2. Assign values of your choice to the elements of the array
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;
        numbers[2][0] = 7;
        numbers[2][1] = 8;
        numbers[2][2] = 9;

        // 3. Print the elements of the array in a 3x3 grid
        System.out.println("The array is:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // 4. Declare a variable to store the sum of the elements in the array
        int sum = 0;

        // 5. Add up all the elements of the array and print the result
        for (int[] row : numbers) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("\nSum of the array: " + sum);

        // 6. Declare a variable to store the average of the elements in the array, calculate the average, and print the result
        // (Save the result as a double. Note if you need a cast command.)
        double average = (double) sum / (numbers.length * numbers[0].length);
        System.out.println("\nAverage of the array: " + average);

        // 7. Create a copy of the array
        int[][] copy = new int[numbers.length][numbers[0].length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                copy[i][j] = numbers[i][j];
            }
        }

        // 8. Sort one row of the array in ascending order using the sort() method from the Arrays class (java.util.Arrays)
        Arrays.sort(numbers[1]);

        // 9. Print the elements of the sorted row
        System.out.println("\nSorted row:");
        for (int num : numbers[1]) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 10. Declare and initialize a second two-dimensional array with dimensions 2x2 with the values 1 to 4
        int[][] secondArray = {{1, 2}, {3, 4}};
    }
}
