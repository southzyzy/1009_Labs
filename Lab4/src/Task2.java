// Lab 4 Exercises
// Author @ Tan Zhao Yea (1802992)
// Task 2

public class Task2 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(9, 5);
        Triangle tri = new Triangle(10, 8);
        Circle cir = new Circle(5, 5);
        Ellipse eli = new Ellipse(7, 7);
        Square squ = new Square(6, 6);

        // Abstract reference variable
        Shape figref;

        // Assigning reference variable
        figref = rec;
        System.out.println("Area is " + figref.getArea());

        figref = tri;
        System.out.println("Area is " + figref.getArea());

        figref = cir;
        System.out.println("Area is " + figref.getArea());

        figref = eli;
        System.out.println("Area is " + figref.getArea());

        figref = squ;
        System.out.println("Area is " + figref.getArea());
    }
}

abstract class Shape {
    private double dim1;
    private double dim2;
    private final double pi = 3.14;

    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double getArea();

    public double getX() {
        return dim1;
    }

    public double getY() {
        return dim2;
    }

    public double getPI() {
        return pi;
    }
}

class Rectangle extends Shape {

    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double getArea() {
        System.out.println("Inside Area for Rectangle.");
        return super.getX() * super.getY();
    }
}

class Triangle extends Shape {

    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double getArea() {
        System.out.println("Inside Area for Triangle.");
        return 0.5 * super.getX() * super.getY();
    }
}

class Circle extends Shape {

    Circle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double getArea() {
        System.out.println("Inside Area for Circle.");
        return super.getPI() * super.getX() * super.getY();
    }
}

class Ellipse extends Shape {

    Ellipse(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double getArea() {
        System.out.println("Inside Area for Ellipse.");
        return super.getPI() * super.getX() * super.getY();
    }
}

class Square extends Shape {

    Square(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double getArea() {
        System.out.println("Inside Area for Square.");
        return super.getX() * super.getY();
    }
}