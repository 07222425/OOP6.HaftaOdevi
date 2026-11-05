package test;

import istiklal.edu.tr.Colorable;
import istiklal.edu.tr.GeometricObject;
import istiklal.edu.tr.Square;
import istiklal.edu.tr.Triangle;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square(2.5);
        objects[1] = new Triangle(3, 4, 5);
        objects[2] = new Square(5.0);
        objects[3] = new Triangle(5, 5, 5);
        objects[4] = new Square(7.2);

        for (int i = 0; i < objects.length; i++) {
            System.out.println("Object " + (i + 1) + " area: " + objects[i].getArea());
            if (objects[i] instanceof Colorable) {
                ((Colorable) objects[i]).howToColor();
            }
        }
    }
}