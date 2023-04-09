import java.util.Arrays;
public class Arrays_info {
    public static void main(String[] args) {
        // An array is a collection of elements of the same type that are stored in contiguous memory locations
        // To declare an array, you need to specify the type of elements and the number of elements
        // For example, this declares an array of 10 integers
        int[] numbers = new int[5];

        // To assign values to the elements of an array, you can use the index operator []
        // The index starts from 0 and goes up to the length of the array minus 1
        // For example, this assigns 1 to the first element and 10 to the last element
        numbers[0] = 1;
        numbers[4] = 42;

        // You can also declare and initialize an array without specifying the number of elements using an initializer list
        // For example, this declares and initializes an array of 5 strings
        String[] words = {"Hello", "World", "Java", "Arrays", "Fun"};

        // To access the values of the elements of an array, you can also use the index operator []
        // For example, this prints the first and the last element of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[4]);


        // To iterate over all the elements of an array, you can use a for loop
        // For example, this prints all the elements of the array in one line
        System.out.println("\nAll elements with for-loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // You can also use an enhanced for loop to iterate over an array
        // For example, this prints all the elements of the array in reverse order
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();


        // Arrays are objects in Java, so they have some methods and properties that you can use
        // For example, you can use the length property to get the number of elements in an array
        System.out.println("\nLength of array: " + numbers.length);


        // You can also use the clone() method to create a copy of an array
        int[] copy = numbers.clone();

        // You can compare two arrays using the equals() method from the Arrays class (java.util.Arrays)
        System.out.println("\nCopy equals original: " + Arrays.equals(numbers, copy));


        // You can also sort an array using the sort() method from the Arrays class
        System.out.println("\nSorted array:");
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();


        // You can also search for an element in a sorted array using the binarySearch() method from the Arrays class
        System.out.println("\nSearch for element with value 42:");
        int index = Arrays.binarySearch(numbers, 42);
        System.out.println("element: " + index);
    }
}
