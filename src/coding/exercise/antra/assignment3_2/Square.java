package coding.exercise.antra.assignment3_2;

public class Square implements Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }


    @Override
    public double calArea() {
        return length * length;
    }
}
