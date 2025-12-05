public class Lab7 {

    public static void main(String[] args) {

        // Створення першого кола
        Circle circle1 = new Circle()
                .setX(0)
                .setY(0)
                .setRadius(12);

        // Створення другого кола
        Circle circle2 = new Circle()
                .setX(3)
                .setY(5)
                .setRadius(11);

        // Виводимо координати та радіуси
        System.out.println("Коло 1: центр ("
                + circle1.getX() + ", "
                + circle1.getY() + "), радіус = "
                + circle1.getRadius());

        System.out.println("Коло 2: центр ("
                + circle2.getX() + ", "
                + circle2.getY() + "), радіус = "
                + circle2.getRadius());

        // Перевірка рівності площ
        boolean equal = circle1.hasEqualArea(circle2);

        if (equal) {
            System.out.println("\nПлощі кіл рівні!");
        } else {
            System.out.println("\nПлощі кіл НЕ рівні.");
        }

        // Opposite-case детальний вивід
        System.out.println("\nДеталі:");
        System.out.println("Площа кола 1 = " + circle1.getArea());
        System.out.println("Площа кола 2 = " + circle2.getArea());

        if (!equal) {
            System.out.println("Площі кіл відрізняються — значення не збігаються.");
        } else {
            System.out.println("Площі кіл повністю збігаються — значення однакові.");
        }
    }
}
