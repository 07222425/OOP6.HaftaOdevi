package test;

import istiklal.edu.tr.ComparableRectangle;

public class TestRectangleEquals {
    public static void main(String[] args) {
        ComparableRectangle r1 = new ComparableRectangle(4.0, 5.0);
        ComparableRectangle r2 = new ComparableRectangle(2.0, 10.0);
        ComparableRectangle r3 = new ComparableRectangle(3.0, 5.0);

        System.out.println("r1 equals r2: " + r1.equals(r2));
        System.out.println("r1 equals r3: " + r1.equals(r3));
    }
}