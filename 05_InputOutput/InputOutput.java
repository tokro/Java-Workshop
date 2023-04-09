// To use the Scanner class, you need to import it from the java.util package
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Inputs and outputs are the ways that a program interacts with the user or other programs

        // Inputs are the data that a program receives from the user or other sources
        // Outputs are the data that a program sends to the user or other destinations

        // One way to perform inputs and outputs in Java is using the Scanner and System classes
        // The Scanner class allows you to read data from different sources, such as the keyboard,
        //   a file, or a network connection
        // The System class allows you to write data to different destinations, such as the console,
        //   a file, or a network connection

        // To create a Scanner object, you need to specify the source of the data
        // For example, this creates a Scanner object that reads data from the keyboard
        Scanner input = new Scanner(System.in);

        // To read data from the Scanner object, you need to use different methods depending on the type of data
        // For example, this reads a string from the keyboard using the nextLine() method
        System.out.println("Enter your name:"); // Print a prompt message
        String name = input.nextLine(); // Read a string from the keyboard
        // For example, this reads a string from the keyboard using the nextLine() method
        System.out.println("Enter your age:"); // Print a prompt message
        int age = input.nextInt(); // Read an integer from the keyboard

        // This writes a string to the console using the println() method
        System.out.println("Hello, " + name + ". You are " + age + " years old."); // Print a greeting message

        // To close the Scanner object, you need to use the close() method
        input.close(); // Close the scanner object
    }
}
