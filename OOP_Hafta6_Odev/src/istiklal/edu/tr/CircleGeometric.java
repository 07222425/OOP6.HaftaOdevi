package istiklal.edu.tr;

public class CircleGeometric extends GeometricObjectComparable {
    private double radius;

    public CircleGeometric() {
    }

    public CircleGeometric(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius + ", area: " + getArea();
    }
}