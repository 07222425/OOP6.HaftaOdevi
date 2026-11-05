package istiklal.edu.tr;

public class RectangleGeometric extends GeometricObjectComparable {
    private double width;
    private double height;

    public RectangleGeometric() {
    }

    public RectangleGeometric(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle width: " + width + ", height: " + height + ", area: " + getArea();
    }
}