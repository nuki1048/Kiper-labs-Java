public class Circle {

    private double x;
    private double y;
    private double radius;

    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return radius; }

    public Circle setX(double x) {
        this.x = x;
        return this;
    }

    public Circle setY(double y) {
        this.y = y;
        return this;
    }

    public Circle setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public boolean hasEqualArea(Circle other) {
        return Math.abs(this.getArea() - other.getArea()) < 0.0001;
    }
}
