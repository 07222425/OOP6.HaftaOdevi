package test;

import istiklal.edu.tr.ComparableCircle;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(4.5);
        ComparableCircle circle2 = new ComparableCircle(6.2);

        ComparableCircle larger = (circle1.compareTo(circle2) >= 0) ? circle1 : circle2;
        System.out.println("The larger of the two circles is: " + larger);
    }
}