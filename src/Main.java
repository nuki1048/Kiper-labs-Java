public class Main {

    public static void main(String[] args) {

        // Працюємо через посилання базового класу
        Quadrilateral[] figures = {
                new InscribedQuadrilateral(5, 6, 5, 6),
                new Trapezoid(10, 6, 4, 7, 5),
                new Parallelogram(8, 5, 4),
                new Rhombus(6, 5),
                new Rectangle(4, 7),
                new Square(5),
                new Kite(4, 4, 6, 8)
        };

        System.out.println("Кількість створених чотирикутників: " +
                Quadrilateral.getInstanceCounter());
        System.out.println("=========================================\n");

        for (Quadrilateral q : figures) {
            System.out.println(q);
            System.out.println("Периметр = " + q.perimeter());
            System.out.println("Площа    = " + q.area());
            System.out.println("-------------------------------------");
        }

        // Демонстрація equals
        Quadrilateral r1 = new Rectangle(4, 7);
        Quadrilateral r2 = new Rectangle(4, 7);
        System.out.println("\nr1.equals(r2) = " + r1.equals(r2));

        // Перевірка статичного методу isQuadrilateral
        Object obj = new String("test");
        System.out.println("isQuadrilateral(r1) = " + Quadrilateral.isQuadrilateral(r1));
        System.out.println("isQuadrilateral(obj) = " + Quadrilateral.isQuadrilateral(obj));
    }
}