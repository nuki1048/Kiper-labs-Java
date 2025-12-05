public class Main {
    public static void main(String[] args) {

        Being[] arr = {
                new Human("Людина", 5),
                new Bird("Орел", 40),
                new Animal("Вовк", 30),
                new Plane("Боінг-747", 900),
                new Train("Інтерсіті", 160)
        };

        for (Being b : arr) {
            System.out.println(b);
        }

        System.out.println("\n=== Дії ===");
        ((Human)arr[0]).walk();
        ((Human)arr[0]).runDefault();

        ((Bird)arr[1]).fly();
        ((Bird)arr[1]).flyDefault();

        ((Animal)arr[2]).swim();
        ((Animal)arr[2]).swimDefault();

        System.out.println("\n=== Порівняння швидкостей ===");
        System.out.println(arr[0].compareTo(arr[1]));

        System.out.println("\n=== Клонування ===");
        Being clone = arr[2].clone();
        System.out.println("Клон: " + clone);
    }
}
