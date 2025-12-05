import java.util.Random;
import java.util.Scanner;

class Lab6 {

    int argc;

    // Конструктор без параметрів — емуляція командного рядка
    Lab6() {
        this(new Scanner(System.in).nextLine().split(" "));
    }

    // Конструктор з параметрами
    Lab6(String[] args) {

        argc = args.length;

        if (argc == 0) {
            printDescription();
            return;
        }

        for (int i = 0; i < argc; i++) {

            switch (args[i].toLowerCase()) {

                case "--rnd": // випадкові числа в одному рядку
                    if (argsCountCheck(i + 1, 1)) {
                        int count = parseInt(args[i + 1]);
                        if (count >= 0) {
                            printRandomInline(count);
                        }
                        i += 1;
                    }
                    break;

                case "--rndln": // випадкові числа кожне з нового рядка
                    if (argsCountCheck(i + 1, 1)) {
                        int count = parseInt(args[i + 1]);
                        if (count >= 0) {
                            printRandomNewline(count);
                        }
                        i += 1;
                    }
                    break;

                case "--help":
                default:
                    printDescription();
                    break;
            }
        }
    }

    // --- Виведення випадкових чисел в одному рядку ---
    void printRandomInline(int n) {
        Random rnd = new Random();
        System.out.print("\t");
        for (int i = 0; i < n; i++) {
            System.out.print(rnd.nextInt(100) + " ");
        }
        System.out.println();
    }

    // --- Виведення випадкових чисел кожне в новому рядку ---
    void printRandomNewline(int n) {
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            System.out.println("\t" + rnd.nextInt(100));
        }
    }

    // --- Перевірка кількості аргументів ---
    boolean argsCountCheck(int argPos, int count) {
        if ((argc - argPos) < count) {
            printDescription();
            return false;
        }
        return true;
    }

    // --- Перевірка integer ---
    int parseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("\tПомилка: \"" + s + "\" не є числом.");
            return -1;
        }
    }

    // --- Опис програми ---
    void printDescription() {
        System.out.println(
                "\nСинтаксис запуску програми:\n" +
                        "\n\tProgName <key> <count>\n" +
                        "\n<key> :=\n" +
                        "\t--rnd    \tвивести випадкові числа в одному рядку\n" +
                        "\t--rndln  \tвивести випадкові числа кожне в новому рядку\n" +
                        "\t--help   \tвивести цю підказку\n"
        );
    }

    // Статичний блок (як у зразку)
    static {
        System.out.println("Лабораторна робота №6:");
    }

    // --- Приклад роботи програми ---
    public static void main(String[] args) {
        new Lab6(new String[]{"--rnd", "5"});
        new Lab6(new String[]{"--rndln", "3"});
        new Lab6(new String[]{"--help"});
    }
}
