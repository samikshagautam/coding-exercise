package educative.linkedlist.antra.assignment3_2;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calArea() {
        return 4 * 3.14 * radius;
    }
}
