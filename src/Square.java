final class Square extends Rectangle {

    public Square() {
        this(5);
    }

    public Square(double side) {
        super(side, side);
        this.name = "квадрат";
    }

    public Square(Quadrilateral base) {
        this(base.getA()); // умовно беремо одну сторону як сторону квадрата
    }

    public Square(Square other) {
        this(other.a);
    }

    @Override
    public String getType() {
        return "квадрат";
    }
}
