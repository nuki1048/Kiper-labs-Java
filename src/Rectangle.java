class Rectangle extends Parallelogram {

    public Rectangle() {
        this(4, 7);
    }

    public Rectangle(double width, double height) {
        super(width, height, height);
        this.name = "прямокутник";
    }

    public Rectangle(Quadrilateral base) {
        this(base.getA(), base.getB());
    }

    public Rectangle(Rectangle other) {
        this(other.a, other.b);
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
