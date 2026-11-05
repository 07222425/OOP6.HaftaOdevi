package istiklal.edu.tr;

import java.util.Date;

public abstract class GeometricObjectComparable implements Comparable<GeometricObjectComparable> {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObjectComparable() {
        dateCreated = new Date();
    }

    protected GeometricObjectComparable(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

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

    public static GeometricObjectComparable max(GeometricObjectComparable o1, GeometricObjectComparable o2) {
        return (o1.compareTo(o2) >= 0) ? o1 : o2;
    }
}