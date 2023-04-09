import java.util.Arrays;

public class Arrays_solution {
    public static void main(String[] args) {
        // 1. Declare an array of 4 integers
        int[] numbers = new int[4];

        // 2. Assign values of your choice to the elements of the array
        numbers[0] = 1;
        numbers[1] = 12;
        numbers[2] = 9;
        numbers[3] = 3;

        // 3. Print the elements of the array
        System.out.println("The array is:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 4. Declare a variable to store the sum of the array
        int sum = 0;

        // 5. Add up all the elements of the array and print the result
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("\nSum of the array: " + sum);

        // 6. Declare a variable to store the average of the array, calculate the average and print the result
        //    (Save the result as a double. Note if you need a cast command.)
        double average = (double) sum / numbers.length;
        System.out.println("\nAverage of the array: " + average);

        // 7. Create a copy of the array
        int[] copy = numbers.clone();

        // 8. Sort the array in ascending order using the sort() method from the Arrays class (java.util.Arrays)
        Arrays.sort(numbers);

        // 9. Print the elements of the sorted array
        System.out.println("\nSorted array:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 10. Declare and initialize a second array with the values 1 to 4
        int[] secondArray = {1, 2, 3, 4};

        // 11. Compare the two arrays using the equals() method from the Arrays class (java.util.Arrays)
        //    and print the result
        System.out.println("\nArrays are equal: " + Arrays.equals(numbers, secondArray));
    }
}
