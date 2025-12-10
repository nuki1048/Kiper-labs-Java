class Rhombus extends Parallelogram {

    public Rhombus() {
        this(5, 3);
    }

    public Rhombus(double side, double height) {
        super(side, side, height);
        this.name = "ромб";
    }

    public Rhombus(Quadrilateral base, double height) {
        super(base, height);
        this.name = "ромб";
    }

    public Rhombus(Rhombus other) {
        this(other.a, other.height);
    }

    @Override
    public String getType() {
        return "ромб";
    }
}