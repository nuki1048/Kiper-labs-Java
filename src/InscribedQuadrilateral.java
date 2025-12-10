class InscribedQuadrilateral extends ConvexQuadrilateral {

    public InscribedQuadrilateral() {
        this(1, 1, 1, 1);
    }

    public InscribedQuadrilateral(double a, double b, double c, double d) {
        super(a, b, c, d, "вписуваний чотирикутник");
    }

    public InscribedQuadrilateral(Quadrilateral base) {
        super(base);
        this.name = "вписуваний чотирикутник";
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt((s - a) * (s - b) * (s - c) * (s - d));
    }

    @Override
    public String getType() {
        return "вписуваний";
    }
}
