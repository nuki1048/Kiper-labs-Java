class Parallelogram extends Trapezoid {

    public Parallelogram() {
        this(4, 6, 3);
    }

    public Parallelogram(double a, double b, double height) {
        super(a, b, a, b, height);
        this.name = "паралелограм";
    }

    public Parallelogram(Quadrilateral base, double height) {
        super(base, height);
        this.name = "паралелограм";
    }

    public Parallelogram(Parallelogram other) {
        this(other.a, other.b, other.height);
    }

    @Override
    public double area() {
        return a * height;
    }

    @Override
    public String getType() {
        return "паралелограм";
    }
}