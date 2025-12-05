public class InscribedQuadrilateral extends ConvexQuadrilateral {

    public InscribedQuadrilateral(double a, double b, double c, double d) {
        super(a, b, c, d, "вписуваний чотирикутник");
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
