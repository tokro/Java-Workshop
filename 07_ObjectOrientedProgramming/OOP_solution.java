// 1 to 8 in OOP_solution_Objects.Rectangle

import OOP_solution_Objects.Rectangle;

public class OOP_solution {
    public static void main(String[] args) {
        // 9. In the main method, create an instance of the Rectangle class
        // with a width of 5.0 and a height of 10.0
        Rectangle rectangle1 = new Rectangle(5.0, 10.0);

        // 10. Call the "printDetails" method on the rectangle instance
        // to print out its dimensions, area, and perimeter
        rectangle1.printDetails();

        // 11. Call the "setDimensions" method on the rectangle instance
        // with new values for the width and height
        rectangle1.setDimensions(7.0, 12.0);

        // 12. Call the "printDetails" method on the rectangle instance again
        // to verify that the dimensions, area, and perimeter have been updated
        rectangle1.printDetails();
    }
}
