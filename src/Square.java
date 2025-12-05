public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
        this.name = "квадрат";
    }

    @Override
    public String getType() {
        return "квадрат";
    }
}
