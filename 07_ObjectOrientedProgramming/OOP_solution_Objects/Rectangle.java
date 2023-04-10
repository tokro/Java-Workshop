package OOP_solution_Objects;

// 1. Declare a class called "Rectangle" with two private instance variables:
// "width" (double) and "height" (double)

// Feel free to declare this class in a separate file.
public class Rectangle {
    private double width;
    private double height;

    // 2. Declare a constructor for the Rectangle class that takes two parameters:
    // a width (double) and a height (double)
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 3. Declare a method called "getWidth" that returns the width of the rectangle
    public double getWidth() {
        return width;
    }

    // 4. Declare a method called "getHeight" that returns the height of the rectangle
    public double getHeight() {
        return height;
    }

    // 5. Declare a method called "setDimensions" that takes two parameters:
    // a width (double) and a height (double) and sets the width and height of the rectangle to those values
    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 6. Declare a method called "calculateArea" that calculates and returns the area of the rectangle
    public double calculateArea() {
        return width * height;
    }

    // 8. Declare a method called "printDetails" that prints out the dimensions and area
    // of the rectangle in a formatted message
    public void printDetails() {
        System.out.println("Rectangle: width = " + width + ", height = " + height + ", area = " + calculateArea());
    }
}
