package istiklal.edu.tr;

public class ComparableRectangle extends RectangleGeometric {

    public ComparableRectangle() {
        super();
    }

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComparableRectangle) {
            return this.getArea() == ((ComparableRectangle) obj).getArea();
        }
        return false;
    }

    @Override
    public int compareTo(GeometricObjectComparable o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}