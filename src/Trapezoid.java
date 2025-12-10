class Trapezoid extends ConvexQuadrilateral {

    protected double height;

    public Trapezoid() {
        this(3, 5, 3, 5, 2);
    }

    public Trapezoid(double a, double b, double c, double d, double height) {
        super(a, b, c, d, "трапеція");
        this.height = height;
    }

    public Trapezoid(Quadrilateral base, double height) {
        super(base);
        this.height = height;
        this.name = "трапеція";
    }

    public Trapezoid(Trapezoid other) {
        this(other.a, other.b, other.c, other.d, other.height);
    }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    @Override
    public double area() {
        return (a + c) / 2.0 * height;
    }

    @Override
    public String getType() {
        return "трапеція";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", h=%.2f", height);
    }
}