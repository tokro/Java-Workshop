public class OOP {
    // Object-oriented programming is a programming paradigm that organizes data and behavior into
    // reusable units called objects. Objects have attributes that store their state and methods
    // that define their actions. Objects can also inherit attributes and methods from other objects,
    // forming a hierarchy of classes.

    // The main method is where the program starts
    public static void main(String[] args) {
        // To create an object, use the new keyword and call the constructor
        Student audrey = new Student("Audrey", 28, 12.5); // Create a student object named audrey
        Student tom = new Student("Tom", 24, 9.0); // Create a student object named tom

        // To access or modify an attribute or call a method of an object, use the dot operator
        audrey.introduce(); // Call the introduce method of audrey
        tom.introduce(); // Call the introduce method of tom

        audrey.study(); // Call the study method of audrey
        tom.study(); // Call the study method of tom

        System.out.println("The average grade of Audrey and Tom is " + (audrey.grade + tom.grade) / 2);
    }
}

// A class is a blueprint for creating objects
class Student {
    // Attributes or fields are variables that store the state of an object
    String name; // The name of the student
    int age; // The age of the student
    double grade; // The grade of the student

    // A constructor is a special method that initializes an object
    // It has the same name as the class and no return type
    Student(String name, int age, double grade) {
        // The this keyword refers to the current object
        this.name = name; // Assign the parameter name to the attribute name
        this.age = age; // Assign the parameter age to the attribute age
        this.grade = grade; // Assign the parameter grade to the attribute grade
    }

    // Methods are actions that an object can perform
    // They have a return type, a name, and a list of parameters
    void introduce() {
        // System.out.println is a method that prints a message to the console
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    void study() {
        // Math.random is a method that returns a random number between 0 and 1
        grade = grade + Math.random(); // Increase the grade by a random amount
        System.out.println(name + " studied and now has a grade of " + grade);
    }
}
