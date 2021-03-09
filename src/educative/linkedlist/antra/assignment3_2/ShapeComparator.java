package educative.linkedlist.antra.assignment3_2;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        double area1 = o1.calArea();
        double area2 = o2.calArea();

        if (area1 > area2) {
            return 1;
        } else if (area1 == area2) {
            return 0;
        }

        return -1;
    }
}
