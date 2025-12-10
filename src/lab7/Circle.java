package lab7;

public abstract class Circle {

    public static final double DEFAULT_RADIUS = 1.0;
    public static final String TYPE_NAME = "Circle";

    protected double x;
    protected double y;
    protected double radius;

    protected Circle() {
        this(0, 0, DEFAULT_RADIUS);
    }

    protected Circle(double radius) {
        this(0, 0, radius);
    }

    protected Circle(double... params) {
        if (params.length >= 3) {
            this.x = params[0];
            this.y = params[1];
            this.radius = params[2];
        } else {
            this.x = 0;
            this.y = 0;
            this.radius = DEFAULT_RADIUS;
        }
    }

    protected Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    protected Circle(Circle other) {
        this(other.x, other.y, other.radius);
    }

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

    public Circle setCenter(double x, double y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public Circle copy() {
        return CircleFactory.create(this);
    }

    public static boolean isCircle(Object obj) {
        return obj instanceof Circle;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public boolean hasEqualArea(Circle other) {
        return Math.abs(this.getArea() - other.getArea()) < 0.0001;
    }

    public abstract void printInfo();
}
