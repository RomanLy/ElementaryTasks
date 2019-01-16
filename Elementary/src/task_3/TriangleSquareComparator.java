package task_3;

import java.util.Comparator;

public class TriangleSquareComparator implements Comparator<Triangle>{


    @Override
    public int compare(Triangle o1, Triangle o2) {
        Double square1 = new Double(o1.getSquare());
        Double square2 = new Double(o2.getSquare());
        return square1.compareTo(square2);
    }
}
