// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    abstract double area();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class implementing the abstract class
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("This is a circle with radius " + radius);
    }
}

// Concrete class implementing the abstract class
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    void display() {
        System.out.println("This is a rectangle with length " + length + " and width " + width);
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        // Using abstract classes
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 3.0);

        circle.display();
        System.out.println("Area of circle: " + circle.area());

        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}