public abstract class Quadrilateral {

    public static final int SIDES_COUNT = 4;
    public static final String DEFAULT_NAME = "чотирикутник";
    public static final double DEFAULT_SIDE = 0.0;

    private static int instanceCounter = 0;

    protected double a, b, c, d;   // сторони
    protected String name;

    public Quadrilateral() {
        this(DEFAULT_SIDE, DEFAULT_SIDE, DEFAULT_SIDE, DEFAULT_SIDE, DEFAULT_NAME);
    }

    public Quadrilateral(double side) {
        this(side, side, side, side, DEFAULT_NAME);
    }

    public Quadrilateral(String name, double... sides) {
        this(
                sides.length > 0 ? sides[0] : DEFAULT_SIDE,
                sides.length > 1 ? sides[1] : DEFAULT_SIDE,
                sides.length > 2 ? sides[2] : DEFAULT_SIDE,
                sides.length > 3 ? sides[3] : DEFAULT_SIDE,
                name
        );
    }

    public Quadrilateral(double a, double b, double c, double d, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name = name;
        instanceCounter++;
    }

    public Quadrilateral(Quadrilateral other) {
        this(other.a, other.b, other.c, other.d, other.name);
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    public double getD() { return d; }
    public String getName() { return name; }

    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public void setC(double c) { this.c = c; }
    public void setD(double d) { this.d = d; }
    public void setName(String name) { this.name = name; }

    public void setSides(double a, double b, double c, double d) {
        this.a = a;   // this.a — поле, a — параметр
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double perimeter() {
        return a + b + c + d;
    }

    public abstract double area();
    public abstract String getType();

    public static boolean isQuadrilateral(Object obj) {
        return obj instanceof Quadrilateral;
    }

    @Override
    public String toString() {
        return String.format(
                "%s [%s]: a=%.2f, b=%.2f, c=%.2f, d=%.2f",
                getType(), name, a, b, c, d
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Quadrilateral q)) return false;
        return Double.compare(a, q.a) == 0 &&
                Double.compare(b, q.b) == 0 &&
                Double.compare(c, q.c) == 0 &&
                Double.compare(d, q.d) == 0 &&
                name.equals(q.name);
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("[GC] Об’єкт " + getType() + " \"" + name + "\" видаляється з пам’яті");
        } finally {
            super.finalize();
        }
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }
}