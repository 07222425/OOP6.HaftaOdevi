package test;

import istiklal.edu.tr.CircleGeometric;
import istiklal.edu.tr.GeometricObjectComparable;
import istiklal.edu.tr.RectangleGeometric;

public class TestGeometricMax {
    public static void main(String[] args) {
        CircleGeometric c1 = new CircleGeometric(5);
        CircleGeometric c2 = new CircleGeometric(7);
        CircleGeometric maxCircle = (CircleGeometric) GeometricObjectComparable.max(c1, c2);
        System.out.println("Larger circle: " + maxCircle);

        RectangleGeometric r1 = new RectangleGeometric(4, 5);
        RectangleGeometric r2 = new RectangleGeometric(3, 8);
        RectangleGeometric maxRectangle = (RectangleGeometric) GeometricObjectComparable.max(r1, r2);
        System.out.println("Larger rectangle: " + maxRectangle);
    }
}