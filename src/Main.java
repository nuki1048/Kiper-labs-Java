public class Main {
    public static void main(String[] args) {

        Being[] arr = {
                new Human("Людина", 5),
                new Bird("Орел", 40),
                new Animal("Вовк", 30),
                new Plane("Боінг-747", 900),
                new Train("Інтерсіті", 160)
        };

        System.out.println("=== Об'єкти ===");
        for (Being b : arr) {
            System.out.println(b);
        }

        System.out.println("\n=== Динамічні дії ===");

        for (Being b : arr) {
            if (b instanceof Walking w) w.walk();
            if (b instanceof Running r) r.runDefault();
            if (b instanceof Swimming s) s.swimDefault();
            if (b instanceof Flying f) f.flyDefault();
            System.out.println("-----------------------");
        }

        System.out.println("\n=== Порівняння швидкостей ===");
        System.out.println(arr[0].compareTo(arr[1]));

        System.out.println("\n=== Клонування ===");
        Being clone = arr[2].clone();
        System.out.println("Клон: " + clone);

        System.out.println("\n=== Static методи інтерфейсів ===");
        Walking.info();
        Running.info();
        Swimming.info();
        Flying.info();
    }
}
