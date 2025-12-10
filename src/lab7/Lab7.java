package lab7;

public class Lab7 {

    public static void main(String[] args) {

        Circle circle1 = CircleFactory.create(0, 0, 12);
        Circle circle2 = CircleFactory.create(3, 5, 11);

        circle1.printInfo();
        circle2.printInfo();

        System.out.println("\nКоло 1: центр (" +
                circle1.getX() + ", " +
                circle1.getY() + "), радіус = " +
                circle1.getRadius());

        System.out.println("Коло 2: центр (" +
                circle2.getX() + ", " +
                circle2.getY() + "), радіус = " +
                circle2.getRadius());

        boolean equal = circle1.hasEqualArea(circle2);

        if (equal) {
            System.out.println("\n✅ Площі кіл рівні!");
        } else {
            System.out.println("\n❌ Площі кіл НЕ рівні.");
        }

        System.out.println("\nДеталі:");
        System.out.println("Площа кола 1 = " + circle1.getArea());
        System.out.println("Площа кола 2 = " + circle2.getArea());

        Circle clone = circle1.copy();
        System.out.println("\nКлон кола:");
        clone.printInfo();

        System.out.println("\nIs circle1 instance of Circle → " + Circle.isCircle(circle1));
    }
}
