public class Kite extends ConvexQuadrilateral {

    private double d1, d2;

    public Kite(double a, double b, double d1, double d2) {
        super(a, b, a, b, "дельтоїд");
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public double area() {
        return d1 * d2 / 2;
    }

    @Override
    public String getType() {
        return "дельтоїд";
    }
}
