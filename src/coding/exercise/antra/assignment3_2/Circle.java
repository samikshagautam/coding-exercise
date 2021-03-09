package coding.exercise.antra.assignment3_2;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calArea() {
        return  3.14 * radius * radius;
    }
}
