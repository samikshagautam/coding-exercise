package educative.linkedlist.antra.assignment3_2;

public class Rectangle implements Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calArea() {
        return length * breadth;
    }
}
