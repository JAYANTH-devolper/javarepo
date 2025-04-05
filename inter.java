// Interface
interface Shape {
    double calculateArea();
}

// Circle class implementing Shape
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement calculateArea
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement calculateArea
    @Override
    public double calculateArea() {
        return length * width;
    }
}
public class inter{



// Main class to test
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}

    
