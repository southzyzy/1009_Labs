// Lab 3 Exercises
// Author @ Tan Zhao Yea (1802992)
// Task 1


import java.lang.Math;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);

        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("A rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}

class GeometricObject {
    private String color;
    private boolean filled;

    // Default Constructor
    public GeometricObject() {
        this.color = "white";
        this.filled = true;
    }

    // Constructor
    public GeometricObject(String col, boolean filled) {
        this.color = col;
        this.filled = filled;
    }

    // Getters
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    // Setters
    public void setColor(String col) {
        this.color = col;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        if (isFilled()) {
            return "created";
        }
        return "not created";
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Getters
    public Double getArea() { // Area of Circle
        return Math.PI * radius * radius;
    }

    public double getDiameter() { // Diameter of Circle
        return 2 * radius;
    }
}

class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
}
