public class ControlStructures {
    public static void main(String[] args) {
        // Control structures are statements that control the flow of a program
        // The main control structures are if-else, switch-case and loops

        // conditional statements / selection
        System.out.println("Conditional statements / selection");

        // The if-statement is used to evaluate an expression
        // and to proceed depending on the result.
        System.out.println("\nif-statement");

        int age = 24;
        if (age >= 18) {
            System.out.println("Age: " + age + "\nYou are old enough to vote!");
        } else {
            System.out.println("Age: " + age + "\nYou are too young to vote.");
        }


        // The switch statement corresponds to a multi-nested
        // if statement, but has the advantage of being clearer.
        System.out.println("\nswitch-statement");

        int number = 2;
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Number between 4 and 9");
            default:
                System.out.println("Not a valid number");
        }


        // Loops / repetitions (iteration)
        // Loops are statements that execute a block of code multiple times
        // The main loops are while, do-while and for
        System.out.println("\nLoops / repetitions (iteration)");

        // The do-while loop is similar to the while loop,
        // except that it executes the statements within the
        // loop at least once before checking the condition.
        System.out.println("\ndo-while-loop");
        int i = 1;
        do {
            System.out.println("Number: " + i);
            i++;
        } while (i <= 5);


        // The while loop checks the condition at the beginning
        // of each iteration and executes the statements inside
        // the loop as long as the condition is true.
        System.out.println("\nwhile-loop");
        int j = 1;
        while (j <= 5) {
            System.out.println("Number: " + j);
            j++;
        }


        // The for loop allows a variable to be initialised,
        // a condition to be checked and a step to be executed
        // each time the loop is run.
        System.out.println("\nfor-loop");
        for (int k = 1; k <= 5; k++) {
            System.out.println("Number: " + k);
        }
    }
}
