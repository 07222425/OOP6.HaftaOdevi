package istiklal.edu.tr;

public class ComparableCircleEquals extends CircleGeometric {

    public ComparableCircleEquals() {
        super();
    }

    public ComparableCircleEquals(double radius) {
        super(radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComparableCircleEquals) {
            return this.getRadius() == ((ComparableCircleEquals) obj).getRadius();
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