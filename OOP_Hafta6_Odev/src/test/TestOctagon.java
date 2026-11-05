package test;

import istiklal.edu.tr.Octagon;

public class TestOctagon {
    public static void main(String[] args) {
        Octagon oct1 = new Octagon(5.0);
        System.out.println("Octagon 1 area: " + oct1.getArea());
        System.out.println("Octagon 1 perimeter: " + oct1.getPerimeter());

        Octagon oct2 = (Octagon) oct1.clone();
        System.out.println("Compare oct1 and oct2: " + oct1.compareTo(oct2));
    }
}