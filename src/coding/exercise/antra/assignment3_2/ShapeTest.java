package coding.exercise.antra.assignment3_2;

import java.util.Comparator;

public class ShapeTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(3);
        Shape square = new Square(4);

        System.out.println("The area of rectangle is: " + rectangle.calArea());
        System.out.println("The area of circle is: " + circle.calArea());
        System.out.println("The area of square is: " + square.calArea());

        Comparator<Shape> comparator = new ShapeComparator();
        System.out.println(comparator.compare(rectangle, circle));
        System.out.println(comparator.compare(circle, square));
        System.out.println(comparator.compare(rectangle, square));

    }
}
