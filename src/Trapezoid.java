public class Trapezoid extends ConvexQuadrilateral {

    protected double height;

    public Trapezoid(double a, double b, double c, double d, double height) {
        super(a, b, c, d, "трапеція");
        this.height = height;
    }

    @Override
    public double area() {
        return (a + c) / 2 * height;
    }

    @Override
    public String getType() {
        return "трапеція";
    }
}
