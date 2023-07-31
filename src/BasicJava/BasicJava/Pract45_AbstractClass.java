package BasicJava.BasicJava;
/*This is an example of abstract class implementations*/

/* Abstract class:An abstract class serves as a blueprint for other classes to extend and implement its abstract methods.
The purpose of an abstract class is to provide a common base for related classes while allowing each
subclass to customize the behavior of its own abstract methods. */
public class Pract45_AbstractClass {
    public static void main(String[] args) {

        Shape triangle = new Triangle(5,7);
        System.out.println("The area of the Triangle is:-"+triangle.getArea());
        triangle.displaySides();

        Shape square = new Square(6,9);
        System.out.println("The area of Square is:-"+square.getArea());
        square.displaySides();
    }
}

abstract class Shape {
    protected int sides;

    public Shape(int sides) {
        this.sides = sides;
    }

    abstract double getArea();

    void displaySides() {
        System.out.println("Number of sides are:-" + sides);
    }
}

class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }
}
class Square extends Shape{
    private int length;
    private int breadth;

    public Square(int length,int breadth){
        super(2);
        this.length=length;
        this.breadth = breadth;
    }

    @Override
    double getArea() {
        return length*breadth;
    }

}