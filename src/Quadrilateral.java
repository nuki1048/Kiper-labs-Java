public abstract class Quadrilateral {

    protected double a, b, c, d;  // Сторони
    protected String name;

    public Quadrilateral() {
        this(0, 0, 0, 0, "чотирикутник");
    }

    public Quadrilateral(double a, double b, double c, double d, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name = name;
    }

    public Quadrilateral(Quadrilateral other) {
        this(other.a, other.b, other.c, other.d, other.name);
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    public double getD() { return d; }
    public String getName() { return name; }

    public double perimeter() {
        return a + b + c + d;
    }

    public abstract double area();

    // Метод, який ПЕРЕЗАПИСУЄ підклас
    public String getType() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + " зі сторонами: " + a + ", " + b + ", " + c + ", " + d +
                "\nТип: " + getType();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Quadrilateral)) return false;
        Quadrilateral q = (Quadrilateral) obj;
        return a == q.a && b == q.b && c == q.c && d == q.d && name.equals(q.name);
    }
}
