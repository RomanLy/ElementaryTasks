package task_3;

public class CalculateTriangle {

    Triangle triangle;
    private double halfPerimeter = calculateHalfPerimeter();

    protected void setSq(){
        triangle = new Triangle("sd",123,123.21, 121);
        triangle.setSquare(calculateSquare());
    }

    protected double calculateSquare(){
        double d =  Math.sqrt((halfPerimeter *
                (halfPerimeter - triangle.side1) *
                (halfPerimeter - triangle.side2) *
                (halfPerimeter - triangle.side3)));
        return d;
    }

    private double calculateHalfPerimeter(){
        return (triangle.side1 + triangle.side2 + triangle.side3)/2;
    }
}
