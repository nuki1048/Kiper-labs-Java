import java.util.Scanner;
import java.util.Arrays;

class Lab5 {

    Lab5() {
        System.out.println("Лабораторна робота №5:");
        TaskMagicSquare();
    }

    /* === ЗАВДАННЯ: Перевірка магічного квадрата === */
    void TaskMagicSquare() {
        int[][] matrix = inputMatrix();

        System.out.println("\nВведена матриця:");
        printMatrix(matrix);

        if (isMagicSquare(matrix)) {
            System.out.println("\nРезультат: Матриця Є магічним квадратом.");
        } else {
            System.out.println("\nРезультат: Матриця НЕ є магічним квадратом.");
        }
    }

    /* === Метод введення матриці === */
    int[][] inputMatrix() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть розмір квадратної матриці n: ");
        int n = sc.nextInt();

        int[][] m = new int[n][n];

        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = sc.nextInt();

        return m;
    }

    /* === Метод виведення матриці === */
    void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int v : row)
                System.out.print(v + "\t");
            System.out.println();
        }
    }

    /* === Головна перевірка магічності === */
    boolean isMagicSquare(int[][] m) {
        int n = m.length;

        // 1. Еталонна сума — сума першого рядка
        int targetSum = rowSum(m, 0);

        // 2. Перевірка рядків
        for (int i = 1; i < n; i++)
            if (rowSum(m, i) != targetSum)
                return false;

        // 3. Перевірка стовпців
        for (int j = 0; j < n; j++)
            if (colSum(m, j) != targetSum)
                return false;

        // 4. Перевірка головної діагоналі
        int diag1 = 0;
        for (int i = 0; i < n; i++)
            diag1 += m[i][i];
        if (diag1 != targetSum)
            return false;

        // 5. Перевірка побічної діагоналі
        int diag2 = 0;
        for (int i = 0; i < n; i++)
            diag2 += m[i][n - 1 - i];
        if (diag2 != targetSum)
            return false;

        return true; // усі перевірки пройдено
    }

    /* === Сума рядка === */
    int rowSum(int[][] m, int row) {
        int sum = 0;
        for (int v : m[row]) sum += v;
        return sum;
    }

    /* === Сума стовпчика === */
    int colSum(int[][] m, int col) {
        int sum = 0;
        for (int[] ints : m) sum += ints[col];
        return sum;
    }

    public static void main(String[] args) {
        new Lab5();
    }
}
