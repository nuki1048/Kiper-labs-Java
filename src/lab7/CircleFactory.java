package lab7;

public final class CircleFactory {

    private CircleFactory() {}

    public static Circle create(double x, double y, double radius) {
        return new Circle(x, y, radius) {
            @Override
            public void printInfo() {
                System.out.println("Анонімне коло → центр (" + x + ", " + y + "), радіус = " + radius);
            }
        };
    }

    public static Circle create(double radius) {
        return create(0, 0, radius);
    }

    public static Circle create(Circle other) {
        return create(other.getX(), other.getY(), other.getRadius());
    }
}
