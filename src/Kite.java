class Kite extends ConvexQuadrilateral {

    private double d1;   // діагоналі
    private double d2;

    public Kite() {
        this(4, 4, 6, 8);
    }

    public Kite(double a, double b, double d1, double d2) {
        super(a, b, a, b, "дельтоїд");
        this.d1 = d1;
        this.d2 = d2;
    }

    public Kite(Quadrilateral base, double d1, double d2) {
        super(base);
        this.d1 = d1;
        this.d2 = d2;
        this.name = "дельтоїд";
    }

    public Kite(Kite other) {
        this(other.a, other.b, other.d1, other.d2);
    }

    public double getD1() { return d1; }
    public double getD2() { return d2; }
    public void setD1(double d1) { this.d1 = d1; }
    public void setD2(double d2) { this.d2 = d2; }

    @Override
    public double area() {
        return d1 * d2 / 2.0;
    }

    @Override
    public String getType() {
        return "дельтоїд";
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", d1=%.2f, d2=%.2f", d1, d2);
    }
}