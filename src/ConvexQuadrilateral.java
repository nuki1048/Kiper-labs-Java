public abstract class ConvexQuadrilateral extends Quadrilateral {

    public ConvexQuadrilateral() { super(); }

    public ConvexQuadrilateral(double a, double b, double c, double d, String name) {
        super(a, b, c, d, name);
    }

    public ConvexQuadrilateral(ConvexQuadrilateral other) {
        super(other);
    }
}
