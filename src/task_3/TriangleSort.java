package task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TriangleSort {

    ArrayList<Triangle> arrayList = new ArrayList<>();

    CalculateTriangle calculateTriangle = new CalculateTriangle();

    protected void setCalculateTriangle(){
        calculateTriangle.calculateSquare();
    }

    protected void sort(){

        arrayList.add(calculateTriangle.triangle);
        arrayList.add(calculateTriangle.triangle);
        arrayList.add(calculateTriangle.triangle);
        Collections.sort(arrayList, new TriangleSquareComparator());
        print();
    }

    protected void print() {
        System.out.println();
        Iterator<Triangle> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            Triangle triangle = iterator.next();
            System.out.println(triangle.getName() + " " + triangle.getSquare());
        }
    }


}
