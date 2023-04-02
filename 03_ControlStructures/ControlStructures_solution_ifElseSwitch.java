public class ControlStructures_solution_ifElseSwitch {
    public static void main(String[] args) {
        // if-else and switch are statements that check a condition and execute a block of code accordingly
        // if-else is more flexible, but switch is more readable

        // 1. Declare an int variable named x and assign it any value
        int x = 5;

        // 2. Use an if-else statement to check if x is positive, negative or zero
        //    Print the result with System.out.println
        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }

        // 3. Declare a char variable named day and assign it a value from 1 to 7
        int day = 3;

        // 4. Use a switch statement to print a message based on the weekday (e.g. 1: "Monday")
        //    Use System.out.println for the message
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday my dudes.");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
            default:
                System.out.println("Invalid day");
        }
    }
}
