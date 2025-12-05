public class Main {
    public static void main(String[] args) {

        Quadrilateral[] figures = {
                new InscribedQuadrilateral(5,6,5,6),
                new Trapezoid(10, 6, 4, 7, 5),
                new Parallelogram(8, 5, 4),
                new Rhombus(6, 5),
                new Rectangle(4, 7),
                new Square(5),
                new Kite(4,4,6,8)
        };

        for (Quadrilateral q : figures) {
            System.out.println(q);
            System.out.println("Периметр = " + q.perimeter());
            System.out.println("Площа = " + q.area());
            System.out.println("--------------------------");
        }
    }
}
