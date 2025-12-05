public class Parallelogram extends Trapezoid {

    public Parallelogram(double a, double b, double height) {
        super(a, b, a, b, height);
        this.name = "паралелограм";
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
