public class Rhombus extends Parallelogram {

    public Rhombus(double side, double height) {
        super(side, side, height);
        this.name = "ромб";
    }

    @Override
    public double area() {
        return a * height;
    }

    @Override
    public String getType() {
        return "ромб";
    }
}
