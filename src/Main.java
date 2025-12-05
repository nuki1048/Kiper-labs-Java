import java.util.Scanner;

class Lab1 {

    Lab1() {
        System.out.println("Лабораторна робота №1:");
        Task1();
        Task2();
    }

    /* ==================================================
       ЗАВДАННЯ 1.
       Записати арифметичний вираз алгоритмічною мовою.
    =================================================== */
    void Task1() {
        System.out.println("\n---= ЗАВДАННЯ 1 =---");

        // Довільні значення змінних, як у методичці
        double x = 1.2;
        double a = 2.1;
        double c = 0.9;
        double L;

        // Формула:
        // L = ( sqrt(e^x − cos^4(x^2 * a^5)) + arctg^4(a − x^5) ) / ( e * sqrt(a + x*c^4) )

        double numerator =
                Math.sqrt(Math.exp(x) - Math.pow(Math.cos(Math.pow(x, 2) * Math.pow(a, 5)), 4))
                        + Math.pow(Math.atan(a - Math.pow(x, 5)), 4);

        double denominator =
                Math.exp(1) * Math.sqrt(a + x * Math.pow(c, 4));

        L = numerator / denominator;

        System.out.println("x = " + x + ", a = " + a + ", c = " + c);
        System.out.println("L = " + L);
    }

    /* ==================================================
       ЗАВДАННЯ 2.
       Тіло рухається за законом:
           S = t^3 – 3t^2 + 2
       Обчислити швидкість — похідну:
           v = 3t^2 – 6t
       Значення t вводиться з клавіатури.
    =================================================== */
    void Task2() {
        System.out.println("\n---= ЗАВДАННЯ 2 =---");

        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть значення t: ");
        double t = sc.nextDouble();

        // Похідна швидкості
        double v = 3 * t * t - 6 * t;

        System.out.println("Швидкість тіла в момент часу t = " + t + " дорівнює v = " + v);
    }

    // Точка входу
    public static void main(String[] args) {
        new Lab1();
    }
}
