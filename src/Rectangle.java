public class Rectangle extends Parallelogram {

    public Rectangle(double width, double height) {
        super(width, height, height);
        this.name = "прямокутник";
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public String getType() {
        return "прямокутник";
    }
}
