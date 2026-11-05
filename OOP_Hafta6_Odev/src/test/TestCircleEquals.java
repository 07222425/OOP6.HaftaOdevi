package test;

import istiklal.edu.tr.ComparableCircleEquals;

public class TestCircleEquals {
    public static void main(String[] args) {
        ComparableCircleEquals c1 = new ComparableCircleEquals(5.5);
        ComparableCircleEquals c2 = new ComparableCircleEquals(5.5);
        ComparableCircleEquals c3 = new ComparableCircleEquals(7.2);

        System.out.println("c1 equals c2: " + c1.equals(c2));
        System.out.println("c1 equals c3: " + c1.equals(c3));
    }
}